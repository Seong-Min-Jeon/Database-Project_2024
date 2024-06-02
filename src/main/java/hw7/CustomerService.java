package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public List<CustomerEntity> findAllCustomers() {
        List<CustomerEntity> tracking = repository.findAllCustomers();
        System.out.println(tracking);
        return tracking;
    }

    public List<BookC> retrieveBookC(String email) {
        List<BookC> tracking = repository.retrieveBookC(email);
        System.out.println(tracking);
        return tracking;
    }

}
