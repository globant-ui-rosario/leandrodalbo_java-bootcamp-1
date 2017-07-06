package keyPointsOneTwoAndThree;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/shoppingCartService")
public interface ShoppingCart {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/getAlistOfItems")
	public List<Item> getAlistOfItems();

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/addAlistOfItems/{items}")
	public void addAlistOfItems(@PathParam("items") List<Item> items);

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/setTheCustomer/{customer}")
	public void setTheCustomer(@PathParam("customer") Customer customer);

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/getTheCustomer")
	public Customer getTheCustomer();

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/addAnItemToTheList/{item}")
	public void addAnItemToTheList(@PathParam("item") Item item);

	@DELETE
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/deleteAnItemFromTheList/{item}")
	public void deleteAnItemFromTheList(@PathParam("item") Item item);

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/getAnItemFromTheList/{item}")
	public Item getAnItemFromTheList(@PathParam("item") Item item);

	@GET
	@Path("/getTotalAmount")
	public double getTotalAmount();
}
