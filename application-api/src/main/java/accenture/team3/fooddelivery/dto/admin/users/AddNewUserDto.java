package accenture.team3.fooddelivery.dto.admin.users;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.Set;


public class AddNewUserDto {

    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @Length(min = 3)
    private String password;

    private String rePassword;
    @Email
    private String email;
    @NotEmpty
    @Length(min = 3)
    private String loginName;
    @NotNull
    private Set<String> userRoles;
    private Set<Long> restaurant;

    public AddNewUserDto() {
    }

    public AddNewUserDto(String firstName, String lastName, String password, String rePassword, String email, String loginName, Set<String> userRoles, Set<Long> restaurant) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.rePassword = rePassword;
        this.email = email;
        this.loginName = loginName;
        this.userRoles = userRoles;
        this.restaurant = restaurant;
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

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
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

    public Set<String> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<String> userRoles) {
        this.userRoles = userRoles;
    }

    public Set<Long> getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Set<Long> restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "AddNewUserDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", rePassword='" + rePassword + '\'' +
                ", email='" + email + '\'' +
                ", loginName='" + loginName + '\'' +
                ", userRoles=" + userRoles +
                ", restaurant=" + restaurant +
                '}';
    }
}
