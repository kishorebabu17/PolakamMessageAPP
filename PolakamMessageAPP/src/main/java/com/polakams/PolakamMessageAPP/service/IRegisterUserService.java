package com.polakams.PolakamMessageAPP.service;

import java.util.List;

import com.polakams.PolakamMessageAPP.Model.User;

public interface IRegisterUserService {

	public User saveUser(User user);
	public List<User> getAllUsers();
	public User getUser(Long UserID);
	public User deletetUser(Long userId);
	
	
	
	
	
	
	
}
