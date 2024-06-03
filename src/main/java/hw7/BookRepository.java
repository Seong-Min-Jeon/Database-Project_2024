package hw7;


import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@org.springframework.stereotype.Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer>{

    // 2.d를 위한 query
    @Transactional
    @Query(
            value = "SELECT * FROM BOOK",
            nativeQuery = true
    )
    List<BookEntity> findAllBooks();

    // 2.d를 위한 query
    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO BOOK VALUES " +
                    "(:ISBN, :title, :year, :price)",
            nativeQuery = true
    )
    void insertBookD(@Param("ISBN") int ISBN, @Param("title") String title, @Param("year") int year, @Param("price") int price);

    // 2.e를 위한 query
    @Transactional
    @Query(
            value = "SELECT FLOOR(AVG(PRICE)) as AVGPRICE FROM BOOK",
            nativeQuery = true
    )
    List<BookE> findAvgPrice();

    // 2.e를 위한 query
    @Transactional
    @Query(
            value = "SELECT YEAR, FLOOR(AVG(PRICE)) AS AVGPRICEBASEDYEAR " +
                    "FROM BOOK " +
                    "GROUP BY YEAR " +
                    "ORDER BY YEAR",
            nativeQuery = true
    )
    List<BookE> findAvgPriceBasedYear();

    // 2.g를 위한 query
    @Transactional
    @Query(
            value = "SELECT ISBN, TITLE, PRICE, SUM(NUM) AS NUM " +
                    "FROM BOOK JOIN STOCKS USING (ISBN) " +
                    "GROUP BY ISBN, TITLE, PRICE " +
                    "HAVING SUM(NUM) >= :num " +
                    "ORDER BY ISBN",
            nativeQuery = true
    )
    List<BookG> findBookStocks(@Param("num") int num);

    // 2.g를 위한 query
    @Modifying
    @Transactional
    @Query(
            value = "UPDATE BOOK SET " +
                    "PRICE = FLOOR(PRICE * (100-:percent) / 100) " +
                    "WHERE EXISTS ( " +
                    "SELECT * FROM BOOK JOIN STOCKS USING(ISBN) WHERE NUM >= :num " +
                    ")",
            nativeQuery = true
    )
    void discountBooks(@Param("num") int num, @Param("percent") int percent);

}
