package com.tali.books.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tali.books.models.Book;

public interface BookReposty extends CrudRepository<Book, Long> {

}
