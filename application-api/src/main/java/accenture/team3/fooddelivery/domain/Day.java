package accenture.team3.fooddelivery.domain;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Day {

    @Id
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESTAURANT_ID")
    private Restaurant restaurant;
    private DAY day;
    private LocalTime fromTime;
    private LocalTime toTime;

    public Day(Long id, Restaurant restaurant, DAY day, LocalTime fromTime, LocalTime toTime) {
        this.id = id;
        this.restaurant = restaurant;
        this.day = day;
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    public Day() {

    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setTimes(LocalTime fromTime, LocalTime toTime) {
        setFromTime(fromTime);
        setFromTime(toTime);
    }

    public LocalTime getFromTime() {
        return fromTime;
    }

    public void setFromTime(LocalTime fromTime) {
        this.fromTime = fromTime;
    }

    public DAY getDay() {
        return day;
    }

    public void setDay(DAY day) {
        this.day = day;
    }

    public LocalTime getToTime() {
        return toTime;
    }

    public void setToTime(LocalTime toTime) {
        this.toTime = toTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Day day1 = (Day) o;

        if (id != null ? !id.equals(day1.id) : day1.id != null) return false;
        if (day != day1.day) return false;
        if (fromTime != null ? !fromTime.equals(day1.fromTime) : day1.fromTime != null) return false;
        return toTime != null ? toTime.equals(day1.toTime) : day1.toTime == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (fromTime != null ? fromTime.hashCode() : 0);
        result = 31 * result + (toTime != null ? toTime.hashCode() : 0);
        return result;
    }

    public enum DAY {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
