package hw7.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity(name = "student")
@Table(name = "student")
@Getter
@Setter
public class StudentEntity {
    @Id
    @Column(name = "sno")
    private int sno;

//    @Column(name = "pno")
//    private int pno;

    @ManyToOne
    @JoinColumn(name = "pno")
    private ProfessorEntity professorEntity;

    @Column(name = "sname")
    private String sname;

    @Column(name = "year")
    private int year;

    @Column(name = "dept")
    private String dept;

}
