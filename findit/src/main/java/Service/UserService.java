package Service;

import Model.DTO.UserDTO;
import Model.User;
import Repository.IUserRepository;
import SecurityConfig.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final IUserRepository userRepository;

    private final SecurityConfig passwordEncoder;
    private User user;

    @Autowired
    public UserService(IUserRepository userRepository, SecurityConfig passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public List<User> GetUsers() {


        return userRepository.findAll();
    }


    public User CreateUser(UserDTO userDTO) {

        Optional<User> existingUser = userRepository.findByEmail(userDTO.getEmail());
        if (existingUser.isPresent()) {
            throw new RuntimeException("User with email " + userDTO.getEmail() + " already exists.");
        } else {
            String hashedPassword = passwordEncoder.encode(userDTO.getPassword());

            User newUser = new User(
                    userDTO.getFirstName(),
                    userDTO.getLastName(),
                    userDTO.getEmail(),
                    hashedPassword,
                    userDTO.getPhoneNumber()
            );
            userRepository.save(newUser);
            return newUser;
        }

    }

}
