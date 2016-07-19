package accenture.team3.fooddelivery.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by student on 7/19/16.
 */
@Entity
public class User {


    @Id // will be used as PRIMARYKEY
    @GeneratedValue(strategy = GenerationType.AUTO) // JPA will take care of generating this value
    private long id;
    private String firstname;
    private String lastname;
    // top user/moderator/admin/etc
    private byte accessLevel;
    private String email;

    // used by JPA for POJO
    public User() {
    }

    public User(String firstname, String lastname, byte accessLevel, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.accessLevel = accessLevel;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public byte getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(byte accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
