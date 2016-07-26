package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.embedded.Audit;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(exclude = {"id", "audit", "comments", "roles", "rating"})
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"comments", "roles", "rating"})
public class User {

    @Id
    @GeneratedValue
    protected Long id;
    protected String firstName;
    protected String lastName;
    protected String password;
    protected String email;
    protected String login;
    @ManyToMany(cascade = CascadeType.ALL)
    protected Set<UserRole> roles;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    protected Set<Comment> comments;
    @Embedded
    protected Audit audit;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Rating> rating;

}
