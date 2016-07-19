package accenture.team3.fooddelivery.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalTime;
import java.util.ArrayList;

@Entity
public class Schedule extends DatedClass {

    @Id
    @GeneratedValue
    private long id;
    private long restaurantId;
    private byte status;
    @Embedded
    private ArrayList<Day> openingHours;

    public Schedule(long restaurantId, LocalTime createdAt, LocalTime updatedAt, byte status, ArrayList<Day> openingHours) {
        this.restaurantId = restaurantId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
        this.openingHours = openingHours;
    }

    public Schedule() {

    }
    // TODO aint it better to save weekday and working hour in an enum like Monday("09:00","21:30")

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schedule schedule = (Schedule) o;

        if (id != schedule.id) return false;
        if (restaurantId != schedule.restaurantId) return false;
        if (status != schedule.status) return false;
        if (!createdAt.equals(schedule.createdAt)) return false;
        if (!updatedAt.equals(schedule.updatedAt)) return false;
        return openingHours.equals(schedule.openingHours);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (restaurantId ^ (restaurantId >>> 32));
        result = 31 * result + createdAt.hashCode();
        result = 31 * result + updatedAt.hashCode();
        result = 31 * result + (int) status;
        result = 31 * result + openingHours.hashCode();
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public ArrayList<Day> getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(ArrayList<Day> openingHours) {
        this.openingHours = openingHours;
    }
}
