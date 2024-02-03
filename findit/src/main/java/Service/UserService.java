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


        return userRepository.findAll();
    }


    public User CreateUser(UserDTO userDTO) {

        Optional<User> existingUser = userRepository.findByEmail(userDTO.getEmail());
        if (existingUser.isPresent()) {

            throw new RuntimeException("User with email " + userDTO.getEmail() + " already exists.");
        } else {

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

}
