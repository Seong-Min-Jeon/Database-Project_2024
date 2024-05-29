package hw7;

import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@org.springframework.stereotype.Repository
public interface EnrollRepository extends JpaRepository<EnrollEntity, EnrollId>{

    @Transactional
    @Query(
            value = "SELECT * FROM ENROLL",
            nativeQuery = true
    )
    List<EnrollEntity> findAllEnrolls();

    @Modifying
    @Transactional
    @Query(
            value = "UPDATE ENROLL SET GRADE = CASE " +
                    "WHEN EXAM >= 90 AND EXAM IS NOT NULL THEN 'A' " +
                    "WHEN EXAM >= 80 AND EXAM < 90 AND EXAM IS NOT NULL THEN 'B' " +
                    "WHEN EXAM >= 70 AND EXAM < 80 AND EXAM IS NOT NULL THEN 'C' " +
                    "WHEN EXAM >= 60 AND EXAM < 70 AND EXAM IS NOT NULL THEN 'D' " +
                    "ELSE 'F' END",
        nativeQuery = true
    )
    void updateWrongGrade();

}
