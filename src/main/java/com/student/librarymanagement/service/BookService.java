package com.student.librarymanagement.service;

import com.student.librarymanagement.entity.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Book book);

    List<Book> getBookList();
}
