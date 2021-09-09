package name.krot.dz6.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Goods {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;
    private double price;
}
