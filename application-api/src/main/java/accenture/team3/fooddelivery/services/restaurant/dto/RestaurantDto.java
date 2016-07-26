package accenture.team3.fooddelivery.services.restaurant.dto;

import accenture.team3.fooddelivery.domain.*;
import accenture.team3.fooddelivery.domain.classifier.Status;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

@Data
public class RestaurantDto {

    private String name;
    private byte[] logo;
    private Delivery delivery;
    private Boolean acceptCard;
    private Status status;
    private Set<Category> categories;
    private Map<Category, String> urls;
    private Set<Rating> ratings;
    private Set<Comment> comments;
    private Set<WorkDay> schedule;

    public boolean isWorkingNow() {
        if (!this.getStatus().equals(Status.ACTIVE)) {
            return false;
        }
        LocalDateTime now = LocalDateTime.now();
        return schedule
                .stream()
                .filter(d ->
                        d.getDay().equals(now.getDayOfWeek())
                                && d.getOpenAt().isBefore(now.toLocalTime())
                                && d.getCloseAt().isAfter(now.toLocalTime())
                )
                .findAny()
                .isPresent();
    }
}
