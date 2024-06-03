package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class EnrollService {
    @Autowired
    private EnrollRepository repository;

    // 1.a를 위한 함수
    public List<EnrollEntity> findAllEnrolls() {
        List<EnrollEntity> tracking = repository.findAllEnrolls();
        System.out.println(tracking);
        return tracking;
    }

    // 1.c를 위한 함수
    public void updateWrongGrade() {
        repository.updateWrongGrade();
    }

}
