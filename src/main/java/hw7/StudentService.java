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

//    public TestEntity save(TestEntity testEntity) {
//        universityRepository.save(testEntity);
//        return testEntity;
//    }
//
//    public TestEntity findById(int id) {
//        Optional<TestEntity> testEntity = universityRepository.findById(id);
//        return testEntity.orElse(null);
//    }


}
