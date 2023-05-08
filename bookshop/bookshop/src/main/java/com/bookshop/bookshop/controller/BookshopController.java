package com.bookshop.bookshop.controller;

import com.bookshop.bookshop.entity.BookshopEntity;
import com.bookshop.bookshop.service.BookshopService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/bookshop")
public class BookshopController {

    private BookshopService bookshopService;

     @PostMapping
    public ResponseEntity<BookshopEntity> createBookshop(BookshopEntity bookshopEntity) {
        BookshopEntity savedBookshop = bookshopService.createBookshop(bookshopEntity);
        return new ResponseEntity<>(bookshopEntity, HttpStatus.OK);
      }

      @GetMapping("/all")
    public ResponseEntity<List<BookshopEntity>> getAllBookshop(){
        List<BookshopEntity> bookshopEntities = bookshopService.getAllBookshop();
          return new ResponseEntity<>(bookshopEntities, HttpStatus.OK);

    }

    @PutMapping("{id}")
    public ResponseEntity<BookshopEntity> updateBookshopEntity(@PathVariable("id")Long bookshopId,@RequestParam
                                                               BookshopEntity bookshopEntity){
         bookshopEntity.setId(bookshopId);
         BookshopEntity updateBookshopEntity = bookshopService.updateBookshop(bookshopEntity);
        return new ResponseEntity<>(updateBookshopEntity, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBookshopEntity(@PathVariable("id")Long bookshopId){
        bookshopService.deleteBookshop(bookshopId);
        return new ResponseEntity<>( "Bookshop detail successifuly deleted", HttpStatus.OK);
    }

}