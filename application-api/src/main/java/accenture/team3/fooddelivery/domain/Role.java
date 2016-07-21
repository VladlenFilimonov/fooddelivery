package accenture.team3.fooddelivery.domain;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role implements GrantedAuthority {
    @Id
    private Long id;
    @Enumerated(EnumType.STRING)
    private SecurityRoles value;
    @ManyToMany
    private Set<User> users;

    @Override
    public String getAuthority() {
        return value.name();
    }
}
