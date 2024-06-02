package hw7.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "writtenBy")
@Table(name = "writtenBy")
@Getter
@Setter
public class WrittenByEntity {
    @EmbeddedId
    private WrittenById writtenById;

    @ManyToOne
    @JoinColumn(name = "name", insertable=false, updatable=false)
    @JoinColumn(name = "address", insertable=false, updatable=false)
    private AuthorEntity authorEntity;

//    @ManyToOne
//    @JoinColumn(name = "address")
//    @MapsId("address")
//    private AuthorEntity authorEntity2;

    @ManyToOne
    @JoinColumn(name = "ISBN")
    @MapsId("ISBN")
    private BookEntity bookEntity;

}

