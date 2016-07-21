package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Schedule {

    @Id
    @GeneratedValue
    private long id;
    private byte status;
    private CreateUpdateTime createUpdateTime;
    @Embedded
    private ArrayList<Day> openingHours;

    public Schedule(CreateUpdateTime createUpdateTime, byte status, ArrayList<Day> openingHours) {
        this.status = status;
        this.openingHours = openingHours;
        this.createUpdateTime = createUpdateTime;
    }

    public Schedule() {

    }
    // TODO aint it better to save weekday and working hour in an enum like Monday("09:00","21:30")

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

    public ArrayList<Day> getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(ArrayList<Day> openingHours) {
        this.openingHours = openingHours;
    }

    public CreateUpdateTime getCreateUpdateTime() {
        return createUpdateTime;
    }

    public void setCreateUpdateTime(CreateUpdateTime createUpdateTime) {
        this.createUpdateTime = createUpdateTime;
    }


}
