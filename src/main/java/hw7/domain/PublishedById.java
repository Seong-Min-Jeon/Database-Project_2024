package hw7.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PublishedById implements Serializable {
    @Column(name = "name")
    private String name;

    @Column(name = "ISBN")
    private int ISBN;

    public PublishedById() {}

    public PublishedById(String name, int ISBN) {
        this.name = name;
        this.ISBN = ISBN;
    }

    public String getName() {
        return this.name;
    }

    public int getISBN() {return this.ISBN;}

}