package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository repository;

    public List<ProfessorEntity> findAllProfessors() {
        List<ProfessorEntity> tracking = repository.findAllProfessors();
        System.out.println(tracking);
        return tracking;
    }

}
