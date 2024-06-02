package hw7.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "basketOf")
@Table(name = "basketOf")
@Getter
@Setter
public class BasketOfEntity {
    @EmbeddedId
    private BasketOfId basketOfId;

    @ManyToOne
    @JoinColumn(name = "email")
    @MapsId("email")
    private CustomerEntity customerEntity;

    @ManyToOne
    @JoinColumn(name = "basketid")
    @MapsId("basketid")
    private ShoppingBasketEntity shoppingBasketEntity;

}

