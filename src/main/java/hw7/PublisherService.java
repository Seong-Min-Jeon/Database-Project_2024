package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class PublisherService {
    @Autowired
    private PublisherRepository repository;

    public List<PublisherEntity> findAllPublishers() {
        List<PublisherEntity> tracking = repository.findAllPublishers();
        System.out.println(tracking);
        return tracking;
    }

    public List<BookB> retrieveBookB(String name) {
        List<BookB> tracking = repository.retrieveBookB(name);
        System.out.println(tracking);
        return tracking;
    }


}
