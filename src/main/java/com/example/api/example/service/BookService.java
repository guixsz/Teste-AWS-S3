package com.example.api.example.service;

import com.example.api.example.domain.Book;
import com.example.api.example.feign.BookClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookClient bookClient;

    public BookService(BookClient client){
        this.bookClient = client;
    }
    public List<Book> getBooksFromLibrary(){
        return this.bookClient.getBook();
    }
}
