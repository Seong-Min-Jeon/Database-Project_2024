package hw7;


import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@org.springframework.stereotype.Repository
public interface StocksRepository extends JpaRepository<StocksEntity, Integer>{

    // 2.d를 위한 query
    @Transactional
    @Query(
            value = "SELECT * FROM STOCKS",
            nativeQuery = true
    )
    List<StocksEntity> findAllStocks();

    // 2.d를 위한 query
    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO STOCKS VALUES " +
                    "(:ISBN, :code, :num)",
            nativeQuery = true
    )
    void insertStocksD(@Param("ISBN") int ISBN, @Param("code") String code, @Param("num") int num);
}
