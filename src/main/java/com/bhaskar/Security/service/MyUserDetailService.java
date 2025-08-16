package com.bhaskar.Security.service;

import com.bhaskar.Security.Repo.UserRepo;
import com.bhaskar.Security.model.UserPrincipal;
import com.bhaskar.Security.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
public class MyUserDetailService  implements UserDetailsService {

    @Autowired
    private UserRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.findByUsername(username);
        if(user==null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("not found");
        }
        return new UserPrincipal(user);
    }
}
