package com.masai.Service;

import com.masai.model.User;

public interface UserService {

	public User createUser(User user);
	
	public User updateUser(User user, String key);
}
