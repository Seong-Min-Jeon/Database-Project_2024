package hw7;

import hw7.domain.*;
import hw7.domain.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class BookService {
    @Autowired
    private BookRepository repository;

    // 2.d를 위한 함수
    public List<BookEntity> findAllBooks() {
        List<BookEntity> tracking = repository.findAllBooks();
        System.out.println(tracking);
        return tracking;
    }

    // 2.d를 위한 함수
    public void insertBookD(int ISBN, String title, int year, int price) {
        repository.insertBookD(ISBN, title, year, price);
    }

    // 2.e를 위한 함수
    public List<BookE> findAvgPrice() {
        List<BookE> tracking = repository.findAvgPrice();
        System.out.println(tracking);
        return tracking;
    }

    // 2.e를 위한 함수
    public List<BookE> findAvgPriceBasedYear() {
        List<BookE> tracking = repository.findAvgPriceBasedYear();
        System.out.println(tracking);
        return tracking;
    }

    // 2.g를 위한 함수
    public List<BookG> findBookStocks(int num) {
        List<BookG> tracking = repository.findBookStocks(num);
        System.out.println(tracking);
        return tracking;
    }

    // 2.g를 위한 함수
    public void discountBooks(int num, int percent) {
        repository.discountBooks(num, percent);
    }

}
