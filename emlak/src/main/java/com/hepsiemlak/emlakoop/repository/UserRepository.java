package com.hepsiemlak.emlakoop.repository;

import com.hepsiemlak.emlakoop.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class UserRepository {

    List<User> users = new ArrayList<>();

    public void add(User user){
        users.add(user);
    }

    public User getUserByEmail(String email){
        for (User user : users) {
            if(user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

    public User getUserById(String id){
        for (User user : users) {
            if(Objects.equals(user.getId(), id)){
                return user;
            }
        }
        return null;
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public List<User> getUsers(){
        return users;
    }
}
