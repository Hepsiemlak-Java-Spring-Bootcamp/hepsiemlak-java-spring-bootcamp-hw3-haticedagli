package com.hepsiemlak.emlakoop.service;

import com.hepsiemlak.emlakoop.model.User;
import com.hepsiemlak.emlakoop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    public final UserRepository userRepository;

    public void saveUser(User user){
       userRepository.add(user);
    }

    public List<User> getUsers(){
        return userRepository.getUsers();
    }

    public User getUser(String id){
        return userRepository.getUserById(id);
    }
}
