package accenture.team3.fooddelivery.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

// Specifies that the class is an entity.
@Entity
public class User extends DatedClass {

    // Specifies the primary key of an entity
    @Id
    @GeneratedValue
    private long id;

    private byte status;
    private byte type;


    /* Getters and Setters */

    // POJO needs no argument constructor
    public User() {
    }

    public User(LocalDateTime reatedAt, LocalDateTime updatedAt, byte status, byte type) {
        this.createdAt = reatedAt;
        this.updatedAt = updatedAt;
        this.status = status;
        this.type = type;
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

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }
}
