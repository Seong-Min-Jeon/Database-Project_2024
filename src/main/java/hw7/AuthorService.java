package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class AuthorService {
    @Autowired
    private AuthorRepository repository;

    public List<AuthorEntity> findAllAuthors() {
        List<AuthorEntity> tracking = repository.findAllAuthors();
        System.out.println(tracking);
        return tracking;
    }

    public List<BookA> retrieveBookA(String name, String address) {
        List<BookA> tracking = repository.retrieveBookA(name, address);
        System.out.println(tracking);
        return tracking;
    }

}
