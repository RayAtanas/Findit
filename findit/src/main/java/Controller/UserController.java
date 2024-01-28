package Controller;
import Model.DTO.UserDTO;
import Model.User;
import Repository.IUserRepository;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;

    }

    @GetMapping(path = "/getusers")
    public List<User> GetUsers() {
        return userService.GetUsers();

    }

    @PostMapping(path = "/createuser")
    public User CreateUser(@RequestBody UserDTO userDTO){

        return userService.CreateUser(userDTO);
    }
}
