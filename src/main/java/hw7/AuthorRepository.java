package hw7;


import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@org.springframework.stereotype.Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer>{

    // 2.a, 2.d를 위한 query
    @Transactional
    @Query(
            value = "SELECT * FROM AUTHOR",
            nativeQuery = true
    )
    List<AuthorEntity> findAllAuthors();

    // 2.a를 위한 query
    @Transactional
    @Query(
            value = "SELECT ISBN, TITLE, SUM(NUM) AS NUM " +
                    "FROM AUTHOR JOIN WRITTEN_BY USING(NAME,ADDRESS) " +
                    "JOIN BOOK USING(ISBN) " +
                    "JOIN STOCKS USING(ISBN) " +
                    "WHERE UPPER(NAME) = UPPER(:name) AND UPPER(ADDRESS) = UPPER(:address) " +
                    "GROUP BY ISBN, TITLE",
            nativeQuery = true
    )
    List<BookA> retrieveBookA(@Param("name") String name, @Param("address") String address);

    // 2.f를 위한 query
    @Transactional
    @Query(
            value = "SELECT NAME, ADDRESS, COUNT(*) as NUM, " +
                    "MAX(PRICE) AS MAX, MIN(PRICE) AS MIN, FLOOR(AVG(PRICE)) AS AVG " +
                    "FROM AUTHOR JOIN WRITTEN_BY USING (NAME, ADDRESS) " +
                    "JOIN BOOK USING (ISBN) " +
                    "GROUP BY NAME, ADDRESS",
            nativeQuery = true
    )
    List<BookF> findBooks();

}
