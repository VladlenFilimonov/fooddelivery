package accenture.team3.fooddelivery.domain.builders;

import accenture.team3.fooddelivery.domain.Day;
import accenture.team3.fooddelivery.domain.Schedule;
import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;

import java.util.ArrayList;

/**
 * Created by UberV on 21.07.2016.
 */
public class ScheduleBuilder {


    private byte status;
    private CreateUpdateTime createUpdateTime;
    private ArrayList<Day> openingHours;

    public ScheduleBuilder() {
    }

    public ScheduleBuilder withStatus(byte status) {
        this.status = status;
        return this;
    }

    public ScheduleBuilder withOpeningHoures(ArrayList<Day> openingHours) {
        this.openingHours = openingHours;
        return this;
    }

    public ScheduleBuilder withCreateUpdateTime(CreateUpdateTime createUpdateTime) {
        this.createUpdateTime = createUpdateTime;
        return this;
    }

    public Schedule build() {
        Schedule schedule = new Schedule();
        schedule.setStatus(status);
        schedule.setCreateUpdateTime(createUpdateTime);
        schedule.setOpeningHours(openingHours);

        return schedule;
    }

}
