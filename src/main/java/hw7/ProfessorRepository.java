package hw7;


import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@org.springframework.stereotype.Repository
public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Integer>{

    // 1.a를 위한 query
    @Transactional
    @Query(
            value = "SELECT * FROM PROFESSOR",
            nativeQuery = true
    )
    List<ProfessorEntity> findAllProfessors();

    // 1.g를 위한 query
    @Transactional
    @Query(
            value = "SELECT PDEPT AS DEPT, COUNT(*) AS COUNTLECTURES " +
                    "FROM PROFESSOR JOIN LECTURE USING(PNO) " +
                    "GROUP BY PDEPT",
            nativeQuery = true
    )
    List<UnivG> findDeptAndCountLecture();
}
