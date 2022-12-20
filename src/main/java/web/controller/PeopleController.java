package web.controller;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.DAO.UserDao;
import web.Model.Car;
import web.Model.User;
import web.Service.CarService;

import java.util.List;


@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@RequestMapping("/users")
@Controller
public class PeopleController {

    UserDao userDao;

    @Autowired
    public PeopleController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping()
    public String listUser(Model model) {
        model.addAttribute("users",userDao.listUsers());
        return "users/listUsers";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") long id, Model model) {
        model.addAttribute("user", userDao.getUserById(id));
        return "users/show";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "users/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user) {
        userDao.add(user);
        return "redirect:/users";
    }
}


