package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;

import javax.persistence.*;

@Entity
public class Rating {

    @Id
    @GeneratedValue
    private long id;
    private byte status;
    private CreateUpdateTime createUpdateTime;
    @ManyToOne
    private Restaurant restaurant;
    @OneToOne
    private User user;

    public Rating() {

    }

    public Rating(byte status, CreateUpdateTime createUpdateTime, Restaurant restaurant, User user) {
        this.status = status;
        this.createUpdateTime = createUpdateTime;
        this.restaurant = restaurant;
        this.user = user;
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

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rating rating = (Rating) o;

        if (id != rating.id) return false;
        if (status != rating.status) return false;
        return createUpdateTime != null ? createUpdateTime.equals(rating.createUpdateTime) : rating.createUpdateTime == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) status;
        result = 31 * result + (createUpdateTime != null ? createUpdateTime.hashCode() : 0);
        return result;
    }
}
