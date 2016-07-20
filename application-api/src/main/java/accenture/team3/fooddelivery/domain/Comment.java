package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.SystemDateTime;

import javax.persistence.*;

@Entity
public class Comment {

    // Specifies the primary key of an entity
    @Id
    @GeneratedValue
    private long id;
    // to which restuarant this comment is bound
    private long restaurantId;
    private SystemDateTime systemDateTime;

    private byte status;
    private byte type;
    // text
    private String content;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Comment() {
    }

    public Comment(long restaurantId, byte status, byte type, String content, SystemDateTime systemDateTime, User user) {
        this.restaurantId = restaurantId;
        this.status = status;
        this.type = type;
        this.content = content;
        this.systemDateTime = systemDateTime;
        this.user = user;
    }

    /* Getters and Setters */

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
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

    public SystemDateTime getSystemDateTime() {
        return systemDateTime;
    }

    public void setSystemDateTime(SystemDateTime systemDateTime) {
        this.systemDateTime = systemDateTime;
    }

    //@JoinColumn(name = "ID", nullable = false)
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        if (id != comment.id) return false;
        if (restaurantId != comment.restaurantId) return false;
        if (status != comment.status) return false;
        if (type != comment.type) return false;
        return content.equals(comment.content);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (restaurantId ^ (restaurantId >>> 32));
        result = 31 * result + (int) status;
        result = 31 * result + (int) type;
        result = 31 * result + content.hashCode();
        return result;
    }
}
