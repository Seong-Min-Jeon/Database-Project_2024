package hw7.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class AuthorId implements Serializable {
    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    public AuthorId() {}

    public AuthorId(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

}