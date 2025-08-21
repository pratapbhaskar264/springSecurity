package com.bhaskar.Security.service;


import com.bhaskar.Security.Repo.UserRepo;
import com.bhaskar.Security.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
   private UserRepo repo;

    @Autowired
    private JWTService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;


    public Users registser(Users user){
        return repo.save(user);
    }

    public String verify(Users user) {
        Authentication authentication =
                authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));

        if(authentication.isAuthenticated()){
            return jwtService.generateToken(user.getUsername()) ;
        }
        return "FAILURE";
    }
}
