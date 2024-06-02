package hw7;


import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@org.springframework.stereotype.Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

    @Transactional
    @Query(
            value = "SELECT * FROM STUDENT",
            nativeQuery = true
    )
    List<StudentEntity> findAllStudents();

    @Transactional
    @Query(
            value = "SELECT CNAME, CREDIT, EXAM " +
                    "FROM STUDENT JOIN ENROLL USING(SNO) JOIN COURSE USING(CNO) " +
                    "WHERE UPPER(SNAME) = UPPER(:sname)",
            nativeQuery = true
    )
    List<UnivB> retrieveUnivB(@Param("sname") String sname);

    @Transactional
    @Query(
            value = "SELECT SNAME, SNO, CNO, EXAM, GRADE " +
                    "FROM STUDENT JOIN ENROLL USING(SNO) " +
                    "WHERE (EXAM >= 90 AND UPPER(GRADE) != 'A') " +
                    "OR (EXAM < 90 AND EXAM >= 80 AND UPPER(GRADE) != 'B')" +
                    "OR (EXAM < 80 AND EXAM >= 70 AND UPPER(GRADE) != 'C')" +
                    "OR (EXAM < 70 AND EXAM >= 60 AND UPPER(GRADE) != 'D')" +
                    "OR (EXAM < 60 AND UPPER(GRADE) != 'F')",
            nativeQuery = true
    )
    List<UnivC> findWrongGradeStudents();

    @Transactional
    @Query(
            value = "SELECT SNAME, SNO, CNO, EXAM, GRADE " +
                    "FROM STUDENT JOIN ENROLL USING(SNO) ",
            nativeQuery = true
    )
    List<UnivC> findAllGradeAndStudents();

    @Transactional
    @Query(
            value = "WITH  " +
                    "MAX AS (SELECT CNO, MAX(EXAM) AS MAX " +
                    "FROM STUDENT JOIN ENROLL USING (SNO) JOIN COURSE USING (CNO)  " +
                    "GROUP BY CNO) " +
                    "SELECT SNO, PNO, SNAME, YEAR, DEPT, CNO " +
                    "FROM STUDENT JOIN ENROLL USING (SNO) JOIN MAX USING (CNO) " +
                    "WHERE EXAM = MAX" ,
            nativeQuery = true
    )
    List<UnivD> findHighGradeStudent();

    @Transactional
    @Query(
            value = "WITH  " +
                    "MIN AS (SELECT CNO, MIN(EXAM) AS MIN " +
                    "FROM STUDENT JOIN ENROLL USING (SNO) JOIN COURSE USING (CNO)  " +
                    "GROUP BY CNO) " +
                    "SELECT SNO, PNO, SNAME, YEAR, DEPT, CNO " +
                    "FROM STUDENT JOIN ENROLL USING (SNO) JOIN MIN USING (CNO) " +
                    "WHERE EXAM = MIN" ,
            nativeQuery = true
    )
    List<UnivD> findLowGradeStudent();

    @Transactional
    @Query(
            value = "SELECT SNO, SNAME, SUM(CREDIT) as TOTALCREDITS, ROUND(AVG(EXAM),2) AS AVGEXAMS " +
                    "FROM STUDENT JOIN ENROLL USING(SNO) JOIN COURSE USING(CNO) " +
                    "GROUP BY SNO, SNAME",
            nativeQuery = true
    )
    List<UnivE> findTotalCreditsAndAvgExams();

    @Transactional
    @Query(
            value = "SELECT COUNT(*) as COUNTSTUDENTS, DEPT " +
                    "FROM STUDENT " +
                    "GROUP BY DEPT",
            nativeQuery = true
    )
    List<UnivH1> findCountStudentsBasedDept();

    @Transactional
    @Query(
            value = "SELECT COUNT(*) as COUNTSTUDENTS, YEAR " +
                    "FROM STUDENT " +
                    "GROUP BY YEAR " +
                    "ORDER BY YEAR",
            nativeQuery = true
    )
    List<UnivH2> findCountStudentsBasedYear();

}
