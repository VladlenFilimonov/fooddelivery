package accenture.team3.fooddelivery.services.admin;

import accenture.team3.fooddelivery.dto.admin.AddNewUserDto;
import accenture.team3.fooddelivery.dto.admin.RestaurantListForUsersDto;
import accenture.team3.fooddelivery.dto.admin.SimpleUserListDto;
import accenture.team3.fooddelivery.dto.admin.UserDto;

import java.util.List;

public interface AdminService {
    List<RestaurantListForUsersDto> getRestaurantsForUser();

    UserDto addUser(AddNewUserDto addNewUserDto);

    List<SimpleUserListDto> getSimpleUserList();
}
