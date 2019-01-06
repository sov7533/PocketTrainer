package com.pocket.trainer.PocketTrainer.service;

import com.pocket.trainer.PocketTrainer.domain.Users;
import com.pocket.trainer.PocketTrainer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(Users user) {
        userRepository.save(user);
    }

    @Override
    public List<Users> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public void blockedUser(Integer id) {

    }
}
