package Edu.sliit.Angular.practice.servise.impl;


import Edu.sliit.Angular.practice.repository.OuruserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class OurUserDetailsServise implements UserDetailsService {

    @Autowired
    private OuruserRepository ouruserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return ouruserRepository.findByEmail(username).orElseThrow();
    }
}
