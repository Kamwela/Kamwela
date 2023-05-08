package com.bookshop.bookshop.repository;

import com.bookshop.bookshop.entity.BookshopEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookshopRepository extends JpaRepository<BookshopEntity, Long> {
}
