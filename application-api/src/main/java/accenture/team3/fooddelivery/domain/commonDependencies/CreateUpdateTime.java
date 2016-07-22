package accenture.team3.fooddelivery.domain.commonDependencies;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class CreateUpdateTime {

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CreateUpdateTime() {
    }

    public CreateUpdateTime(LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
