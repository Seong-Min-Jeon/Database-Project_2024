package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class PublishedByService {
    @Autowired
    private PublishedByRepository repository;

    // 2.d를 위한 함수
    public List<PublishedByEntity> findAllPublishedBy() {
        List<PublishedByEntity> tracking = repository.findAllPublishedBy();
        System.out.println(tracking);
        return tracking;
    }

    // 2.d를 위한 함수
    public void insertPublishedByD(String name, int ISBN) {
        repository.insertPublishedByD(name, ISBN);
    }

}
