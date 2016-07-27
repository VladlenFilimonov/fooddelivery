package accenture.team3.fooddelivery.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
@Data
@EqualsAndHashCode(exclude = {"id"})
@AllArgsConstructor
public class WorkDay {

    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private DayOfWeek day;
    private LocalTime openAt;
    private LocalTime closeAt;
    @ManyToOne(cascade = CascadeType.ALL)
    private Restaurant restaurant;

    public WorkDay() {
    }
}
