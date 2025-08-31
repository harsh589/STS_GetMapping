package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="author_table")
public class author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
int authorId;
String authorName;




public author() {
	super();
}
public author(int authorId, String authorName) {
	super();
	this.authorId = authorId;
	this.authorName = authorName;
}
public int getAuthorId() {
	return authorId;
}
public void setAuthorId(int authorId) {
	this.authorId = authorId;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}


}
