package accenture.team3.fooddelivery.domain;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public abstract class DatedClass {

    protected LocalDate createdAt;
    protected LocalDate updatedAt;

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }
}
