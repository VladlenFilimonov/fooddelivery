package accenture.team3.fooddelivery.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(exclude = {"id"})
@AllArgsConstructor
public class ContactInfo {

    @Id
    @GeneratedValue
    private Long id;
    private String url;
    private String phone;
    @OneToOne(cascade = CascadeType.ALL)
    private RestaurantManager manager;

    public ContactInfo() {
    }
}
