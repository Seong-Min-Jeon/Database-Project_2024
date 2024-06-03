package hw7;


import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@org.springframework.stereotype.Repository
public interface WarehouseRepository extends JpaRepository<WarehouseEntity, Integer>{

    // 2.d를 위한 query
    @Transactional
    @Query(
            value = "SELECT * FROM WAREHOUSE",
            nativeQuery = true
    )
    List<WarehouseEntity> findALlWarehouse();

}
