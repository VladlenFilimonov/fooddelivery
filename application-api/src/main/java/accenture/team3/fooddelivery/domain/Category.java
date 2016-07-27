package accenture.team3.fooddelivery.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(exclude = {"id", "logo", "restaurants"})
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "restaurants")
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String logo;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Restaurant> restaurants;
}
