package accenture.team3.fooddelivery.controllers.admin;

import accenture.team3.fooddelivery.domain.userDependencies.SecurityRoles;
import accenture.team3.fooddelivery.services.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String runAdminPanel(Model model) {
        Set<String> securityRoles = new HashSet<>();
        for (SecurityRoles securityRoles1 : SecurityRoles.values()) {
            securityRoles.add(securityRoles1.name());
        }
        model.addAttribute("simpleUserList", adminService.getSimpleUserList());
        model.addAttribute("secRoles", securityRoles);
        model.addAttribute("restaurantsForUser", adminService.getRestaurantsForUser());
        return "adminPanel/index";
    }
}
