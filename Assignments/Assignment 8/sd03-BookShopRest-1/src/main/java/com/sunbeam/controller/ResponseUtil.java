package com.sunbeam.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@JsonInclude (Include.NON_NULL)
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class ResponseUtil <T>{
	
	private String status;
	private String message;
	private T data;
	
	
	
	public static <T>ResponseUtil<T> apiSuccess(T data){		
		ResponseUtil<T> result = new ResponseUtil<T>("succes",null,data);
		return result;
	}
	
	public static <T>ResponseUtil<T> apierror(String message){		
		ResponseUtil<T> result = new ResponseUtil<T>("error",message,null);
		return result;
	}
	
	
	
	

}
