package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcApp1 {
	
	public static void main(String[] args) throws Exception {
		// load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// create jdbc connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dmcdb", "dmc", "dmc");
		// create statement
		String sql = "INSERT INTO books VALUES (?, ?, ?, ?, ?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		// execute query and process result
		Scanner sc = new Scanner(System.in);
		System.out.print("enter id: ");
		int id = sc.nextInt();
		System.out.print("enter name: ");
		String name = sc.next();
		System.out.print("enter author: ");
		String author = sc.next();
		System.out.print("enter subject: ");
		String subject = sc.next();
		System.out.print("enter price: ");
		double price = sc.nextDouble();
		stmt.setInt(1, id);
		stmt.setString(2, name);
		stmt.setString(3, author);
		stmt.setString(4, subject);
		stmt.setDouble(5, price);
		int count = stmt.executeUpdate();
		System.out.println("Rows affected (inserted): " + count);
		// close all
		stmt.close();
		con.close();
	}
	
	public static void main3(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dmcdb","dmc","dmc");
		String sql = "Select * from books where price > ? ";
		PreparedStatement stmt = con.prepareStatement(sql);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter min price: ");
		String minPrice = sc.nextLine();
		stmt.setString(1,minPrice);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) { 
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String author = rs.getString("author");
			String subject = rs.getString("subject");
			double price = rs.getDouble("price");
			System.out.printf("%d, %s, %s, %s, %.2f \n",id, name, author, subject, price);
		}
		rs.close();
		stmt.close();
		con.close();
	}
	

	public static void main2(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dmcdb","dmc","dmc");
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter min price: ");
		String minPrice = sc.nextLine();
		String sql = "Select * from books where price > "+ minPrice;
		System.out.println("Executing sql: "+ sql);
//		String sql = "Select * from books";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) { 
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String author = rs.getString("author");
			String subject = rs.getString("subject");
			double price = rs.getDouble("price");
			System.out.printf("%d, %s, %s, %s, %.2f \n",id, name, author, subject, price);
		}
		rs.close();
		stmt.close();
		con.close();
	}

	public static void main1(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dmcdb","dmc","dmc");
		Statement stmt = con.createStatement();
		String sql = "Select * from books";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) { 
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String author = rs.getString("author");
			String subject = rs.getString("subject");
			double price = rs.getDouble("price");
			System.out.printf("%d, %s, %s, %s, %.2f \n",id, name, author, subject, price);
		}
		rs.close();
		stmt.close();
		con.close();
	}
	
	
}
