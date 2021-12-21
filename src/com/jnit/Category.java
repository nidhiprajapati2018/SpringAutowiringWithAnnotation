package com.jnit;

import org.springframework.beans.factory.annotation.Autowired;

public class Category {

	private String CategoryName;
	
	@Autowired
	private Book database;
	
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public Book getDatabase() {
		return database;
	}
	public void setDatabase(Book database) {
		this.database = database;
	}
	
	
}
