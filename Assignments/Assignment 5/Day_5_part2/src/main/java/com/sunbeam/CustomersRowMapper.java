package com.sunbeam;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class CustomersRowMapper implements RowMapper<Customers>{

	@Override
	public Customers mapRow(ResultSet rs, int rowNum) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String password = rs.getString("password");
		String email = rs.getString("email");
		String mobile = rs.getString("mobile");
		String address = rs.getString("address");
		Date birth = rs.getDate("birth");
		return new Customers(id, name, password, email, mobile, address, birth);
	}

}
