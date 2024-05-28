package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class EnrollService {
    @Autowired
    private EnrollRepository repository;

    public List<EnrollEntity> findAllEnrolls() {
        List<EnrollEntity> tracking = repository.findAllEnrolls();
        System.out.println(tracking);
        return tracking;
    }

}
