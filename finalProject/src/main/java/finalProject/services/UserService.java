package finalProject.services;

import org.springframework.stereotype.Service;

import finalProject.model.Session;
import finalProject.model.User;

@Service
public interface UserService {

	public void addUser(User user);

	public Session login(String name, String password);

}
