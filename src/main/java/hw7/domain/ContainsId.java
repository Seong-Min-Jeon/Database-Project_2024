package hw7.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ContainsId implements Serializable {
    @Column(name = "basketid")
    private String basketid;

    @Column(name = "ISBN")
    private int ISBN;

    public ContainsId() {}

    public ContainsId(String basketid, int ISBN) {
        this.basketid = basketid;
        this.ISBN = ISBN;
    }

    public String getBasketid() {
        return this.basketid;
    }

    public int getISBN() {
        return this.ISBN;
    }

}