package com.example.springsecurity.auth;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;



public interface ApplicationUserDao {
    Optional<ApplicationUser> selectApplicationUserByUsername(String username);

}
