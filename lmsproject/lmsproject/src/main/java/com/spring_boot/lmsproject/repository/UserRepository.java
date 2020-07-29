package com.spring_boot.lmsproject.repository;

import com.spring_boot.lmsproject.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
