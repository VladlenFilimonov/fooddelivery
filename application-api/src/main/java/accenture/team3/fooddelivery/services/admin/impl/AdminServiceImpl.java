package accenture.team3.fooddelivery.services.admin.impl;

import accenture.team3.fooddelivery.dao.RestaurantDao;
import accenture.team3.fooddelivery.dao.UserDao;
import accenture.team3.fooddelivery.dao.UserRolesDao;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.domain.User;
import accenture.team3.fooddelivery.domain.UserDependencies.UserRole;
import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;
import accenture.team3.fooddelivery.dto.admin.AddNewUserDto;
import accenture.team3.fooddelivery.dto.admin.RestaurantListForUsersDto;
import accenture.team3.fooddelivery.dto.admin.SimpleUserListDto;
import accenture.team3.fooddelivery.dto.admin.UserDto;
import accenture.team3.fooddelivery.services.admin.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AdminServiceImpl implements AdminService {

    private RestaurantDao restaurantDao;
    private UserDao userDao;
    private ModelMapper modelMapper;
    private UserRolesDao userRolesDao;

    @Autowired
    public AdminServiceImpl(RestaurantDao restaurantDao, UserDao userDao, ModelMapper modelMapper, UserRolesDao userRolesDao) {
        this.restaurantDao = restaurantDao;
        this.userDao = userDao;
        this.modelMapper = modelMapper;
        this.userRolesDao = userRolesDao;
    }

    @Override
    public List<RestaurantListForUsersDto> getRestaurantsForUser() {
        List<RestaurantListForUsersDto> restaurantSetForUser = new ArrayList<>();
        List<Restaurant> restaurants = (List<Restaurant>) restaurantDao.findAll();
        restaurants.forEach(restaurant -> restaurantSetForUser.add(modelMapper.map(restaurant, RestaurantListForUsersDto.class)));
        return restaurantSetForUser;
    }

    @Override
    public UserDto addUser(AddNewUserDto addNewUserDto) {
        if (!addNewUserDto.getPassword().equals(addNewUserDto.getRePassword())) return null;
        User user = modelMapper.map(addNewUserDto, User.class);
        user.setCreateUpdateTime(new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()));
        List<UserRole> userRoleList = (List<UserRole>) userRolesDao.findAll();
        Set<UserRole> userRolesFromDB = new HashSet<>(userRoleList);
        Set<UserRole> userRoles = new HashSet<>();
        for (UserRole userRoleFromDB : userRolesFromDB) {
            userRoles.addAll(addNewUserDto.getUserRoles().stream().
                    filter(s -> s.equals(userRoleFromDB.getValue().name())).
                    map(s -> userRoleFromDB).
                    collect(Collectors.toList()));
        }
        user.setUserRoles(userRoles);
        UserDto userDto = modelMapper.map(userDao.save(user), UserDto.class);
        return userDto;
    }

    @Override
    public List<SimpleUserListDto> getSimpleUserList() {
        List<SimpleUserListDto> simpleUserListDtos = new ArrayList<>();
        List<User> users = (List<User>) userDao.findAll();
        users.forEach(user -> simpleUserListDtos.add(modelMapper.map(user, SimpleUserListDto.class)));
        return simpleUserListDtos;
    }


}
