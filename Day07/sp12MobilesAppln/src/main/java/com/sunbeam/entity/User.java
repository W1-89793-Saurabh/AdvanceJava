package com.sunbeam.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class User {	
	 private int id;
	 @JsonProperty("mname")
	 private String name;
	 private String email;
	 private String password;
	 private String mobile;

}
