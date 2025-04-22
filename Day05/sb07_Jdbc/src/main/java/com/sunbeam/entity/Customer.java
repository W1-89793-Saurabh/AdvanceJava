package com.sunbeam.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Customer {
	private int id;
	private String name;
	private String password;
	private String email;
	private String mobile;
	private String address;
	private Date birth;
}
