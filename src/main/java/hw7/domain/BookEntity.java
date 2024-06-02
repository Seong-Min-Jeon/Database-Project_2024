package hw7.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "book")
@Table(name = "book")
@Getter
@Setter
public class BookEntity {

    @Id
    @Column(name = "ISBN")
    private int ISBN;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private int year;

    @Column(name = "price")
    private int price;

}
