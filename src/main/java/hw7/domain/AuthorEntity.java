package hw7.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "author")
@Table(name = "author")
@Getter
@Setter
public class AuthorEntity {

    @EmbeddedId
    private AuthorId authorId;

    @Column(name = "url")
    private String url;

}

