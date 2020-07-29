package com.spring_boot.lmsproject.contoller;
import com.spring_boot.lmsproject.model.UserType;
import com.spring_boot.lmsproject.service.UsertypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UsertypeController {
    @Autowired
    private UsertypeService usertypeService;
    @GetMapping("/Usertype")
    private List<UserType> getAllUsertype()
    {
        return usertypeService.getAllUsertype();
    }
    @GetMapping("/Usertype/{id}")
    private UserType getUsertype(@PathVariable("id") int id)
    {
        return usertypeService.getUsertypeById(id);
    }
    @DeleteMapping("/Usertype/{id}")
    private void deleteUsertype(@PathVariable("id") int id)
    {
        usertypeService.delete(id);
    }
    @PostMapping("/Usertype")
    private int saveUsertype(@RequestBody UserType userType)
    {
        usertypeService.saveOrUpdate(userType);
        return userType.getUserTypeID();
    }

}
