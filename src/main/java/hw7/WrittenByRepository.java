package hw7;


import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@org.springframework.stereotype.Repository
public interface WrittenByRepository extends JpaRepository<WrittenByEntity, Integer>{

    // 2.d를 위한 query
    @Transactional
    @Query(
            value = "SELECT * FROM WRITTEN_BY",
            nativeQuery = true
    )
    List<WrittenByEntity> findAllWrittenBy();

    // 2.d를 위한 query
    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO WRITTEN_BY VALUES " +
                    "(:name, :address, :ISBN)",
            nativeQuery = true
    )
    void insertWrittenByD(@Param("name") String name, @Param("address") String address, @Param("ISBN") int ISBN);
}
