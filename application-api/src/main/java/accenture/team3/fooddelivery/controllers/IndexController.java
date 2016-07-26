package accenture.team3.fooddelivery.controllers;

import accenture.team3.fooddelivery.services.category.CategoryService;
import accenture.team3.fooddelivery.shared.IndexInit;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {

    private CategoryService categoryService;


    @RequestMapping
    public String index() {

        return "index";
    }

    @RequestMapping(value = "/init")
    @ResponseBody
    public ResponseEntity<IndexInit> inti() {
        return null;
    }
}
