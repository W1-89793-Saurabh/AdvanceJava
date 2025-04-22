package com.sunbeam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.daos.MobileDao;
import com.sunbeam.daos.OrderDao;
import com.sunbeam.daos.UserDao;
import com.sunbeam.entities.Mobile;
import com.sunbeam.entities.Order;
import com.sunbeam.entities.User;
import com.sunbeam.pojos.NewOrder;

@Transactional
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private MobileDao mobileDao;
	
	public Order saveOrder(NewOrder newOrder) {
		User user = userDao.findById(newOrder.getUserId()).orElse(null);
		Mobile mobile = mobileDao.findById(newOrder.getMobileId()).orElse(null);
		Order order = new Order(0, user, mobile);
		Order dbOrder = orderDao.save(order);
		return dbOrder;
	}
	
	@Override
	public Order getOrderById(int orderId) {
		Optional<Order> optOrder = orderDao.findById(orderId);
		return optOrder.get();
	}
	
	@Override
	public List<Order> getOrdersByUserMobile(String mobile) {
		return orderDao.findByUserMobile(mobile);
	}
	
	@Override
	public List<Order> getOrdersByMobileMaxPrice(double maxPrice) {
		return orderDao.getMobileOrdersGivenMaxPrice(maxPrice);
	}
}
