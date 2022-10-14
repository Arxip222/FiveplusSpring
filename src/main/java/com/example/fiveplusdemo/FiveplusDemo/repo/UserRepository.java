package com.example.fiveplusdemo.FiveplusDemo.repo;

import com.example.fiveplusdemo.FiveplusDemo.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
    User findByUsername(String username);
}
