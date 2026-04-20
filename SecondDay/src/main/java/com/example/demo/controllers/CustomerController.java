package com.example.demo.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Dao.CustomerDao;
import com.example.demo.Model.Customer;

@Controller
public class CustomerController

{
	
	@Autowired
	CustomerDao cd;
	
	
@RequestMapping("/")
public String one()
{
	return "index";
}
	@RequestMapping("/xyz")
	public String xyz()
	
	{
		return "contact";
	}
	
	@RequestMapping("/SavecustomerData")
	public String SavecustomerData(@ModelAttribute Customer c1)
	
	{
		System.out.println(c1);	
		
		c1.setSid(UUID.randomUUID().toString());
		
		cd.registerdata(c1);
		
		return null;
	}
	
}
