package Repository;

import Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IUserRepository extends MongoRepository<User, String> {
    // Your repository methods here
}