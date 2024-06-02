package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<StudentEntity> findAllStudents() {
        List<StudentEntity> tracking = repository.findAllStudents();
        System.out.println(tracking);
        return tracking;
    }

    public List<UnivB> retrieveUnivB(String sname) {
        List<UnivB> tracking = repository.retrieveUnivB(sname);
        System.out.println(tracking);
        return tracking;
    }

    public List<UnivC> findWrongGradeStudents() {
        List<UnivC> tracking = repository.findWrongGradeStudents();
        System.out.println(tracking);
        return tracking;
    }

    public List<UnivC> findAllGradeAndStudents() {
        List<UnivC> tracking = repository.findAllGradeAndStudents();
        System.out.println(tracking);
        return tracking;
    }

    public List<UnivD> findHighGradeStudent() {
        List<UnivD> tracking = repository.findHighGradeStudent();
        System.out.println(tracking);
        return tracking;
    }

    public List<UnivD> findLowGradeStudent() {
        List<UnivD> tracking = repository.findLowGradeStudent();
        System.out.println(tracking);
        return tracking;
    }

    public List<UnivE> findTotalCreditsAndAvgExams() {
        List<UnivE> tracking = repository.findTotalCreditsAndAvgExams();
        System.out.println(tracking);
        return tracking;
    }

    public List<UnivH1> findCountStudentsBasedDept() {
        List<UnivH1> tracking = repository.findCountStudentsBasedDept();
        System.out.println(tracking);
        return tracking;
    }

    public List<UnivH2> findCountStudentsBasedYear() {
        List<UnivH2> tracking = repository.findCountStudentsBasedYear();
        System.out.println(tracking);
        return tracking;
    }

}
