package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Rating {

    @Id
    @GeneratedValue
    private long id;
    private byte status;
    private CreateUpdateTime createUpdateTime;
    @ManyToOne(targetEntity = Restaurant.class)
    private Set<Restaurant> restaurant;
    @OneToOne
    private User user;

    public Rating() {

    }

    public Rating(byte status, CreateUpdateTime createUpdateTime) {
        this.status = status;
        this.createUpdateTime = createUpdateTime;
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


    public CreateUpdateTime getCreateUpdateTime() {
        return createUpdateTime;
    }

    public void setCreateUpdateTime(CreateUpdateTime createUpdateTime) {
        this.createUpdateTime = createUpdateTime;
    }


}
