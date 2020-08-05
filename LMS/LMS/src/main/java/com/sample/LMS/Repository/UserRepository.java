package com.sample.LMS.Repository;

import com.sample.LMS.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
