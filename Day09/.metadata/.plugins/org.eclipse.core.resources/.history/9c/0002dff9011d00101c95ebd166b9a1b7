package com.sunbeam.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="users")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class User {
	@Id
	private int id;
	@Column(name = "mname")
	private String name;
	private String email;
	private String password;
	private String moblie;
}
