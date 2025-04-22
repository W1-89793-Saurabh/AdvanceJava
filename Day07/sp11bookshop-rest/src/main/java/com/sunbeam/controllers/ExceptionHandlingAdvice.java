package com.sunbeam.controllers;

public class ExceptionHandlingAdvice {
	
	public ResponseUtil<?> haldleException(Throwable ex){
		return ResponseUtil.apiError(ex.getMessage());
		
	}
}
