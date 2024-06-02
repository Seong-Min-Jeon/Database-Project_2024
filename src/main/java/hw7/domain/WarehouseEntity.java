package hw7.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "warehouse")
@Table(name = "warehouse")
@Getter
@Setter
public class WarehouseEntity {
    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

}
