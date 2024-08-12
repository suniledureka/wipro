package com.wipro.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.wipro.library.entity.Book;

public interface LibraryRepository extends CrudRepository<Book, Integer> {

}
