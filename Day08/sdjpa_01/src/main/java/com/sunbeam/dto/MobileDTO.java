package com.sunbeam.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class MobileDTO {
//	 	@NotBlank(message = "Name cannot be blank")
	    private String name;
//	    @Positive(message = "RAM must be a positive value")
	    private Integer ram;
//	    @Positive(message = "Storage must be a positive value")
	    private Integer storage;
	    private String company;
//	    @Positive(message = "Price must be a positive value")
	    private Double price;
	    private String image;
}
