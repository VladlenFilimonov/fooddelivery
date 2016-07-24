package accenture.team3.fooddelivery.dto.admin;

import accenture.team3.fooddelivery.domain.Comment;
import accenture.team3.fooddelivery.domain.Rating;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.domain.UserDependencies.UserRole;
import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;

import java.util.Set;

public class UserDto {

    private long id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String loginName;
    private byte status;
    private Set<UserRole> userRoles;
    private CreateUpdateTime createUpdateTime;
    private Set<Comment> comments;
    private Set<Restaurant> restaurant;
    private Rating rating;

    public UserDto(long id, String firstName, String lastName, String password, String email, String loginName, byte status, Set<UserRole> userRoles, CreateUpdateTime createUpdateTime, Set<Comment> comments, Set<Restaurant> restaurant, Rating rating) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.loginName = loginName;
        this.status = status;
        this.userRoles = userRoles;
        this.createUpdateTime = createUpdateTime;
        this.comments = comments;
        this.restaurant = restaurant;
        this.rating = rating;
    }

    public UserDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public CreateUpdateTime getCreateUpdateTime() {
        return createUpdateTime;
    }

    public void setCreateUpdateTime(CreateUpdateTime createUpdateTime) {
        this.createUpdateTime = createUpdateTime;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Restaurant> getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Set<Restaurant> restaurant) {
        this.restaurant = restaurant;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
