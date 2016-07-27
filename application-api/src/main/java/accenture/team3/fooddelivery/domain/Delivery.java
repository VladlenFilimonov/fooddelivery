package accenture.team3.fooddelivery.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalTime;

@Entity
@Data
@EqualsAndHashCode(exclude = {"id"})
@AllArgsConstructor
public class Delivery {

    @Id
    @GeneratedValue
    private Long id;
    private BigDecimal freeFrom;
    private Boolean freeByClientCard;
    private LocalTime timeMin;
    private LocalTime timeMax;
    private String phone;

    public Delivery() {
    }
}
