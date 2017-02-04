package com.controller;

import com.hib.Book;
import com.hib.BookManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by WS on 4/2/17.
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookManager manager;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createRecord(@RequestBody Book book){

        try{
            manager.setUp();
            manager.createRecord(book);
            manager.close();
        }catch (Exception ex){
            System.out.println("Exception in hibernate setup");
        }

    }

    @RequestMapping(method = RequestMethod.GET, value = "/{bookId}")
    public Book getRecord(@PathVariable(value = "bookId") long bookId){

        Book records = null;

        try{
            manager.setUp();
            records = manager.readRecord(bookId);
            manager.close();
        }catch (Exception ex){
            System.out.println("Exception in hibernate setup");
        }

        return records;
    }
}
