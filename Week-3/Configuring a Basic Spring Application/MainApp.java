package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;
import com.library.repository.BookRepository;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BookService bookService=(BookService)context.getBean("bookService");
		bookService.displayBook();
		
		BookRepository bookRepository=(BookRepository)context.getBean("bookRepository");
		bookRepository.saveBook();
	}

}
