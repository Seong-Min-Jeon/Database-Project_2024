package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class CourseService {
    @Autowired
    private CourseRepository repository;

    public List<CourseEntity> findAllCourses() {
        List<CourseEntity> tracking = repository.findAllCourses();
        System.out.println(tracking);
        return tracking;
    }

    public List<UnivF> findAvgExamsAndCountStudents() {
        List<UnivF> tracking = repository.findAvgExamsAndCountStudents();
        System.out.println(tracking);
        return tracking;
    }

}
