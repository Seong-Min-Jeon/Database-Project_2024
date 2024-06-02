package hw7;


import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@org.springframework.stereotype.Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer>{

    @Transactional
    @Query(
            value = "SELECT * FROM AUTHOR",
            nativeQuery = true
    )
    List<AuthorEntity> findAllAuthors();

    @Transactional
    @Query(
            value = "SELECT TITLE, SUM(NUM) AS NUM " +
                    "FROM AUTHOR JOIN WRITTEN_BY USING(NAME,ADDRESS) " +
                    "JOIN BOOK USING(ISBN) " +
                    "JOIN STOCKS USING(ISBN) " +
                    "WHERE UPPER(NAME) = UPPER(:name) AND UPPER(ADDRESS) = UPPER(:address) " +
                    "GROUP BY TITLE",
            nativeQuery = true
    )
    List<BookA> retrieveBookA(@Param("name") String name, @Param("address") String address);

}
