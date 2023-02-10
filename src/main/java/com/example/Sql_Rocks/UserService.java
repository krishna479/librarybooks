package com.example.Sql_Rocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   @Autowired
    UserRepo userrepo;
    public String addUser(User user) {

            userrepo.save(user);
            return "Added successfully";


    }

    public User getUser(int id) {

        return userrepo.findById(id).get();
    }
}
