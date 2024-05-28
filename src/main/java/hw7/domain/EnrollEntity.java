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

//    @Id
//    @Column(name = "sno")
//    private int sno;
//
//    @Id
//    @Column(name = "cno")
//    private String cno;

//    @Id
//    @ManyToOne
//    @JoinColumn(name = "sno")
//    private StudentEntity studentEntity;
//
//    @Id
//    @ManyToOne
//    @Column(name = "cno")
//    private CourseEntity courseEntity;

    @Column(name = "grade")
    private String grade;

    @Column(name = "exam")
    private int exam;

}

