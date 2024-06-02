package hw7.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "contains")
@Table(name = "contains")
@Getter
@Setter
public class ContainsEntity {
    @EmbeddedId
    private ContainsId cantainsId;

    @ManyToOne
    @JoinColumn(name = "basketid")
    @MapsId("basketid")
    private ShoppingBasketEntity shoppingBasketEntity;

    @ManyToOne
    @JoinColumn(name = "ISBN")
    @MapsId("ISBN")
    private BookEntity bookEntity;

    @Column(name = "num")
    private int num;

}

