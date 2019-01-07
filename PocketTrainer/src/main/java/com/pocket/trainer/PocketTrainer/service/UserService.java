package com.pocket.trainer.PocketTrainer.service;

import com.pocket.trainer.PocketTrainer.domain.User;

import java.util.List;

public interface UserService {

    public void addUser(User user);

    User findByLogin(String login);

    public List<User> listUsers();

    public void deleteUser(Integer id);

    public void blockedUser(Integer id);

}
