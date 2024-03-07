package com.SpringBootWebMVC.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringBootWebMVC.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	@GetMapping("/show")
	public String showData(Model model) {
		System.out.println(model.getClass().getName());
		/*
		//--- primitive data---
		model.addAttribute("stdId", 500);
		model.addAttribute("stdName", "AJAY");
		model.addAttribute("stdFee", 300.02);
		*/
		/*
		//--- Object data---
		Student s=new Student();
		s.setStdId(101);
		s.setStdName("SAM");
		s.setStdFee(8500.0);
		// Key , val
		model.addAttribute("sob", s);
		*/
		
		List<Student> list=Arrays.asList(
					new Student(101,"A", 200.00),
					new Student(102,"B", 400.00),
					new Student(103,"C", 800.00),
					new Student(104,"D", 600.00)
				);
		
		//Key, 
		model.addAttribute("list", list);
		
		return "StudentData";
	}
}
