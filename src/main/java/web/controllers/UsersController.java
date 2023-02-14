package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.UserService;

@Controller
@RequestMapping()
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String showStartPage() {
        return "first/start-page";
    }
    @GetMapping("/showUsers")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users/show-users";
    }

    @GetMapping("show-user/{id}")
    public String getUserById(@PathVariable("id") int id, Model model ) {
        model.addAttribute("user", userService.getUserById(id));
        return "users/show-user";
    }
}
