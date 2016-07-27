package accenture.team3.fooddelivery.controllers.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/rest")
public class AdminRestController {
//
//    private AdminService adminService;
//
//    @Autowired
//    public AdminRestController(AdminService adminService) {
//        this.adminService = adminService;
//    }
//
//    @ExceptionHandler(ArgumentValidationException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public List<FieldError> validationHandler(ArgumentValidationException e) {
//        return e.getResult().getFieldErrors();
//    }
//
//    @RequestMapping(method = RequestMethod.POST)
//    public UserDto addUser(@RequestBody @Valid AddNewUserDto userDto,
//                           BindingResult result) {
//
//        if (result.hasErrors()) {
//            throw new ArgumentValidationException(result);
//        }
//        return adminService.addUser(userDto);
//    }

}
