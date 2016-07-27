package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.embedded.Audit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(exclude = {"id", "audit"})
@AllArgsConstructor
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    private String content;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
    @ManyToOne(cascade = CascadeType.ALL)
    private Restaurant restaurant;
    @Embedded
    private Audit audit;

    public Comment() {
    }
}
