package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.classifier.SecurityRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(exclude = "id")
@AllArgsConstructor
public class UserRole {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "roles")
    private Set<User> user;
    @Enumerated(EnumType.STRING)
    private SecurityRole role;

    public UserRole() {
    }
}
