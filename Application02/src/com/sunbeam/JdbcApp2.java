package com.sunbeam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcApp2 {
	
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/dmcdb";
	public static final String DB_USER = "dmc";
	public static final String DB_PASSWD = "dmc";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static void displayAllCustomers() {
		
		try {Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
			String sql = "Select * from customers";
			
			try(PreparedStatement stmt = con.prepareStatement(sql)){
				
				try(ResultSet rs = stmt.executeQuery()){
					while(rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String passwd = rs.getString("password");
						String email = rs.getString("email");
						String mobile = rs.getString("mobile");
						String addr = rs.getString("address");
						Date birth = rs.getDate("birth");
						System.out.printf("%d, %s, %s, %s, %s, %s, %s\n",id, name, passwd, email, mobile, addr, birth);
					}
				}
					
		}
			
		} // con close 
		
		catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	public static void updatePassword() {
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)){
			String sql = "update customers set password = ? where email = ?";
			try(PreparedStatement stmt = con.prepareStatement(sql)){
				Scanner sc = new Scanner(System.in);
				System.out.print("enter email: ");
				String email = sc.nextLine();
				System.out.print("enter new passwd: ");
				String passwd = sc.nextLine();
				// execute query & process result
				stmt.setString(1, passwd);
				stmt.setString(2, email);
				int count = stmt.executeUpdate();
				System.out.println("Password updated: " + count);
			}
		}
	
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
//		displayAllCustomers();
		updatePassword();
	}
	

}
