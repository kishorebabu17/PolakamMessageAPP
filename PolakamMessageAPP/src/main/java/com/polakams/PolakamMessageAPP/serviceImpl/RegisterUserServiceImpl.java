package com.polakams.PolakamMessageAPP.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polakams.PolakamMessageAPP.JPA.IUserRepository;
import com.polakams.PolakamMessageAPP.Model.User;
import com.polakams.PolakamMessageAPP.service.IRegisterUserService;

@Service
public class RegisterUserServiceImpl  implements IRegisterUserService{

    @Autowired	
	 IUserRepository iUserRepository;

	@Override
	public List<User> getAllUsers() {
		
		List<User> list = iUserRepository.findAll();
		return list;
	}

	@Override
	public User getUser(Long userID) {
		
		User registerUser = iUserRepository.findOne(userID);
		return registerUser;
	}

	@Override
	public User saveUser(User user) {
		
		iUserRepository.save(user);
		
		return user;
	}

	@Override
	public User deletetUser(Long userId) {
		iUserRepository.delete(userId);
		return null;
	}
	
}
