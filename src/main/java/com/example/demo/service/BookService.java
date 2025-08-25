package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDao;
import com.example.demo.model.Books;


@Service
public class BookService {

	
	@Autowired
	BookDao dao;
	//private static List<Books> list = new ArrayList<>();
	
	
	/*static {
	list.add(new Books(1,"Time machine","premchand"));
	list.add(new Books(2,"young girl","anni frank"));
	
	}*/
	
	
	//get all books
	public List<Books> getAll(){
		return dao.findAll();
	};
	
	//by id
	public Books getBookbyId(int id) {
		
		return dao.findById(id);
		
	}

	
	//adding the book
	
	public Books addBook(Books b) {
		return dao.save(b);	
	}
	
	
	//delete the book
	
	
	public String deleteBook(int id) {
dao.deleteById(id);
		return "Book deleted";
	}
	

	
}
