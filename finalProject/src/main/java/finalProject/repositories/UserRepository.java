package finalProject.repositories;

import org.springframework.data.repository.CrudRepository;
import finalProject.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByNameAndPassword(String name, String password);
}
