package accenture.team3.fooddelivery.controllers.admin;

import accenture.team3.fooddelivery.dto.admin.AddNewUserDto;
import accenture.team3.fooddelivery.dto.admin.UserDto;
import accenture.team3.fooddelivery.services.admin.AdminService;
import accenture.team3.fooddelivery.services.exceptions.ArgumentValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("admin/rest")
public class AdminRestController {

    private AdminService adminService;

    @Autowired
    public AdminRestController(AdminService adminService) {
        this.adminService = adminService;
    }

    @ExceptionHandler(ArgumentValidationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<FieldError> validationHandler(ArgumentValidationException e) {
        return e.getResult().getFieldErrors();
    }

    @RequestMapping(method = RequestMethod.POST)
    public UserDto addUser(@RequestBody @Valid AddNewUserDto userDto,
                           BindingResult result) {

        if (result.hasErrors()) {
            throw new ArgumentValidationException(result);
        }
        return adminService.addUser(userDto);
    }

}
