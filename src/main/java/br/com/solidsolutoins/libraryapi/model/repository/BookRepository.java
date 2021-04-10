package br.com.solidsolutoins.libraryapi.model.repository;

import br.com.solidsolutoins.libraryapi.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    boolean existsByIsbn(String isbn);
}
