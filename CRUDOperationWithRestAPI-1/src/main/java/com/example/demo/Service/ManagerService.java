package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Manager;

public interface ManagerService
{

	public String registermanager(Manager m1);

	public List<Manager>getall();
	
	public Manager getsingleinfo(String id);
	
	public String del(String id);

}
