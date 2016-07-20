package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.SystemDateTime;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

// Specifies that the class is an entity.
@Entity
@Table(name = "user")
public class User {

    // Specifies the primary key of an entity
    //@Id
    //@GeneratedValue
    private long id;

    private byte status;
    private String role;
    private SystemDateTime systemDateTime;
    private Set<Comment> comments = new HashSet<Comment>(0);

    /* Getters and Setters */

    // POJO needs no argument constructor
    public User() {
    }

    public User(SystemDateTime systemDateTime, byte status, String role) {
        this.systemDateTime = systemDateTime;
        this.status = status;
        this.role = role;
    }

    public User(SystemDateTime systemDateTime, byte status, String role, Set<Comment> comments) {
        this.systemDateTime = systemDateTime;
        this.status = status;
        this.role = role;
        this.comments = comments;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public SystemDateTime getSystemDateTime() {
        return systemDateTime;
    }

    public void setSystemDateTime(SystemDateTime systemDateTime) {
        this.systemDateTime = systemDateTime;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    public Set<Comment> getComments() {
        return this.comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}
