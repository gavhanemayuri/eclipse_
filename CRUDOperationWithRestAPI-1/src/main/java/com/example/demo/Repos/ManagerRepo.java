package com.example.demo.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Manager;

public interface ManagerRepo extends JpaRepository<Manager,String>

{

	
}
