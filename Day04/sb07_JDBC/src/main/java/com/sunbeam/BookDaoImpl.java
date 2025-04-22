package com.sunbeam;

//import java.sql.JDBCType;
//import java.util.List;
//import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;




public class BookDaoImpl implements BookDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	@Autowired 
//	private BookRowMapper bookRowMapper;
	
	public int save(Book b) {
		String sql = "Insert into books values(?,?,?,?,?)";
		int count = jdbcTemplate.update(sql, b.getId(), b.getName(), b.getAuthor(), b.getSubject(), b.getPrice());
		return count;
	}
	
//	public List<Category> findAll() {
//		String sql = "Select * from books";
//		List<Category> list = jdbcTemplate.query(sql, bookRowMapper);
//		return list;
//	}

}
