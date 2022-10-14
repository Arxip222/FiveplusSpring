package com.example.fiveplusdemo.FiveplusDemo.service;

import com.example.fiveplusdemo.FiveplusDemo.model.Role;
import com.example.fiveplusdemo.FiveplusDemo.model.User;
import com.example.fiveplusdemo.FiveplusDemo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    public boolean createUser(User user){
        //if(userRepo.findByEmail(user.getEmail())!= null) return false;
        user.setActive(true);
        user.getRoles().add(Role.ROLE_USER);
        userRepo.save(user);
        return true;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username);
    }
}
