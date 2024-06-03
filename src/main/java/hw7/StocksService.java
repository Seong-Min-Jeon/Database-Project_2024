package hw7;

import hw7.domain.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@org.springframework.stereotype.Service
public class StocksService {
    @Autowired
    private StocksRepository repository;

    // 2.d를 위한 함수
    public List<StocksEntity> findAllStocks() {
        List<StocksEntity> tracking = repository.findAllStocks();
        System.out.println(tracking);
        return tracking;
    }

    // 2.d를 위한 함수
    public void insertStocksD(int ISBN, String code, int num) {
        repository.insertStocksD(ISBN, code, num);
    }

}
