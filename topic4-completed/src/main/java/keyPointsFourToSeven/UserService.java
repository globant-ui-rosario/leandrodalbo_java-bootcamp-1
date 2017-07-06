package keyPointsFourToSeven;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/userService")
public interface UserService {

	@GET
	@Consumes({ MediaType.TEXT_PLAIN })
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/crateUser/{userName, password, mail}")
	public User createUser(@PathParam("userName") String userName, @PathParam("password") String passWord, @PathParam("mail") String mail);

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/getUser/{userId}")
	public User getUser(@PathParam("userId") int userId);

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/updateUser/{user}")
	public void updateUser(@PathParam("user") User user);

	@DELETE
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/deleteUser/{user}")
	public void deleteUser(@PathParam("user") User user);

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/uploadPhoto/{user, photo}")
	public void uploadPhoto(@PathParam("user") User user, @PathParam("photo") Photo photo);

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/addFriend/{user, friend}")
	public void addFriend(@PathParam("user") User user, @PathParam("friend") User friend);

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/addLikeToThePhoto/{user}")
	public void addLikeToThePhoto(@PathParam("user") User user);
}
