package com.pocket.trainer.PocketTrainer.web;

import com.pocket.trainer.PocketTrainer.Security.SecurityService;
import com.pocket.trainer.PocketTrainer.domain.User;
import com.pocket.trainer.PocketTrainer.service.UserService;
import com.pocket.trainer.PocketTrainer.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model){
        model.addAttribute("userForm", new User());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public  String registration(@ModelAttribute("userForm") User userForm,
                                BindingResult bindingResult, Model model){
        userValidator.validate(userForm, bindingResult);

        if(bindingResult.hasErrors()){
            return "registration";
        }

        userService.addUser(userForm);

        securityService.autoLogin(userForm.getLogin(), userForm.getConfirmPassword());

        return "redirect:/welcome";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout){
        if (error != null){
            model.addAttribute("error", "Login or password is incorrect");
        }

        if (logout != null){
            model.addAttribute("message", "Logged out successfully");
        }

        return "login";

    }

    // в значения добавить к велком знач / т.е. будет {"/","/welcome"}
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public  String welcome(Model model){
        return "welcome";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(Model model){
        return "admin";
    }

    @RequestMapping("/delete/user/{userId}")
        public String deleteUser(@PathVariable("userId") Integer userId) {

            userService.deleteUser(userId);

            return "redirect:/welcome";
    }
}

