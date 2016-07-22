package accenture.team3.fooddelivery.domain.restaurantDependencies;

import javax.persistence.Embeddable;
import java.time.LocalTime;

@Embeddable
public class DeliveryTime {

    private LocalTime fromTime;

    private LocalTime toTime;

    public DeliveryTime() {
    }

    public DeliveryTime(LocalTime fromTime, LocalTime toTime) {
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    public LocalTime getFromTime() {
        return fromTime;
    }

    public void setFromTime(LocalTime fromTime) {
        this.fromTime = fromTime;
    }

    public LocalTime getToTime() {
        return toTime;
    }

    public void setToTime(LocalTime toTime) {
        this.toTime = toTime;
    }
}
