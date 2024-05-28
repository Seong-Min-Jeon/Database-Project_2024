package hw7;


import hw7.domain.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<TestEntity, Integer>{

}
