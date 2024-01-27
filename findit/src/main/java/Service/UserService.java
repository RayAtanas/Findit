package Service;

import Model.User;
import Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {

    private final IUserRepository userRepository;

    @Autowired
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> GetUsers() {
        return List.of(
                new User(
                        "Ray",
                        "rayatanas@hotmail.com",
                        "ray123",
                        "123456",
                        LocalDate.of(2002, 5, 18)
                )
        );
    }
}
