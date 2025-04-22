package com.sunbeam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
	@Repository
	public class CustomersImpl implements CustomerDao {
	@Autowired
	private RowMapper<Customers> custRowMapper;
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public int save(Customers cust) {
		String sql = "INSERT INTO customers(id, name, password, email, mobile, address, birth) VALUES (?, ?, ?, ?, ?, ?, ?)";
		int count=jdbc.update(sql,cust.getId(),cust.getName(),cust.getPassword(),cust.getEmail(),cust.getMobile(),cust.getAddress(),cust.getBirth());
		return 0;
	}

	@Override
	public int changePassword(int custId, String password) {
		String sql="UPDATE customers SET password=? WHERE id=?";
		
		
		int count=jdbc.update(sql,password,custId);
		return count;
	}

	@Override
	public Customers findByEmail(String email) {
		String sql = "SELECT * FROM customers WHERE email = ?";
		List<Customers> list = jdbc.query(sql, custRowMapper, email);
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public int update(Customers c) {
		String sql="update customers set name=?, password=?,mobile=? ,address=?,email=?,birth=? where id=?";
		int count=jdbc.update(sql,c.getName(),c.getPassword(),c.getMobile(),c.getAddress(),c.getEmail(),c.getBirth(),c.getId());
		return count;
	}

	@Override
	public int deleteById(int id) {
		String sql = "DELETE FROM Customers WHERE id=?";
		int count=jdbc.update(sql,id);
		return count;
	}

	@Override
	public List<Customers> findAll() {
		String sql="Select * from customers ";
		List<Customers>list=jdbc.query(sql, custRowMapper);
		return list;
	}
	

}
