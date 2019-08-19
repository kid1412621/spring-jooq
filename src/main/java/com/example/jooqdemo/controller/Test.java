package com.example.jooqdemo.controller;

import com.example.jooqdemo.gen.tables.Author;
import com.example.jooqdemo.gen.tables.Book;
import com.example.jooqdemo.service.TService;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test {
    Author author = Author.AUTHOR;
    @Autowired
    private TService tService;

    @GetMapping("/tt")
    public String tt() {
        return tService.tt();
    }

    @GetMapping("/join")
    public List<String> join() {
        Result r = tService.getJoin();
        return r.getValues(author.LAST_NAME);
    }
}
