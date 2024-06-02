package hw7.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "stocks")
@Table(name = "stocks")
@Getter
@Setter
public class StocksEntity {
    @EmbeddedId
    private StocksId stocksId;

    @ManyToOne
    @JoinColumn(name = "ISBN")
    @MapsId("ISBN")
    private BookEntity bookEntity;

    @ManyToOne
    @JoinColumn(name = "code")
    @MapsId("code")
    private WarehouseEntity warehouseEntity;

    @Column(name = "num")
    private int num;

}

