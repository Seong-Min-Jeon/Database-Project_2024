package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    // 1.a를 위한 함수
    public List<StudentEntity> findAllStudents() {
        List<StudentEntity> tracking = repository.findAllStudents();
        System.out.println(tracking);
        return tracking;
    }

    // 1.b를 위한 함수
    public List<UnivB> retrieveUnivB(String sno) {
        List<UnivB> tracking = repository.retrieveUnivB(sno);
        System.out.println(tracking);
        return tracking;
    }

    // 1.c를 위한 함수
    public List<UnivC> findWrongGradeStudents() {
        List<UnivC> tracking = repository.findWrongGradeStudents();
        System.out.println(tracking);
        return tracking;
    }

    // 1.c를 위한 함수
    public List<UnivC> findAllGradeAndStudents() {
        List<UnivC> tracking = repository.findAllGradeAndStudents();
        System.out.println(tracking);
        return tracking;
    }

    // 1.d를 위한 함수
    public List<UnivD> findHighGradeStudent() {
        List<UnivD> tracking = repository.findHighGradeStudent();
        System.out.println(tracking);
        return tracking;
    }

    // 1.d를 위한 함수
    public List<UnivD> findLowGradeStudent() {
        List<UnivD> tracking = repository.findLowGradeStudent();
        System.out.println(tracking);
        return tracking;
    }

    // 1.e를 위한 함수
    public List<UnivE> findTotalCreditsAndAvgExams() {
        List<UnivE> tracking = repository.findTotalCreditsAndAvgExams();
        System.out.println(tracking);
        return tracking;
    }

    // 1.h를 위한 함수
    public List<UnivH1> findCountStudentsBasedDept() {
        List<UnivH1> tracking = repository.findCountStudentsBasedDept();
        System.out.println(tracking);
        return tracking;
    }

    // 1.h를 위한 함수
    public List<UnivH2> findCountStudentsBasedYear() {
        List<UnivH2> tracking = repository.findCountStudentsBasedYear();
        System.out.println(tracking);
        return tracking;
    }

}
