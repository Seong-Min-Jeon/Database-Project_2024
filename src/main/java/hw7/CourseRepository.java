package hw7;

import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@org.springframework.stereotype.Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Integer>{

    // 1.a를 위한 query
    @Transactional
    @Query(
            value = "SELECT * FROM COURSE",
            nativeQuery = true
    )
    List<CourseEntity> findAllCourses();

    // 1.f를 위한 query
    @Transactional
    @Query(
            value = "SELECT CNO, CNAME, ROUND(AVG(EXAM),2) AS AVGEXAMS " +
                    "FROM COURSE JOIN ENROLL USING(CNO) JOIN STUDENT USING(SNO) " +
                    "GROUP BY CNO, CNAME",
            nativeQuery = true
    )
    List<UnivF> findAvgExams();

    // 1.f를 위한 query
    @Transactional
    @Query(
            value = "SELECT GRADE, COUNT(SNO) AS COUNTSTUDENTS " +
                    "FROM COURSE JOIN ENROLL USING(CNO) JOIN STUDENT USING(SNO) " +
                    "GROUP BY GRADE " +
                    "ORDER BY GRADE",
            nativeQuery = true
    )
    List<UnivF> findCountStudents();

}