package com.sunbeam.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Order {
	private int id;
	@JsonProperty("uid")
	private int userId;
	@JsonProperty("mid")
	private int mobileId;
}
