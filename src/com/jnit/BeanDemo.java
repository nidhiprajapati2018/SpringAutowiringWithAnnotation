package com.jnit;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@Configuration
public class BeanDemo {

	@Bean(name="database")
	public Book db() {
		//Student s = new Student();
		Book ja=new Book();
		ja.setBookName("MySql");
		ja.setBookPrice(600);
		ja.setBookAuthor("Microsoft");
		return ja;
	}
	
	@Bean(name="cat")
	public Category getCategory() {
		Category c = new Category();
		c.setCategoryName("DDL DML");
		return c;
	}
}
