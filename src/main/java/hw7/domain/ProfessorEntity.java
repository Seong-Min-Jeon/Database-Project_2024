package hw7.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity(name = "professor")
@Table(name = "professor")
@Getter
@Setter
public class ProfessorEntity {
    @Id
    @Column(name = "pno")
    private int pno;

    @Column(name = "pname")
    private String pname;

    @Column(name = "pmajor")
    private String pmajor;

    @Column(name = "pdept")
    private String pdept;

}
