package finalProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import finalProject.model.Session;
import finalProject.model.User;
import finalProject.services.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST, value = "/user")
	public void addUser(@RequestBody User user) {

		userService.addUser(user);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/user/{name}/{password}")
	public Session userLogin(@PathVariable String name, @PathVariable String password) {

		return userService.login(name, password);

	}

}
