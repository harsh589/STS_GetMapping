package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Books;

public interface BookDao extends JpaRepository<Books,Integer>{
	
	public Books findById(int id);
}
