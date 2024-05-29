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

    @Query(
            value = "SELECT C.CNAME AS CNAME, C.CREDIT AS CREDIT, E.EXAM AS EXAM " +
                    "FROM STUDENT S JOIN ENROLL E USING(SNO) JOIN COURSE C USING(CNO) " +
                    "WHERE UPPER(S.SNAME) = UPPER(:sname)",
            nativeQuery = true
    )
    List<UnivB> retrieveUnivB(@Param("sname") String sname);

}
