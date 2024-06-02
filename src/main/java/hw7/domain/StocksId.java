package hw7.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class StocksId implements Serializable {
    @Column(name = "ISBN")
    private int ISBN;

    @Column(name = "code")
    private String code;

    public StocksId() {}

    public StocksId(int ISBN, String code) {
        this.ISBN = ISBN;
        this.code = code;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public String getCode() {
        return this.code;
    }

}