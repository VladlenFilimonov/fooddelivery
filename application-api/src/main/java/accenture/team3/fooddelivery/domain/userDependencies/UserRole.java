package accenture.team3.fooddelivery.domain.userDependencies;

import accenture.team3.fooddelivery.domain.User;

import javax.persistence.*;
import java.util.Set;

@Entity
public class UserRole {
    @Id
    @GeneratedValue
    private long id;
    @Enumerated(EnumType.STRING)
    private SecurityRoles value;
    @ManyToMany
    private Set<User> userSet;

    public UserRole() {
    }

    public UserRole(SecurityRoles value) {
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SecurityRoles getValue() {
        return value;
    }

    public void setValue(SecurityRoles value) {
        this.value = value;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRole userRole = (UserRole) o;

        return value == userRole.value;

    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
