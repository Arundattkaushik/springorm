package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

import jakarta.transaction.Transactional;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	
	//save student object in database
	@Transactional
	public int insert(Student student) {
		Integer result = (Integer) this.hibernateTemplate.save(student);
		return result;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
