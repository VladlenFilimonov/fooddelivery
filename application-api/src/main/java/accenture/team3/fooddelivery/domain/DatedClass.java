package accenture.team3.fooddelivery.domain;

import javax.persistence.MappedSuperclass;
import java.time.LocalTime;

//Designates a class whose mapping information is applied to the entities that inherit from it.
@MappedSuperclass
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
