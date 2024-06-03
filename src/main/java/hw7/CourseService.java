package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class CourseService {
    @Autowired
    private CourseRepository repository;

    // 1.a를 위한 함수
    public List<CourseEntity> findAllCourses() {
        List<CourseEntity> tracking = repository.findAllCourses();
        System.out.println(tracking);
        return tracking;
    }

    // 1.f를 위한 함수
    public List<UnivF> findAvgExams() {
        List<UnivF> tracking = repository.findAvgExams();
        System.out.println(tracking);
        return tracking;
    }

    // 1.f를 위한 함수
    public List<UnivF> findCountStudents() {
        List<UnivF> tracking = repository.findCountStudents();
        System.out.println(tracking);
        return tracking;
    }

}
