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
import com.sunbeam.entities.Category;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryDao categoryRepo;

    @GetMapping
    public List<Category> getAll() {
        return categoryRepo.findAll();
    }

    @PostMapping
    public Category create(@RequestBody Category category) {
        return categoryRepo.save(category);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> get(@PathVariable Integer id) {
        return categoryRepo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> update(@PathVariable Integer id, @RequestBody Category updated) {
        return categoryRepo.findById(id).map(existing -> {
            existing.setTitle(updated.getTitle());
            existing.setDescription(updated.getDescription());
            return ResponseEntity.ok(categoryRepo.save(existing));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        categoryRepo.deleteById(id);
    }
}
