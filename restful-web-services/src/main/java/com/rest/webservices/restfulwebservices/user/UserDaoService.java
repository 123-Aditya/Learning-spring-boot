package com.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 5;
	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Eve", new Date()));
		users.add(new User(3, "Jack", new Date()));
		users.add(new User(4, "Aditya", new Date()));
		users.add(new User(5, "Raj", new Date()));
	}
	
	public List<User> findAll() {
		return users;
	}
	public User saveUser(User user) {
		if(user.getId()==null || user.getId()!=(usersCount+1)) {
			user.setId(++usersCount);
		}
		users.add(user);
		
		return user;
	}
	
	public User findOne(int id) {
		for(User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	public User deleteById(int id) {
		for(User user : users) {
			if(user.getId() == id) {
				users.remove(user);
				return user;
			}
		}
		return null;
	}
	
	public int countOfUsers() {
		return users.size();
	}
}
