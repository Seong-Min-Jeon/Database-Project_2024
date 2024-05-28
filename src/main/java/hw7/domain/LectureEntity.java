package hw7.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Entity(name = "lecture")
@Table(name = "lecture")
@Getter
@Setter
public class LectureEntity {
    @EmbeddedId
    private LectureId lectureId;

//    @Id
//    @Column(name = "cno")
//    private String cno;
//
//    @Id
//    @Column(name = "pno")
//    private int pno;

//    @Id
//    @ManyToOne
//    @JoinColumn(name = "cno")
//    private CourseEntity courseEntity;
//
//    @Id
//    @ManyToOne
//    @JoinColumn(name = "pno")
//    private ProfessorEntity professorEntity;

    @Column(name = "lec_time")
    private String lec_time;

    @Column(name = "room")
    private String room;

}