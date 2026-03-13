package edu.psu.ist.Controllers;

import edu.psu.ist.Models.UserModel;
import edu.psu.ist.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class LoginAPIController {

    private final UserService userService;

    public LoginAPIController(UserService userService) {
        this.userService = userService;
    }

    // GET all users
    @GetMapping
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }

    // GET user by ID
    @GetMapping("/{id}")
    public UserModel getUserById(@PathVariable int id) {
        return userService.getUserById(id).orElse(null);
    }

    // POST create user
    @PostMapping
    public UserModel createUser(@RequestBody UserModel user) {
        return userService.createUser(user);
    }

    // PUT update user
    @PutMapping("/{id}")
    public UserModel updateUser(@PathVariable int id,
                                @RequestBody UserModel user) {
        return userService.updateUser(id, user);
    }

    // DELETE user
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

    // LOGIN endpoint
    @PostMapping("/login")
    public UserModel login(@RequestBody UserModel user) {
        return userService.login(user.getUsername(), user.getPassword());
    }
}