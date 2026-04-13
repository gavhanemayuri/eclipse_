package com.hibernat;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hibernat.Dao.StudentDao;
import com.hibernat.model.Student;

@Controller
public class SellerController
{

	@Autowired
	StudentDao sd;
	@RequestMapping("/RegisterPage")
	public String one()
	{
		return "register";
	}
	
	//SavestudentInfo
	@RequestMapping("/SavestudentInfo")
	public String SavestudentInfo(@ModelAttribute Student s1)
	{
		sd.registerdata(s1);
		return "redirect:/display";
	}
	
	

}
