package hw7;

import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@org.springframework.stereotype.Repository
public interface PublisherRepository extends JpaRepository<PublisherEntity, Integer>{

    @Transactional
    @Query(
            value = "SELECT * FROM PUBLISHER",
            nativeQuery = true
    )
    List<PublisherEntity> findAllPublishers();

    @Transactional
    @Query(
            value = "SELECT ISBN, TITLE, PRICE, SUM(NUM) AS NUM " +
                    "FROM PUBLISHER JOIN PUBLISHED_BY USING(NAME) " +
                    "JOIN BOOK USING(ISBN) " +
                    "JOIN STOCKS USING(ISBN) " +
                    "WHERE UPPER(NAME) = UPPER(:name)" +
                    "GROUP BY ISBN, TITLE, PRICE",
            nativeQuery = true
    )
    List<BookB> retrieveBookB(@Param("name") String name);

}
