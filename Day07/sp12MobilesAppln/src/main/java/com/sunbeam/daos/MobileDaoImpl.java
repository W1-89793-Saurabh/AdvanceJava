package com.sunbeam.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sunbeam.entity.Mobile;

public class MobileDaoImpl implements MobileDao {
	
	private MoblieRowMapper RowMapper; 
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Mobile findById(int id) {
		String sql = "Select * from mobiles where id =?";
		List<Mobile> list = jdbcTemplate.query(sql, RowMapper, id);
		return list.isEmpty() ? null : list.get(0);
	}

}
