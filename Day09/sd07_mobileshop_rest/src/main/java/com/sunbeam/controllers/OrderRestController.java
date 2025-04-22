package com.sunbeam.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.entities.Order;
import com.sunbeam.pojos.NewOrder;
import com.sunbeam.services.OrderService;

@RequestMapping("/orders")
@RestController
public class OrderRestController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/{id}")
	public ResponseUtil<Order> findOrderById(@PathVariable("id") int orderId) {
		Order ord = orderService.getOrderById(orderId);
		return ResponseUtil.apiSuccess(ord);
	}

	@PostMapping("")
	public ResponseUtil<?> placeOrder(@RequestBody NewOrder newOrder) {
		Order order = orderService.saveOrder(newOrder);
		return ResponseUtil.apiSuccess(order);
	}
	
	@GetMapping("/byusermobile/{mobile}")
	public ResponseUtil<?> getOrdersByUserMobile(@PathVariable("mobile") String mobile) {
		List<Order> list = orderService.getOrdersByUserMobile(mobile);
		return ResponseUtil.apiSuccess(list);
	}
	
	@GetMapping("/bymobilemaxprice/{price}")
	public ResponseUtil<?> getOrdersByMobileMaxPrice(@PathVariable("price") double price) {
		List<Order> list = orderService.getOrdersByMobileMaxPrice(price);
		return ResponseUtil.apiSuccess(list);
	}
}
