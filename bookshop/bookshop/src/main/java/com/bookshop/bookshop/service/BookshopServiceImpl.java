package com.bookshop.bookshop.service;

import com.bookshop.bookshop.entity.BookshopEntity;
import com.bookshop.bookshop.repository.BookshopRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookshopServiceImpl implements BookshopService{
    private BookshopRepository bookshopRepository;

    @Override
    public BookshopEntity createBookshop(BookshopEntity bookshopEntity) {
        return bookshopRepository.save(bookshopEntity);
    }

    @Override
    public BookshopEntity getBookingById(Long bookshopId) {
        Optional<BookshopEntity> optionalBookshopEntity = bookshopRepository.findById(bookshopId);
        return optionalBookshopEntity.get();
    }

    @Override
    public List<BookshopEntity> getAllBookshop() {
        return bookshopRepository.findAll();
    }

    @Override
    public BookshopEntity updateBookshop(BookshopEntity bookshopEntity) {
        BookshopEntity existingBookshop = bookshopRepository.findById(bookshopEntity.getId()).get();
        existingBookshop.setCustomerName(bookshopEntity.getCustomerName());
        existingBookshop.setContactInfo(bookshopEntity.getContactInfo());
        existingBookshop.setArriveDate(bookshopEntity.getArriveDate());
        existingBookshop.setBookCost(bookshopEntity.getBookCost());
        existingBookshop.setStatus(bookshopEntity.getStatus());
        existingBookshop.setPaymentMode(bookshopEntity.getPaymentMode());
        return null;
    }

    @Override
    public void deleteBookshop(Long bookshopId) {

        bookshopRepository.deleteById(bookshopId);
    }
}
