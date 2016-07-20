package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.SystemDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Specifies that the class is an entity.
@Entity
public class User {

    // Specifies the primary key of an entity
    @Id
    @GeneratedValue
    private long id;

    private byte status;
    private String role;
    private SystemDateTime systemDateTime;

    /* Getters and Setters */

    // POJO needs no argument constructor
    public User() {
    }

    public User(SystemDateTime systemDateTime, byte status, String role) {
        this.systemDateTime = systemDateTime;
        this.status = status;
        this.role = role;
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
}
