package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.classifier.Status;
import accenture.team3.fooddelivery.domain.embedded.Audit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(exclude = {"id", "logo", "audit", "urls"})
@AllArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private byte[] logo;
    @OneToOne(cascade = CascadeType.ALL)
    private Delivery delivery;
    private Boolean acceptCard;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToMany(mappedBy = "restaurants", cascade = CascadeType.ALL)
    private Set<Category> categories;
    @ElementCollection
    private Map<Category, String> urls;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Rating> ratings;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Comment> comments;
    @OneToMany
    private Set<WorkDay> schedule;
    @Embedded
    private Audit audit;

    public Restaurant() {
    }

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