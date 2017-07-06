package finalProject.services;

import org.springframework.stereotype.Service;

import finalProject.model.User;

@Service
public interface UserService {

	public void addUser(User user);

	public User login(String name, String password);

	public boolean isUserOn(Integer userId);

}
