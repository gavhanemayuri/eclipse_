package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repos.ManagerRepo;
import com.example.demo.Service.ManagerService;

import com.example.demo.model.Manager;

@Service    //it is a class level annotetion


public class ManagerDao implements ManagerService {
	
	@Autowired
	ManagerRepo mr;

	@Override
	public String registermanager(Manager m1) {
		
		
		mr.save(m1);
		return "Record Saved";
	}

	@Override
	public List<Manager> getall() {
	
		
		return mr.findAll();
	}

	@Override
	public Manager getsingleinfo(String id) {
		
		return mr.findById(id).orElse(null);
	}

	@Override
	public String del(String id) {
		mr.deleteById(id);
		return "Record Delected";
	}

}


