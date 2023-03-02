package com.masai.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.Model.User;
import com.masai.Repository.UserRepository;


 
@Service
public class UserDetailsServices implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> opt = userRepository.findByEmail(username);
		
		if(opt.isPresent()) {
			User user = opt.get();
			
			List<GrantedAuthority>  authorities = new ArrayList<>();
		
			return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),authorities);
		}else {
			throw new UsernameNotFoundException("user details not found with this userName :"+username);
		}
		
	}

}
