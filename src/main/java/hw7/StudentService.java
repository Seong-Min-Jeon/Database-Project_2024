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
