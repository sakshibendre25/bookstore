package com.sakshi.bookstore.controller;

import com.sakshi.bookstore.entity.Book;
import com.sakshi.bookstore.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyBookController {

    @Autowired
    private MyBookListService myBookListService;

    @RequestMapping("/deleteMyList/{id}")
   public String deleteMyList(@PathVariable("id") int id) {
        myBookListService.deleteById(id);
       return "redirect:/my_books";
   }


   }

