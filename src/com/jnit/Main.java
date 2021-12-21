package com.jnit;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanDemo.class);
		
		Category x = (Category)appContext.getBean("cat");
		System.out.println("CategoryName="+x.getCategoryName());
		Book b=x.getDatabase();
		System.out.println(b.getBookName()+" "+b.getBookPrice()+" "+b.getBookAuthor());

	}

}
