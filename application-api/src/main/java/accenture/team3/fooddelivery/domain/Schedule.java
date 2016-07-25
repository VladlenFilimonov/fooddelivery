package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
public class Schedule {

    @Id
    @GeneratedValue
    private long id;
    private byte status;
    private CreateUpdateTime createUpdateTime;
    @Enumerated(value = EnumType.STRING)
    private DayOfWeek weekDay;
    private LocalTime openTime;
    private LocalTime closeTime;
    @ManyToOne
    private Restaurant restaurant;


    public Schedule() {
    }

    public Schedule(byte status, CreateUpdateTime createUpdateTime, DayOfWeek weekDay, LocalTime openTime, LocalTime closeTime, Restaurant restaurant) {
        this.status = status;
        this.createUpdateTime = createUpdateTime;
        this.weekDay = weekDay;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.restaurant = restaurant;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public CreateUpdateTime getCreateUpdateTime() {
        return createUpdateTime;
    }

    public void setCreateUpdateTime(CreateUpdateTime createUpdateTime) {
        this.createUpdateTime = createUpdateTime;
    }

    public DayOfWeek getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(DayOfWeek weekDay) {
        this.weekDay = weekDay;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public void setOpenTime(LocalTime openTime) {
        this.openTime = openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(LocalTime closeTime) {
        this.closeTime = closeTime;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schedule schedule = (Schedule) o;

        if (status != schedule.status) return false;
        if (weekDay != schedule.weekDay) return false;
        if (openTime != null ? !openTime.equals(schedule.openTime) : schedule.openTime != null) return false;
        return closeTime != null ? closeTime.equals(schedule.closeTime) : schedule.closeTime == null;

    }

    @Override
    public int hashCode() {
        int result = (int) status;
        result = 31 * result + (weekDay != null ? weekDay.hashCode() : 0);
        result = 31 * result + (openTime != null ? openTime.hashCode() : 0);
        result = 31 * result + (closeTime != null ? closeTime.hashCode() : 0);
        return result;
    }
}
