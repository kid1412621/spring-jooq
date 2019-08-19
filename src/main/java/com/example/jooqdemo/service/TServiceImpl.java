package com.example.jooqdemo.service;

import com.example.jooqdemo.gen.tables.Author;
import com.example.jooqdemo.gen.tables.AuthorBook;
import com.example.jooqdemo.gen.tables.Book;
import org.jooq.DSLContext;
import org.jooq.Record3;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TServiceImpl implements TService {
    Author author = Author.AUTHOR;
    Book book = Book.BOOK;
    AuthorBook authorBook = AuthorBook.AUTHOR_BOOK;
    @Autowired
    private DSLContext dsl;

    @Override
    public String tt() {
        dsl.insertInto(author)
                .set(author.ID, 4)
                .set(author.FIRST_NAME, "Herbert")
                .set(author.LAST_NAME, "Schildt")
                .execute();
        dsl.insertInto(book)
                .set(book.ID, 4)
                .set(book.TITLE, "A Beginner's Guide")
                .execute();
        dsl.insertInto(authorBook)
                .set(authorBook.AUTHOR_ID, 4)
                .set(authorBook.BOOK_ID, 4)
                .execute();
        return "OK\n";
    }

    @Override
    public Result getJoin() {
        Result<Record3<Integer, String, Integer>> result = dsl
                .select(author.ID, author.LAST_NAME, DSL.count())
                .from(author)
                .join(authorBook)
                .on(author.ID.equal(authorBook.AUTHOR_ID))
                .join(book)
                .on(authorBook.BOOK_ID.equal(book.ID))
                .groupBy(author.LAST_NAME)
                .fetch();
        return result;
    }
}
