package hw7;

import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@org.springframework.stereotype.Repository
public interface EnrollRepository extends JpaRepository<EnrollEntity, EnrollId>{

    @Transactional
    @Query(
            value = "SELECT * FROM ENROLL",
            nativeQuery = true
    )
    List<EnrollEntity> findAllEnrolls();

}
