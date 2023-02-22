package com.security.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.Model.CustomerUser;
import com.security.Repo.UserRepository;
 
@Service
public class UserDetailsServices implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<CustomerUser> opt = userRepository.findByEmail(username);
		
		if(opt.isPresent()) {
			CustomerUser user = opt.get();
			
			List<GrantedAuthority>  authorities = new ArrayList<>();
		
			return new User(user.getEmail(),user.getPassword(),authorities);
		}else {
			throw new UsernameNotFoundException("user details not found with this userName :"+username);
		}
		
	}

}
