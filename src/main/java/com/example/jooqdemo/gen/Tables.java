/*
 * This file is generated by jOOQ.
 */
package com.example.jooqdemo.gen;


import com.example.jooqdemo.gen.tables.Author;
import com.example.jooqdemo.gen.tables.AuthorBook;
import com.example.jooqdemo.gen.tables.Book;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>PUBLIC.AUTHOR</code>.
     */
    public static final Author AUTHOR = com.example.jooqdemo.gen.tables.Author.AUTHOR;

    /**
     * The table <code>PUBLIC.AUTHOR_BOOK</code>.
     */
    public static final AuthorBook AUTHOR_BOOK = com.example.jooqdemo.gen.tables.AuthorBook.AUTHOR_BOOK;

    /**
     * The table <code>PUBLIC.BOOK</code>.
     */
    public static final Book BOOK = com.example.jooqdemo.gen.tables.Book.BOOK;
}
