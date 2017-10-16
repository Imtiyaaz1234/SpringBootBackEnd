package com.imtiyaaz.tpapppractical;

import com.imtiyaaz.tpapppractical.Domain.User;
import com.imtiyaaz.tpapppractical.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Ameer on 2017/10/15.
 */
@Service
public class UserCredentials implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public UserCredentials(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDetails loadUserByUsername(String employeeUsername) throws UsernameNotFoundException {
        User user = this.userRepository.findByEmployeeUsername(employeeUsername);
        user.isEnabled();
        return (UserDetails) new User(user.getEmployeeUsername(), user.getEmployeePassword(), user.getRole());
    }

}

