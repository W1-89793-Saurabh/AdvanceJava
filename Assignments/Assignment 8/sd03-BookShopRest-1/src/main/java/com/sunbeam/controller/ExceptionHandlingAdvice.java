package com.sunbeam.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionHandlingAdvice {
	
	@ExceptionHandler

      public ResponseUtil<?> handleException(Throwable ex){
		return ResponseUtil.apierror(ex.getMessage());
	}


}