/*
 * This file is generated by jOOQ.
 */
package com.example.jooqdemo.gen;


import com.example.jooqdemo.gen.tables.Author;
import com.example.jooqdemo.gen.tables.AuthorBook;
import com.example.jooqdemo.gen.tables.Book;
import com.example.jooqdemo.gen.tables.records.AuthorBookRecord;
import com.example.jooqdemo.gen.tables.records.AuthorRecord;
import com.example.jooqdemo.gen.tables.records.BookRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>PUBLIC</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> CONSTRAINT_7 = UniqueKeys0.CONSTRAINT_7;
    public static final UniqueKey<AuthorBookRecord> CONSTRAINT_A = UniqueKeys0.CONSTRAINT_A;
    public static final UniqueKey<BookRecord> CONSTRAINT_1 = UniqueKeys0.CONSTRAINT_1;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AuthorBookRecord, AuthorRecord> FK_AB_AUTHOR = ForeignKeys0.FK_AB_AUTHOR;
    public static final ForeignKey<AuthorBookRecord, BookRecord> FK_AB_BOOK = ForeignKeys0.FK_AB_BOOK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<AuthorRecord> CONSTRAINT_7 = Internal.createUniqueKey(Author.AUTHOR, "CONSTRAINT_7", Author.AUTHOR.ID);
        public static final UniqueKey<AuthorBookRecord> CONSTRAINT_A = Internal.createUniqueKey(AuthorBook.AUTHOR_BOOK, "CONSTRAINT_A", AuthorBook.AUTHOR_BOOK.AUTHOR_ID, AuthorBook.AUTHOR_BOOK.BOOK_ID);
        public static final UniqueKey<BookRecord> CONSTRAINT_1 = Internal.createUniqueKey(Book.BOOK, "CONSTRAINT_1", Book.BOOK.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<AuthorBookRecord, AuthorRecord> FK_AB_AUTHOR = Internal.createForeignKey(com.example.jooqdemo.gen.Keys.CONSTRAINT_7, AuthorBook.AUTHOR_BOOK, "FK_AB_AUTHOR", AuthorBook.AUTHOR_BOOK.AUTHOR_ID);
        public static final ForeignKey<AuthorBookRecord, BookRecord> FK_AB_BOOK = Internal.createForeignKey(com.example.jooqdemo.gen.Keys.CONSTRAINT_1, AuthorBook.AUTHOR_BOOK, "FK_AB_BOOK", AuthorBook.AUTHOR_BOOK.BOOK_ID);
    }
}
