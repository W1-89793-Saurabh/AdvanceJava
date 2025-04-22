package com.sunbeam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.daos.CategoryDao;
import com.sunbeam.daos.ProductDao;
import com.sunbeam.entities.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductDao productRepo;

    @Autowired
    private CategoryDao categoryRepo;

    @GetMapping
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productRepo.save(product);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> get(@PathVariable Integer id) {
        return productRepo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Integer id, @RequestBody Product updated) {
        return productRepo.findById(id).map(existing -> {
            existing.setName(updated.getName());
            existing.setPrice(updated.getPrice());
            existing.setCategory(updated.getCategory());
            return ResponseEntity.ok(productRepo.save(existing));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        productRepo.deleteById(id);
    }
}
