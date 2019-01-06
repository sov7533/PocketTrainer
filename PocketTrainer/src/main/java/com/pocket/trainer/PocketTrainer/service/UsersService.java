package com.pocket.trainer.PocketTrainer.service;

import com.pocket.trainer.PocketTrainer.domain.Users;

import java.util.List;

public interface UsersService {

    public void addUser(Users user);

    public List<Users> listUsers();

    public void deleteUser(Integer id);

    public void blockedUser(Integer id);

}
