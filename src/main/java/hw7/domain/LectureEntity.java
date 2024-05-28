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

    @ManyToOne
    @JoinColumn(name = "cno")
    @MapsId("cno")
    private CourseEntity courseEntity;

    @ManyToOne
    @JoinColumn(name = "pno")
    @MapsId("pno")
    private ProfessorEntity professorEntity;

    @Column(name = "lec_time")
    private String lec_time;

    @Column(name = "room")
    private String room;

}