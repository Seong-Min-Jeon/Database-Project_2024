package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class WarehouseService {
    @Autowired
    private WarehouseRepository repository;

    public List<WarehouseEntity> findALlWarehouse() {
        List<WarehouseEntity> tracking = repository.findALlWarehouse();
        System.out.println(tracking);
        return tracking;
    }

}
