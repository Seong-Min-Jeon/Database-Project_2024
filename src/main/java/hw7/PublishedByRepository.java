package hw7;


import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@org.springframework.stereotype.Repository
public interface PublishedByRepository extends JpaRepository<PublishedByEntity, Integer>{

    // 2.d를 위한 query
    @Transactional
    @Query(
            value = "SELECT * FROM PUBLISHED_BY",
            nativeQuery = true
    )
    List<PublishedByEntity> findAllPublishedBy();

    // 2.d를 위한 query
    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO PUBLISHED_BY VALUES " +
                    "(:name, :ISBN)",
            nativeQuery = true
    )
    void insertPublishedByD(@Param("name") String name, @Param("ISBN") int ISBN);
}
