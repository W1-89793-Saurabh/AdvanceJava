package com.sunbeam.services;

import java.util.List;

import com.sunbeam.entities.Order;
import com.sunbeam.pojos.NewOrder;

public interface OrderService {
	 Order saveOrder(NewOrder newOrder);
	Order getOrderById(int orderId);
	List<Order> getOrdersByUserMobile(String mobile);
	List<Order> getOrdersByMobileMaxPrice(double maxPrice);
}
