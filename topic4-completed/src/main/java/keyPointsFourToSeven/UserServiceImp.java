package keyPointsFourToSeven;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImp implements UserService {

	private List<User> users = new ArrayList<User>();

	public User createUser(String userName, String passWord, String mail) {

		User user = new User(userName, passWord, mail);
		users.add(user);
		return user;

	}

	public User getUser(int userId) {

		User user = null;

		for (User user2 : users) {
			if (userId == user2.getUserId()) {

				user = user2;
				break;
			}
		}

		return user;
	}

	public void updateUser(User user) {

		User user2 = this.getUser(user.getUserId());
		users.remove(user2);
		users.add(user);

	}

	public void deleteUser(User user) {

		users.remove(user);

	}

	public void uploadPhoto(User user, Photo photo) {

		user.setPhoto(photo);
		this.updateUser(user);

	}

	public void addFriend(User user, User friend) {

		user.addFriend(friend);
		this.updateUser(user);

	}

	public void addLikeToThePhoto(User user) {

		user.getPhoto().addLike();
		this.updateUser(user);

	}

}
