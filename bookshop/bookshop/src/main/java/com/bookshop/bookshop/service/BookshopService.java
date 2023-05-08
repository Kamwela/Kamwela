package com.bookshop.bookshop.service;

import com.bookshop.bookshop.entity.BookshopEntity;

import java.util.List;

public interface BookshopService {

    BookshopEntity createBookshop(BookshopEntity bookshopEntity);

    BookshopEntity getBookingById(Long bookshopId);

    List<BookshopEntity> getAllBookshop();

    BookshopEntity updateBookshop(BookshopEntity bookshopEntity);

    void deleteBookshop(Long bookshopId);
}
