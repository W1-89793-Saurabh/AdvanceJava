package com.sunbeam;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
/*
DELIMITER $$

CREATE PROCEDURE sp_getbookprice(IN bId INT, OUT bPrice DOUBLE)
BEGIN
	SELECT price INTO bPrice FROM books WHERE id = bId;
END;
$$

DELIMITER ;

CALL sp_getbookprice(12, @price);
SELECT @price;*/



public class appln05 {

	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/dmcdb";
	public static final String DB_USER = "dmc";
	public static final String DB_PASSWD = "dmc";
	
	static {
		try {
			// load and register driver
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		int bookId = 12; // may input from user (using Scanner)
		double bookPrice = 0;
		// create connection
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			// create statement
			String sql = "CALL sp_getbookprice(?, ?)";
			try(CallableStatement stmt = con.prepareCall(sql)) {
				// execute query and process result
				stmt.setInt(1, bookId);							// set value of IN params
				stmt.registerOutParameter(2, Types.DOUBLE);		// register OUT params
				stmt.execute(); // execute sp and return true if result in a resultset (rows & cols); else return false.
				bookPrice = stmt.getDouble(2);					// get value of OUT params
				System.out.println("Book Price: " + bookPrice);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
