package accenture.team3.fooddelivery.domain;

import javax.persistence.Embeddable;
import java.time.LocalTime;

@Embeddable
public class Day {

    private DAY day;
    private LocalTime fromTime;
    private LocalTime toTime;

    public Day() {
    }

    public Day(LocalTime from, LocalTime to) {
        this.fromTime = from;
        this.toTime = to;
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

        Day day = (Day) o;

        if (!fromTime.equals(day.fromTime)) return false;
        return toTime.equals(day.toTime);

    }

    @Override
    public int hashCode() {
        int result = fromTime.hashCode();
        result = 31 * result + toTime.hashCode();
        return result;
    }

    public enum DAY {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
