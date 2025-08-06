package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Books;
import com.example.demo.service.BookService;

@RestController
public class BookController {
	
	
	@Autowired
	BookService bs;
	
	@GetMapping("/book")
	public List<Books> getBook() {	
		return bs.getAll();
		
		
	}
	
	
	@GetMapping("/book/{id}")
	public Books getByid(@PathVariable int id) {
		return bs.getBookbyId(id);
	}

	
	
	
}
