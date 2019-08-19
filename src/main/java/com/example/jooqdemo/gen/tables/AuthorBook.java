/*
 * This file is generated by jOOQ.
 */
package com.example.jooqdemo.gen.tables;


import com.example.jooqdemo.gen.Indexes;
import com.example.jooqdemo.gen.Keys;
import com.example.jooqdemo.gen.Public;
import com.example.jooqdemo.gen.tables.records.AuthorBookRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorBook extends TableImpl<AuthorBookRecord> {

    private static final long serialVersionUID = -277429233;

    /**
     * The reference instance of <code>PUBLIC.AUTHOR_BOOK</code>
     */
    public static final AuthorBook AUTHOR_BOOK = new AuthorBook();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorBookRecord> getRecordType() {
        return AuthorBookRecord.class;
    }

    /**
     * The column <code>PUBLIC.AUTHOR_BOOK.AUTHOR_ID</code>.
     */
    public final TableField<AuthorBookRecord, Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.AUTHOR_BOOK.BOOK_ID</code>.
     */
    public final TableField<AuthorBookRecord, Integer> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.AUTHOR_BOOK</code> table reference
     */
    public AuthorBook() {
        this(DSL.name("AUTHOR_BOOK"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.AUTHOR_BOOK</code> table reference
     */
    public AuthorBook(String alias) {
        this(DSL.name(alias), AUTHOR_BOOK);
    }

    /**
     * Create an aliased <code>PUBLIC.AUTHOR_BOOK</code> table reference
     */
    public AuthorBook(Name alias) {
        this(alias, AUTHOR_BOOK);
    }

    private AuthorBook(Name alias, Table<AuthorBookRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuthorBook(Name alias, Table<AuthorBookRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AuthorBook(Table<O> child, ForeignKey<O, AuthorBookRecord> key) {
        super(child, key, AUTHOR_BOOK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FK_AB_AUTHOR_INDEX_A, Indexes.FK_AB_BOOK_INDEX_A, Indexes.PRIMARY_KEY_A);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthorBookRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_A;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthorBookRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthorBookRecord>>asList(Keys.CONSTRAINT_A);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AuthorBookRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AuthorBookRecord, ?>>asList(Keys.FK_AB_AUTHOR, Keys.FK_AB_BOOK);
    }

    public Author author() {
        return new Author(this, Keys.FK_AB_AUTHOR);
    }

    public Book book() {
        return new Book(this, Keys.FK_AB_BOOK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorBook as(String alias) {
        return new AuthorBook(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorBook as(Name alias) {
        return new AuthorBook(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthorBook rename(String name) {
        return new AuthorBook(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthorBook rename(Name name) {
        return new AuthorBook(name, null);
    }
}
