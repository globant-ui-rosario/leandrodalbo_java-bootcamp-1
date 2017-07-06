package keyPointsFourToSeven;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserServiceImpTester {

	@Test
	public void testCreateAndGetUser() {
		UserService userService = new UserServiceImp();

		User user = userService.createUser("leandro", "123456", "lea@mail.com");
		assertEquals(user, userService.getUser(user.getUserId()));
	}

	@Test
	public void testUpdateUser() {
		UserService userService = new UserServiceImp();
		User user = userService.createUser("leandro", "123456", "lea@mail.com");
		user.setMail("lea2@mail.com");
		user.setPassWord("354565");
		userService.updateUser(user);
		assertEquals(user.getPassWord(), userService.getUser(user.getUserId()).getPassWord());
		assertEquals(user.getMail(), userService.getUser(user.getUserId()).getMail());
	}

	@Test
	public void testDeleteUser() {
		UserService userService = new UserServiceImp();
		User user = userService.createUser("leandro", "123456", "lea@mail.com");
		userService.deleteUser(user);
		assertEquals(userService.getUser(user.getUserId()), null);
	}

	@Test
	public void testUploadPhoto() {
		UserService userService = new UserServiceImp();
		User user = userService.createUser("leandro", "123456", "lea@mail.com");
		Photo photo = new Photo();
		userService.uploadPhoto(user, photo);
		assertEquals(userService.getUser(user.getUserId()).getPhoto(), photo);
	}

	@Test
	public void testAddFriends() {
		UserService userService = new UserServiceImp();
		User user = userService.createUser("leandro", "123456", "lea@mail.com");
		User friend1 = userService.createUser("FRIEND1", "3253453", "F1@MAIL.COM");
		User friend2 = userService.createUser("FRIEND2", "3343853", "F2@MAIL.COM");
		userService.addFriend(user, friend1);
		userService.addFriend(user, friend2);

		assertEquals(friend1, userService.getUser(user.getUserId()).getFriend(friend1));
		assertEquals(friend2, userService.getUser(user.getUserId()).getFriend(friend2));
	}

	@Test
	public void testAddLikesToPhotos() {
		UserService userService = new UserServiceImp();
		User user = userService.createUser("leandro", "123456", "lea@mail.com");
		Photo photo = new Photo();
		userService.uploadPhoto(user, photo);
		userService.addLikeToThePhoto(user);
		assertEquals(new Integer(1), new Integer(userService.getUser(user.getUserId()).getPhoto().getLikes()));
		userService.addLikeToThePhoto(user);
		assertEquals(new Integer(2), new Integer(userService.getUser(user.getUserId()).getPhoto().getLikes()));
		userService.addLikeToThePhoto(user);
		assertEquals(new Integer(3), new Integer(userService.getUser(user.getUserId()).getPhoto().getLikes()));
	}
}
