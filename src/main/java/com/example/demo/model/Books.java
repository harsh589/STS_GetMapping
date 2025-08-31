package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bookstore")
public class Books {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	

	@OneToOne(cascade = CascadeType.ALL)
	private author author;
	
	
	
	public Books() {
	}



	public Books(int id, String name, author author){
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public author getAuthor() {
		return author;
	}



	public void setAuthor(author author) {
		this.author = author;
	}



	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", author=" + author + "]";
	}




	
	
	
	
}
