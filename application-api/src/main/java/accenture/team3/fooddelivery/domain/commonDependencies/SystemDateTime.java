package accenture.team3.fooddelivery.domain.commonDependencies;

import javax.persistence.Embeddable;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@Embeddable
public class SystemDateTime {

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public SystemDateTime() {
    }

    public SystemDateTime(LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @PrePersist
    void onCreate() {
        this.setCreatedAt(LocalDateTime.now());
    }

    @PreUpdate
    void onPersist() {
        this.setUpdatedAt(LocalDateTime.now());
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
