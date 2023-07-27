package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Books")
public class Models2 {
	@Id
	
	private long id;
	private String title;
	private String author;
	private String genre;
	private int year;
	
	public Models2(long id, String title, String author, String genre, int year) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.year = year;
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Models2 () {
	
	}

}
