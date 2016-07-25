package accenture.team3.fooddelivery.services.admin;

import accenture.team3.fooddelivery.dto.admin.users.AddNewUserDto;
import accenture.team3.fooddelivery.dto.admin.users.RestaurantListForUsersDto;
import accenture.team3.fooddelivery.dto.admin.users.SimpleUserListDto;
import accenture.team3.fooddelivery.dto.admin.users.UserDto;

import java.util.List;

public interface AdminService {

    List<RestaurantListForUsersDto> getRestaurantsForUser();

    UserDto addUser(AddNewUserDto addNewUserDto);

    List<SimpleUserListDto> getSimpleUserList();
}
