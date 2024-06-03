package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class WrittenByService {
    @Autowired
    private WrittenByRepository repository;

    // 2.d를 위한 함수
    public List<WrittenByEntity> findAllWrittenBy() {
        List<WrittenByEntity> tracking = repository.findAllWrittenBy();
        System.out.println(tracking);
        return tracking;
    }

    // 2.d를 위한 함수
    public void insertWrittenByD(String name, String address, int ISBN) {
        repository.insertWrittenByD(name, address, ISBN);
    }

}
