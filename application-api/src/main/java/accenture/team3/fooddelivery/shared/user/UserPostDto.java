package accenture.team3.fooddelivery.shared.user;

import lombok.Data;

@Data
public class UserPostDto {
    protected String firstName;
    protected String lastName;
    protected String password;
    protected String email;
}
