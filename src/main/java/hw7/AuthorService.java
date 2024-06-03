package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class AuthorService {
    @Autowired
    private AuthorRepository repository;

    // 2.a, 2.d를 위한 함수
    public List<AuthorEntity> findAllAuthors() {
        List<AuthorEntity> tracking = repository.findAllAuthors();
        System.out.println(tracking);
        return tracking;
    }

    // 2.a를 위한 함수
    public List<BookA> retrieveBookA(String name, String address) {
        List<BookA> tracking = repository.retrieveBookA(name, address);
        System.out.println(tracking);
        return tracking;
    }

    // 2.f를 위한 함수
    public List<BookF> findBooks() {
        List<BookF> tracking = repository.findBooks();
        System.out.println(tracking);
        return tracking;
    }

}
