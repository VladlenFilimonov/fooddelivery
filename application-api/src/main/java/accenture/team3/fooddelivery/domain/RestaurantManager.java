package accenture.team3.fooddelivery.domain;

import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantManager extends User {

    private String phone;

}
