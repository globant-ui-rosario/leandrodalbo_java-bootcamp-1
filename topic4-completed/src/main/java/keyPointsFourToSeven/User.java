package keyPointsFourToSeven;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User {

	private String userName;
	private String passWord;
	private String mail;
	private int userId;
	private Photo photo;
	private List<User> friends;

	public User(String userName, String passWord, String mail) {
		Random random = new Random();
		this.userName = userName;
		this.passWord = passWord;
		this.mail = mail;
		this.userId = random.nextInt(10) + 1;
		friends = new ArrayList<User>();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getUserId() {
		return userId;
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	public void addFriend(User user) {

		friends.add(user);
	}

	public User getFriend(User friend) {
		User foundFriend = null;
		for (User friend2 : friends) {
			if (friend2.getUserId() == friend.getUserId()) {
				foundFriend = friend2;
				break;
			}
		}
		return foundFriend;
	}

}
