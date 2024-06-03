package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class PublisherService {
    @Autowired
    private PublisherRepository repository;

    // 2.b, 2.d를 위한 함수
    public List<PublisherEntity> findAllPublishers() {
        List<PublisherEntity> tracking = repository.findAllPublishers();
        System.out.println(tracking);
        return tracking;
    }

    // 2.b를 위한 함수
    public List<BookB> retrieveBookB(String name) {
        List<BookB> tracking = repository.retrieveBookB(name);
        System.out.println(tracking);
        return tracking;
    }


}
