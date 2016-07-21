package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.SystemDateTime;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Specifies that the class is an entity.
@Entity
@Table(name = "user")
public class User {

    // Specifies the primary key of an entity
    @Id
    private long id;
    private String login;
    private byte status;
    //should be encryped before persist
    private String password;

    @ManyToMany
    private Set<Role> roles;
    private SystemDateTime systemDateTime;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<Comment> comments = new HashSet<Comment>(0);

    /* Getters and Setters */

    // POJO needs no argument constructor
    public User() {
    }

    public User(long id, String login, byte status, String password, Set<Role> roles, SystemDateTime systemDateTime, Set<Comment> comments) {
        this.id = id;
        this.login = login;
        this.status = status;
        this.password = password;
        this.roles = roles;
        this.systemDateTime = systemDateTime;
        this.comments = comments;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public SystemDateTime getSystemDateTime() {
        return systemDateTime;
    }

    public void setSystemDateTime(SystemDateTime systemDateTime) {
        this.systemDateTime = systemDateTime;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (status != user.status) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (roles != null ? !roles.equals(user.roles) : user.roles != null) return false;
        return systemDateTime != null ? systemDateTime.equals(user.systemDateTime) : user.systemDateTime == null;

    }

    @Override
    public int hashCode() {
        int result = (int) status;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        result = 31 * result + (systemDateTime != null ? systemDateTime.hashCode() : 0);
        return result;
    }
}
