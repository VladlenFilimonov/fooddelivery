package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.classifier.Status;
import accenture.team3.fooddelivery.domain.embedded.Audit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(exclude = {"id", "logo", "audit", "urls",
        "workDays", "comments", "ratings", "categories"})
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String logo;
    @OneToOne(cascade = CascadeType.ALL)
    private Delivery delivery;
    private Boolean acceptCard;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToMany(mappedBy = "restaurants", cascade = CascadeType.ALL)
    private Set<Category> categories;
    @ElementCollection
    private Map<Category, String> urls;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurant")
    private Set<Rating> ratings;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurant")
    private Set<Comment> comments;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurant")
    private Set<WorkDay> workDays;
    @Embedded
    private Audit audit;

    public boolean isWorkingNow() {
        if (!this.getStatus().equals(Status.ACTIVE)) {
            return false;
        }
        LocalDateTime now = LocalDateTime.now();
        return workDays
                .stream()
                .filter(d ->
                        d.getDay().equals(now.getDayOfWeek())
                                && d.getOpenAt().isBefore(now.toLocalTime())
                                && d.getCloseAt().isAfter(now.toLocalTime())
                )
                .findAny()
                .isPresent();
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