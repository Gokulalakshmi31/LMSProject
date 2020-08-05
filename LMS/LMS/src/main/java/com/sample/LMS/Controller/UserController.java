package com.sample.LMS.Controller;

import com.sample.LMS.Model.User;
import com.sample.LMS.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/User")
    private List<User> getAllUser()
    {
        return userService.getAllUser();
    }
    @GetMapping("/User/{id}")
    private User getUser(@PathVariable("id") int id)
    {
        return userService.getUserById(id);
    }
    @DeleteMapping("/User/{id}")
    private void deleteUser(@PathVariable("id") int id)
    {
        userService.delete(id);
    }
    @PostMapping("/User")
    private int saveUser(@RequestBody User user)
    {
        userService.saveOrUpdate(user);
        return user.getUserID();
    }
}

