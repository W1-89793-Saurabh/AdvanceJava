package com.sunbeam.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Customer {
	private int id;
	private String name;
	private String password;
	private String mobile;
	private String address;
	private String email; 
	private Date birth;
}
