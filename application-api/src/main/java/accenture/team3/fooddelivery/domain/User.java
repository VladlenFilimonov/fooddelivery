package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.embedded.Audit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(exclude = {"id", "audit", "comments"})
@AllArgsConstructor
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
    @OneToMany(cascade = CascadeType.ALL)
    protected Set<Comment> comments;
    @Embedded
    protected Audit audit;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Rating> rating;

    public User() {
    }
}
