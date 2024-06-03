package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    // 2.c를 위한 함수
    public List<CustomerEntity> findAllCustomers() {
        List<CustomerEntity> tracking = repository.findAllCustomers();
        System.out.println(tracking);
        return tracking;
    }

    // 2.c를 위한 함수
    public List<BookC> retrieveBookC(String email) {
        List<BookC> tracking = repository.retrieveBookC(email);
        System.out.println(tracking);
        return tracking;
    }

}
