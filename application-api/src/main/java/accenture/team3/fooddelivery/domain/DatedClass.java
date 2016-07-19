package accenture.team3.fooddelivery.domain;

import javax.persistence.Entity;
import java.time.LocalTime;

@Entity
public abstract class DatedClass {

    protected LocalTime createdAt;
    protected LocalTime updatedAt;

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
