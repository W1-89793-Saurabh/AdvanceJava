package com.sunbeam.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class NewOrder {
	@JsonProperty("uid")
	private int userId;
	@JsonProperty("mid")
	private int mobileId;
}
