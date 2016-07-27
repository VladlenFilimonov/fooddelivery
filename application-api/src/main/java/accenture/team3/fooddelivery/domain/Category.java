package accenture.team3.fooddelivery.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(exclude = {"id", "logo", "restaurants"})
@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private byte[] logo;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Restaurant> restaurants;

    public Category() {
    }
}
