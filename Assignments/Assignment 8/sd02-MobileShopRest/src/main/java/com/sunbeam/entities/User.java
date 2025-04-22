package com.sunbeam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name="users")

public class User {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	int id ;
	private String uname;
	private String email;
	private String password;
	private String mobile;
	
}
