package com.sunbeam.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sunbeam.entities.Order;

public interface OrderDao extends JpaRepository<Order, Integer> {
	List<Order> findByUserMobile(String mobile);
	// find all orders of given company mobiles - using implicit join
	@Query("SELECT o FROM Order o WHERE o.mobile.company = ?1")
	List<Order> getCompanyOrder(String company);
	// find all orders of mobiles with given max price - using explicit join
	@Query("SELECT o FROM Order o JOIN o.mobile m WHERE m.price < ?1")
	List<Order> getMobileOrdersGivenMaxPrice(double maxPrice);
	// get customer mobile orders of a given company
	@Query("SELECT o FROM Order o JOIN o.user u JOIN o.mobile m WHERE u.id = ?1 AND m.company = ?2")
	//@Query("SELECT o FROM User u JOIN u.orderList o JOIN o.mobile m WHERE u.id = ?1 AND m.company = ?2")
	//@Query("SELECT o FROM Mobile m JOIN m.orderList o JOIN o.user u WHERE u.id = ?1 AND m.company = ?2") // possible only if mobile has orderList
	List<Order> getCustomerMobileOrderByCompany(int userId, String company);
}
