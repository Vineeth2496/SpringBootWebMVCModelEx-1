package com.SpringBootWebMVC.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
	private Integer stdId;
	private String stdName;
	private Double stdFee;
}
