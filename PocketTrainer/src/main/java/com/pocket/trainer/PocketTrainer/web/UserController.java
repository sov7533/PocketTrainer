package com.pocket.trainer.PocketTrainer.web;

import com.pocket.trainer.PocketTrainer.domain.Users;
import com.pocket.trainer.PocketTrainer.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/index/user")
    public void listUsers() {
        List<Users> users = usersService.listUsers();
        }

        @RequestMapping("/user")
        public String home() {
        return "redirect:/index";
        }

        @RequestMapping(value = "/add/user", method = RequestMethod.POST)
        public String addUser(@ModelAttribute("user") Users user,
                              BindingResult result) {

            usersService.addUser(user);

            return "redirect:/index";
        }

        @RequestMapping("/delete/user/{userId}")
        public String deleteUser(@PathVariable("userId") Integer userId) {

            usersService.deleteUser(userId);

            return "redirect:/index";
        }

    @RequestMapping("/")
    @ResponseBody
    public String startPage() {
        return ("Hello World");
    }
}

