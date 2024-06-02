package hw7;

import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@org.springframework.stereotype.Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Integer>{

    @Transactional
    @Query(
            value = "SELECT * FROM COURSE",
            nativeQuery = true
    )
    List<CourseEntity> findAllCourses();

    @Transactional
    @Query(
            value = "SELECT CNO, CNAME, ROUND(AVG(EXAM),2) AS AVGEXAMS, COUNT(SNO) AS COUNTSTUDENTS " +
                    "FROM COURSE JOIN ENROLL USING(CNO) JOIN STUDENT USING(SNO) " +
                    "GROUP BY CNO, CNAME",
            nativeQuery = true
    )
    List<UnivF> findAvgExamsAndCountStudents();

}
