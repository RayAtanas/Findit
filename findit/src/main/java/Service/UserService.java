package Service;

import Model.DTO.UserDTO;
import Model.User;
import Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class UserService {

    private IUserRepository userRepository;
    private User user;

    @Autowired
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> GetUsers() {


        return List.of(
                new User(
                        "Ray",
                        "Atanas",
                        "rayatanas@hotmail.com",
                        "ray123",
                        "123456"

                )
        );
    }


    public User CreateUser(UserDTO userDTO) {


            User newUser = new User(
                    userDTO.getFirstName(),
                    userDTO.getLastName(),
                    userDTO.getEmail(),
                    userDTO.getPassword(),
                    userDTO.getPhoneNumber()
            );

            userRepository.save(newUser);
            return newUser;

        }


}
