package com.tali.books.services;



import java.util.List;

import org.springframework.stereotype.Service;

import com.tali.books.models.Book;
import com.tali.books.repositories.BookReposty;

@Service
public class BookService {
	private BookReposty bookRepository;
    public BookService(BookReposty bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> allBooks() {
    		return (List<Book>) bookRepository.findAll();
    }

    public Book findBookById(Long id) {
        return bookRepository.findOne(id);
    }

	public void addBook(Book book) {
		bookRepository.save(book);
	}

	public void updateBook(Book book) {
        bookRepository.save(book);
    }

	public void destroyBook(Long id) {
        bookRepository.delete(id);
    }
		
}
