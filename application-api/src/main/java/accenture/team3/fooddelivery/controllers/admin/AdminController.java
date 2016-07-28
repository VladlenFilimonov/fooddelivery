package accenture.team3.fooddelivery.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
//
//    private AdminService adminService;
//
//    @Autowired
//    public AdminController(AdminService adminService) {
//        this.adminService = adminService;
//    }
//
//    @RequestMapping(method = RequestMethod.GET)
//    public String runAdminPanel(Model model) {
//        Set<String> securityRoles = new HashSet<>();
//        for (SecurityRoles securityRoles1 : SecurityRoles.values()) {
//            securityRoles.add(securityRoles1.name());
//        }
//        model.addAttribute("simpleUserList", adminService.getSimpleUserList());
//        model.addAttribute("secRoles", securityRoles);
//        model.addAttribute("restaurantsForUser", adminService.getRestaurantsForUser());
//        return "adminPanel/categories";
//    }
}
