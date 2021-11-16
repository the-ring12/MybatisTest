package com.the_ring.controller;

import com.the_ring.domain.Book;
import com.the_ring.service.AdminService;
import com.the_ring.service.BookService;
import com.the_ring.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Test {

    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }



    @RequestMapping("/test")
    public String testMybatis() {
        List<Book> allBooks = bookService.getAllBooks();
        for (Book allBook : allBooks) {
            System.out.println(allBook);
        }
        return "success";
    }
}
