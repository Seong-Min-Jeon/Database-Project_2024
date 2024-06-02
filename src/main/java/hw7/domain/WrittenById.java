package hw7.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class WrittenById implements Serializable {
    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "ISBN")
    private int ISBN;

    public WrittenById() {}

    public WrittenById(String name, String address, int ISBN) {
        this.name = name;
        this.address = address;
        this.ISBN = ISBN;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {return this.address;}

    public int getISBN() {return this.ISBN;}

}