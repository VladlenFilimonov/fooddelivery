package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.embedded.Audit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(exclude = {"id", "audit"})
@AllArgsConstructor
public class Rating {

    @Id
    @GeneratedValue
    private Long id;
    private Integer value;
    @ManyToOne(cascade = CascadeType.ALL)
    private Restaurant restaurant;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
    @Embedded
    private Audit audit;

    public Rating() {
    }
}
