package com.spring_boot.lmsproject.service;
import com.spring_boot.lmsproject.model.UserType;
import com.spring_boot.lmsproject.repository.UsertypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsertypeService {
    @Autowired
    UsertypeRepository usertypeRepository;
    public List<UserType> getAllUsertype(){
        List<UserType> users1=new ArrayList<UserType>();
        usertypeRepository.findAll().forEach(user->users1.add(user));
        return users1;
    }
    public UserType getUsertypeById(int id)
    {
        return usertypeRepository.findById(id).get();
    }
    public void saveOrUpdate(UserType user)
    {
        usertypeRepository.save(user);
    }
    public void delete(int id)
    {
        usertypeRepository.deleteById(id);
    }

}
