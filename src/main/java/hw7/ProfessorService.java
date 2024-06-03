package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository repository;

    // 1.a를 위한 함수
    public List<ProfessorEntity> findAllProfessors() {
        List<ProfessorEntity> tracking = repository.findAllProfessors();
        System.out.println(tracking);
        return tracking;
    }

    // 1.g를 위한 함수
    public List<UnivG> findDeptAndCountLecture() {
        List<UnivG> tracking = repository.findDeptAndCountLecture();
        System.out.println(tracking);
        return tracking;
    }

}
