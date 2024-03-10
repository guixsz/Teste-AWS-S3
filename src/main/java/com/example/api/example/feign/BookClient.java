package com.example.api.example.feign;

import com.example.api.example.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "books-api-gui", url = "https://books-api-gui.s3.us-east-2.amazonaws.com")
public interface BookClient {

    @GetMapping("/Books.json")
    List<Book> getBook();
}
