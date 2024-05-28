package hw7.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity(name = "enroll")
@Table(name = "enroll")
@Getter
@Setter
public class EnrollEntity {
    @EmbeddedId
    private EnrollId enrollId;

    @ManyToOne
    @JoinColumn(name = "sno")
    @MapsId("sno")
    private StudentEntity studentEntity;

    @ManyToOne
    @JoinColumn(name = "cno")
    @MapsId("cno")
    private CourseEntity courseEntity;

    @Column(name = "grade")
    private String grade;

    @Column(name = "exam")
    private int exam;

}

