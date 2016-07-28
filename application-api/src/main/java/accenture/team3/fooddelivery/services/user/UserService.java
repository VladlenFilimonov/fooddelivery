package accenture.team3.fooddelivery.services.user;

import accenture.team3.fooddelivery.domain.User;
import accenture.team3.fooddelivery.shared.user.UserGetDto;
import accenture.team3.fooddelivery.shared.user.UserPostDto;

public interface UserService {

    User getUserById(Long id);

    UserGetDto createUser(UserPostDto userPostDto);
}
