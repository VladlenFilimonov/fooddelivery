package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.embedded.Audit;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(exclude = {"id", "audit"})
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"restaurant", "user"})
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    private String content;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
    @Embedded
    private Audit audit;

    @PrePersist
    @PreUpdate
    public void update() {
        LocalDateTime now = LocalDateTime.now();
        if (audit == null) {
            audit = new Audit();
            audit.setCreatedAt(now);
            audit.setUpdatedAt(now);
        } else {
            audit.setUpdatedAt(now);
        }

    }
}
