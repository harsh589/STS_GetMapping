package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Books;
import com.example.demo.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bs;

	@GetMapping("/book")
	public ResponseEntity<List<Books>> getBook() {
		List<Books> book = bs.getAll();
		if (book.isEmpty()) {
			return (ResponseEntity<List<Books>>) ResponseEntity.status(HttpStatus.NOT_FOUND);
		}
		return ResponseEntity.ok(book);

	}

	@GetMapping("/book/{id}")
	public Books getByid(@PathVariable int id) {
		return bs.getBookbyId(id);
	}

	@PostMapping("/add")
	public ResponseEntity<Books> addBook(@RequestBody Books b) {

		Books createdbook = bs.addBook(b);

		return ResponseEntity.ok(createdbook);

	}

	@DeleteMapping("/delete/{id}")
	public String deletebook(@PathVariable int id) {
		return bs.deleteBook(id);
	}

}
