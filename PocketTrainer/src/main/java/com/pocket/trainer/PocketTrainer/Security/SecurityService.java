package com.pocket.trainer.PocketTrainer.Security;

public interface SecurityService {

    //поиск залогиненных пользователей
    String findLoggedInLogin();

    void autoLogin(String login, String password);

}
