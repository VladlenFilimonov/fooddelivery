package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.embedded.Audit;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(exclude = {"id", "audit"})
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"restaurant", "user"})
public class Rating {

    @Id
    @GeneratedValue
    private Long id;
    private Integer value;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
    @Embedded
    private Audit audit;
}
