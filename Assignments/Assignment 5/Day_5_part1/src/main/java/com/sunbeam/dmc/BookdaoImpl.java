package com.sunbeam.dmc;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository
public class BookdaoImpl implements BookDao{
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Autowired
	private RowMapper<Book> BookRowmapper;
	
	@Override
	public int save(Book b) {
		String sql="Insert into books values(?,?,?,?,?)";
		int count=jdbctemplate.update(sql,b.getId(),b.getName(),b.getAuthor(),b.getSubject(),b.getPrice());
		return count;
	}

	@Override
	public int update(Book b) {
		String sql = "UPDATE books SET name=?, author=?, subject=?, price=? WHERE id=?";
		int count=jdbctemplate.update(sql,b.getName(),b.getAuthor(),b.getSubject(),b.getPrice(),b.getId());
		return count;
	}

	@Override
	public int deleteById(int id) {
		String sql = "DELETE FROM books WHERE id=?";
		int count=jdbctemplate.update(sql,id);
		return count;
	}

	@Override
	public List<Book> findAll() {
		String sql="select * from books";
		List<Book> list=jdbctemplate.query(sql,BookRowmapper);
		return list;

	}

	@Override
	public List<Book> findBySubject(String subject) {
		String sql = "SELECT * FROM books WHERE subject = ?";
		List<Book> list=jdbctemplate.query(sql,BookRowmapper,subject);
		return list;
	}

	@Override
	public Book findById(int bookId) {
		String sql = "SELECT * FROM books WHERE id = ?";

		List<Book>list=jdbctemplate.query(sql, BookRowmapper,bookId);
		return list.isEmpty()?null:list.get(0);
	}

}
