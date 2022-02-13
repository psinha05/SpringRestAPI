package com.ps.springrest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@Column(name="book_name")
	private String bookName;
	
	Author() {
		
	}
	
	
	public Author(int id, String name, String bookName) {
		super();
		this.id = id;
		this.name = name;
		this.bookName = bookName;
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
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", bookName=" + bookName + "]";
	}
	
	

}
