package hw7.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
public class EnrollId implements Serializable {
    @Column(name = "sno")
    private int sno;

    @Column(name = "cno")
    private String cno;

    public EnrollId() {}

    public EnrollId(int sno, String cno) {
        this.sno = sno;
        this.cno = cno;
    }

    public int getSno() {
        return this.sno;
    }

    public String getCno() {
        return this.cno;
    }

}