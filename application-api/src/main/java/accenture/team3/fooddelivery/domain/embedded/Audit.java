package accenture.team3.fooddelivery.domain.embedded;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
@Data
@AllArgsConstructor
public class Audit {

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Audit() {
    }
}
