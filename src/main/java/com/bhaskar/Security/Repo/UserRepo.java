package com.bhaskar.Security.Repo;

import com.bhaskar.Security.model.Users;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {


    Users findByUsername(String username);
}
