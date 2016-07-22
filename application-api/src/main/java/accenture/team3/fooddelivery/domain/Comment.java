package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity
public class Comment {

    // Specifies the primary key of an entity
    @Id
    @GeneratedValue
    private long id;
    private CreateUpdateTime createUpdateTime;

    private byte status;
    private byte type;
    // text
    private String content;
    @ManyToOne
    private User user;
    @ManyToOne(targetEntity = Restaurant.class)
    private Set<Restaurant> restaurant;

    public Comment() {
    }

    public Comment(byte status, byte type, String content, CreateUpdateTime createUpdateTime, User user) {
        this.status = status;
        this.type = type;
        this.content = content;
        this.createUpdateTime = createUpdateTime;
        this.user = user;
    }

    /* Getters and Setters */

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CreateUpdateTime getCreateUpdateTime() {
        return createUpdateTime;
    }

    public void setCreateUpdateTime(CreateUpdateTime createUpdateTime) {
        this.createUpdateTime = createUpdateTime;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Restaurant> getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Set<Restaurant> restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;

        Comment comment = (Comment) o;

        if (status != comment.status) return false;
        if (type != comment.type) return false;
        return content != null ? content.equals(comment.content) : comment.content == null;

    }

    @Override
    public int hashCode() {
        int result = (int) status;
        result = 31 * result + (int) type;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}
