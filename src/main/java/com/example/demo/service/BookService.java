package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Books;


@Service
public class BookService {

	private static List<Books> list = new ArrayList<>();
	
	
	static {
	list.add(new Books(1,"Time machine","premchand"));
	list.add(new Books(2,"young girl","anni frank"));
	
	}
	
	
	//get all books
	public List<Books> getAll(){
		return list;
	};
	
	//by id
	public Books getBookbyId(int id) {
		for(Books book: list) {
			if(book.getId()==id) {
				return book;
			}
		}
		return null;
		
	}
	
	//by name
	
	public  Books getBookbyName(String name) {
		for(Books book:list) {
			if(book.getName()==name) {
				return book;
			}
		}
		return null;
	}
	
	
	
}
