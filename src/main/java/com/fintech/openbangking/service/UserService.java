package com.fintech.openbangking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.fintech.openbangking.model.User;

@Service
public class UserService {
	
	private List<User> users;
	
	public List<User> findByUserNameOrEmail(String username){
		List<User> result = users.stream().filter(x -> x.getUsername().equalsIgnoreCase(username)).collect(Collectors.toList());
		return result;
	}
		
		@PostConstruct
		private void iniDataForTesting() {
			users = new ArrayList<User>();
			
			User user1 = new User("daesoo","ds1","daesoo@data");
			User user2 = new User("banini","ba1","bani@data");
			User user3 = new User("commi","com1","commi@data");
			
			users.add(user1);
			users.add(user2);
			users.add(user3);
		}

}
