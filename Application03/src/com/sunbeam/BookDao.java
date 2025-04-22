package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao implements AutoCloseable {
	
	private Connection con;
	
	
	
	public BookDao() throws Exception {
	con = DbUtil.getConnection();
	}
	
	public void close() throws Exception {
		if(con != null)
			con.close();

	}
	
	
	
	List<Book> findAllbooks() throws Exception {
		List<Book> list = new ArrayList<Book>();
		
		String sql = "Select * from books";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery(sql)){
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String author = rs.getString("author");
					String subject = rs.getString("subject");
					double price = rs.getDouble("price");
					Book b = new Book(id, name, author, subject, price);
					list.add(b);
				}
			}
		} return list;
	}
	
	public int createbook(Book b) throws Exception {
		String sql = "Insert into books(id,name,author,subject,price) values(?,?,?,?,?)";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, b.getId());
			stmt.setString(2,b.getName());
			stmt.setString(3, b.getAuthor());
			stmt.setString(4, b.getSubject());
			stmt.setDouble(5, b.getPrice());
			int count = stmt.executeUpdate();
			return count;
		}

	}

	public int updatebook(Book b) throws Exception {
		String sql = "update books set name = ?, auther = ?, subject = ?, price = ? where id = ?";
	try(PreparedStatement stmt = con.prepareStatement(sql)){
		stmt.setString(1, b.getName());
		stmt.setString(2, b.getAuthor());
		stmt.setString(3, b.getSubject());
		stmt.setDouble(4, b.getPrice());
		stmt.setInt(5, b.getId());
		int count = stmt.executeUpdate();
		return count;
		}
	}
	
	public Book findById(int bookId) throws Exception {
		// create statement
		String sql = "SELECT * FROM books WHERE id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			// execute query and process result
			stmt.setInt(1, bookId);
			try(ResultSet rs = stmt.executeQuery()) {
				if(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String author = rs.getString("author");
					String subject = rs.getString("subject");
					double price = rs.getDouble("price");
					Book b = new Book(id, name, author, subject, price);
					return b;
				}
			} // rs.close();
		} // stmt.close();
		return null;
	}

	
	public int deleteById(int bookId) throws SQLException {
		String sql = "delete from books where id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, bookId);
			int count = stmt.executeUpdate();
			return count;
		}
		
	}
	
	
	public Book findBookBySubject(String bookSubject) throws Exception {
		// create statement
		String sql = "SELECT * FROM books WHERE subject = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			// execute query and process result
			stmt.setString(1, bookSubject);
			try(ResultSet rs = stmt.executeQuery()) {
				if(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String author = rs.getString("author");
					String subject = rs.getString("subject");
					double price = rs.getDouble("price");
					Book b = new Book(id, name, author, subject, price);
					return b;
				}
			} // rs.close();
		} // stmt.close();
		return null;
	}
	
	
	
	
	
}
