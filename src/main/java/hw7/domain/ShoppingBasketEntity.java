package hw7.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "shoppingBasket")
@Table(name = "shoppingBasket")
@Getter
@Setter
public class ShoppingBasketEntity {

    @Id
    @Column(name = "basketid")
    private String basketid;

}
