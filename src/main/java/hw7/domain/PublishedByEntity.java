package hw7.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "publishedBy")
@Table(name = "publishedBy")
@Getter
@Setter
public class PublishedByEntity {
    @EmbeddedId
    private PublishedById publishedById;

    @ManyToOne
    @JoinColumn(name = "name")
    @MapsId("name")
    private PublisherEntity publisherEntity;

    @ManyToOne
    @JoinColumn(name = "ISBN")
    @MapsId("ISBN")
    private BookEntity bookEntity;

}

