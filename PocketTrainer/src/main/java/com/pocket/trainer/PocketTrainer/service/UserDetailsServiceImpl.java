package com.pocket.trainer.PocketTrainer.service;

import com.pocket.trainer.PocketTrainer.domain.Role;
import com.pocket.trainer.PocketTrainer.domain.User;
import com.pocket.trainer.PocketTrainer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userRepository.findByLogin(login);

        //раазрешения которые мы даем пользователю
        Set<GrantedAuthority> grantedAuthority = new HashSet<>();

        for(Role role : user.getRoles()){
            grantedAuthority.add(new SimpleGrantedAuthority(role.getName()));
        }

        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(),
                grantedAuthority);
    }
}
