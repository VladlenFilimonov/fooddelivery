package accenture.team3.fooddelivery.utils;

import accenture.team3.fooddelivery.domain.Day;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by UberV on 20.07.2016.
 */
public abstract class WorkWeekFactory {

    public static Set<Day> createWorkWeek() {

        Set<Day> workWeek = new HashSet<>();

        for (int i = 0; i < 7; i++) {
            Day day = new Day();
            day.setId((long) i + 1);
            day.setDay(Day.DAY.values()[i]);
            day.setFromTime(LocalTime.now());
            day.setToTime(LocalTime.now());
            workWeek.add(day);
        }
        return workWeek;

    }

    public static void setDayWorkHours(Day.DAY day, Set<Day> workWeek, LocalTime fromTime, LocalTime toTime) {
        workWeek.stream().filter(d -> d.getDay().equals(day)).findFirst().orElse(null).setTimes(fromTime, toTime);
    }

    public static void setNormalWorkWeek(Set<Day> workWeek, LocalTime workDayFromTime, LocalTime workDayToTime,
                                         LocalTime holiDayFromTime, LocalTime holiDayToTime) {
        setDayWorkHours(Day.DAY.MONDAY, workWeek, workDayFromTime, workDayToTime);
        setDayWorkHours(Day.DAY.TUESDAY, workWeek, workDayFromTime, workDayToTime);
        setDayWorkHours(Day.DAY.WEDNESDAY, workWeek, workDayFromTime, workDayToTime);
        setDayWorkHours(Day.DAY.THURSDAY, workWeek, workDayFromTime, workDayToTime);
        setDayWorkHours(Day.DAY.FRIDAY, workWeek, workDayFromTime, workDayToTime);

        setDayWorkHours(Day.DAY.SUNDAY, workWeek, holiDayFromTime, holiDayToTime);
        setDayWorkHours(Day.DAY.SATURDAY, workWeek, holiDayFromTime, holiDayToTime);
    }

}
