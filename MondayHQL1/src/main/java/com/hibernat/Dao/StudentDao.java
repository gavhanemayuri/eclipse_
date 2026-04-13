package com.hibernat.Dao;

import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernat.model.Student;

//repository to mark entity
@Repository
@Transactional
public class StudentDao {
	
	@Autowired
	SessionFactory sessionfactory;

	public void registerdata(Student s1) {

		sessionfactory.getCurrentSession().persist(s1);		
		
	}

}