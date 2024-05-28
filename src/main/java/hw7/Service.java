package hw7;

import hw7.domain.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository testRepository;

    public List<TestEntity> findAll() {
        List<TestEntity> tracking = testRepository.findAll();
        System.out.println(tracking);
        return tracking;
    }

    public TestEntity save(TestEntity testEntity) {
        testRepository.save(testEntity);
        return testEntity;
    }

    public TestEntity findById(int id) {
        Optional<TestEntity> testEntity = testRepository.findById(id);
        return testEntity.orElse(null);
    }


}
