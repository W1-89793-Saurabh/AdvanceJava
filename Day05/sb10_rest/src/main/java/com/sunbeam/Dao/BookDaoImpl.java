package com.sunbeam.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sunbeam.entity.Book;

@Repository
public class BookDaoImpl implements BookDao {

		@Autowired
		private JdbcTemplate jdbcTemplate;
		@Autowired
		private RowMapper<Book> bookRowMapper;
		
		@Override
		public int save(Book b) {
			String sql = "INSERT INTO books(id, name, author, subject, price) VALUES (?, ?, ?, ?, ?)";
			int count = jdbcTemplate.update(sql, b.getId(), b.getName(), b.getAuthor(), b.getSubject(), b.getPrice());
			return count;
		}

		@Override
		public int update(Book b) {
			String sql = "UPDATE books SET name=?, author=?, subject=?, price=? WHERE id=?";
			int count = jdbcTemplate.update(sql, b.getName(), b.getAuthor(), b.getSubject(), b.getPrice(), b.getId());
			return count;
		}

		@Override
		public int deleteById(int id) {
			String sql = "DELETE FROM books WHERE id=?";
			int count = jdbcTemplate.update(sql, id);
			return count;
		}
		
		public List<Book> findAll() {
			String sql = "SELECT * FROM books";
			List<Book> list = jdbcTemplate.query(sql, bookRowMapper);
			return list;
		}
		
		public List<Book> findBySubject(String subject) {
			String sql = "SELECT * FROM books WHERE subject = ?";
			List<Book> list = jdbcTemplate.query(sql, bookRowMapper, subject);
			return list;
		}
		
		public Book findById(int bookId) {
			String sql = "SELECT * FROM books WHERE id = ?";
			List<Book> list = jdbcTemplate.query(sql, bookRowMapper, bookId);
			return list.isEmpty() ? null : list.get(0);		
		}

		@Override
		public int updatePrice(int id, double newPrice) {
			String sql = "UPDATE books SET price = ? WHERE id = ?";
			int count = jdbcTemplate.update(sql, newPrice, id);
			return count;
		}
}
