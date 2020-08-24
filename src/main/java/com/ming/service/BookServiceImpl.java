package com.ming.service;

import com.ming.dao.BookMapper;
import com.ming.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    public void setBookMapper (BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }


    public int addBook (Books books) {
        return bookMapper.addBook (books);
    }

    public int deleteBookById (int id) {
        return bookMapper.deleteBookById (id);
    }

    public int updateBook (Books book) {
        return bookMapper.updateBook (book);
    }

    public Books queryBookById (int id) {
        return bookMapper.queryBookById (id);
    }

    public List<Books> queryAllBooks () {
        return bookMapper.queryAllBooks ();
    }
}
