package finalProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import finalProject.model.Session;
import finalProject.model.User;
import finalProject.repositories.UserRepository;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void addUser(User user) {
		User existingUser = userRepository.findByNameAndPassword(user.getName(), user.getPassword());

		if (existingUser == null) {
			userRepository.save(user);

		}
	}

	@Override
	public Session login(String name, String password) {
		Session session = null;
		User user = userRepository.findByNameAndPassword(name, password);
		if (user != null) {
			session = new Session(user);

		}
		return session;
	}

}
