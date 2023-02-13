package org.tnsif.dao;


import java.util.List;

import org.tnif.entities.Book;

public interface BookDao {
	
	//abstract method
	Book getBookById(int id);
	List<Book>getAllBooks();
	List<Book>getAuthorBooks(String author);
	Long getBooksCount();
	List<Book>getBookByPrice(int low,int high);

}
