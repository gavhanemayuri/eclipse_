package com.example.demo.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ManagerService;
import com.example.demo.model.Manager;

@RestController
@RequestMapping ("/Manager")
public class ManagerController

{

	@Autowired
	ManagerService ms;
	
	@GetMapping("/display")
	public String get()
	{
		
	return "This is my first API !";
}
	
	@GetMapping("/display/{id}")
	public int two(@PathVariable int id)
	{
		int x=id+id;
		return x;
	}
	
	@PostMapping("/Save")
	public String three(@RequestBody Manager m1)
	{
		
		m1.setMid(UUID.randomUUID().toString());
		String x= ms.registermanager(m1);
		return x;
	}

	//getmappping//get all manager info
	
	@GetMapping("/fetchall")
	public List<Manager> four()
	{
		List<Manager>l1= ms.getall();
		return l1;
	}
	
	//get mapping info with given id
	
	@GetMapping("/{id}")
	public Manager five( @PathVariable String id)
	{
		
		Manager mk=ms.getsingleinfo(id);
		return mk;
	}
	
	//deletemapping
	
	@DeleteMapping("/{id}")
	public String six(@PathVariable String id)
	{
		String x=ms.del(id);
		return x;
	}
	
	//update 
	@PutMapping("/upadatedata/{id}")
	public String saven(@RequestBody Manager m1,@PathVariable String id)
	{
		
		
		Manager mk=ms.getsingleinfo(id);
	
		if(m1.getMname()!=null)mk.setMname(m1.getMname());
		if(m1.getMemail()!=null)mk.setMemail(m1.getMemail());
		if(m1.getMpass()!=null)mk.setMpass(m1.getMpass());
		
		ms.registermanager(mk);
		
		return "record updatedata";
	}
	
}