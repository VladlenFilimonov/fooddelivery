package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.SystemDateTime;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Rating {

    @Id
    @GeneratedValue
    private long id;
    private byte status;
    private SystemDateTime systemDateTime;
    @ManyToOne(targetEntity = Restaurant.class)
    private Set<Restaurant> restaurant;
    @OneToOne
    private Rating user;

    public Rating() {

    }

    public Rating(byte status, SystemDateTime systemDateTime) {
        this.status = status;
        this.systemDateTime = systemDateTime;
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


    public SystemDateTime getSystemDateTime() {
        return systemDateTime;
    }

    public void setSystemDateTime(SystemDateTime systemDateTime) {
        this.systemDateTime = systemDateTime;
    }
}
