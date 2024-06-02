package hw7.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class BasketOfId implements Serializable {
    @Column(name = "email")
    private String email;

    @Column(name = "basketid")
    private String basketid;

    public BasketOfId() {}

    public BasketOfId(String email, String basketid) {
        this.email = email;
        this.basketid = basketid;
    }

    public String getEmail() {
        return this.email;
    }

    public String getBasketid() {
        return this.basketid;
    }

}