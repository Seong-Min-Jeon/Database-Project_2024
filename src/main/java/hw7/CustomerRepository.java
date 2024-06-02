package hw7;

import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@org.springframework.stereotype.Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer>{

    @Transactional
    @Query(
            value = "SELECT * FROM CUSTOMER",
            nativeQuery = true
    )
    List<CustomerEntity> findAllCustomers();

    @Transactional
    @Query(
            value = "SELECT ISBN, TITLE, YEAR, PRICE, " +
                    "P.NAME AS PUBLISHERNAME, P.ADDRESS AS PUBLISHERADDRESS, " +
                    "P.PHONE AS PUBLISHERPHONE, P.URL AS PUBLISHERURL, " +
                    "A.NAME AS AUTHORNAME, A.ADDRESS AS AUTHORADDRESS, " +
                    "A.URL AS AUTHOERURL " +
                    "FROM CUSTOMER JOIN BASKET_OF USING(EMAIL) " +
                    "JOIN CONTAINS USING(BASKETID) " +
                    "JOIN PUBLISHED_BY PB USING(ISBN) " +
                    "JOIN PUBLISHER P ON(P.NAME=PB.NAME) " +
                    "JOIN WRITTEN_BY WB USING(ISBN) " +
                    "JOIN AUTHOR A ON(A.NAME=WB.NAME AND A.ADDRESS=WB.ADDRESS) " +
                    "JOIN BOOK USING(ISBN) " +
                    "WHERE UPPER(EMAIL) = UPPER(:email)",
            nativeQuery = true
    )
    List<BookC> retrieveBookC(@Param("email") String email);

}
