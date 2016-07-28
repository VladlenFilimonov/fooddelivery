package accenture.team3.fooddelivery.shared.user;

import accenture.team3.fooddelivery.domain.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserGetDto {

    protected Long id;
    protected String firstName;
    protected String lastName;
    protected String email;

    public UserGetDto(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
    }
}
