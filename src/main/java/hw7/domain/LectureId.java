package hw7.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class LectureId implements Serializable {
    @Column(name = "cno")
    private String cno;

    @Column(name = "pno")
    private int pno;

    public LectureId() {}

    public LectureId(String cno, int pno) {
        this.cno = cno;
        this.pno = pno;
    }

    public String getCno() {
        return this.cno;
    }

    public int getPno() {
        return this.pno;
    }

}