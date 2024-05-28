package hw7.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity(name = "course")
@Table(name = "course")
@Getter
@Setter
public class CourseEntity {
    @Id
    @Column(name = "cno")
    private String cno;

    @Column(name = "cname")
    private String cname;

    @Column(name = "credit")
    private int credit;

    @Column(name = "sessions")
    private int sessions;

}
