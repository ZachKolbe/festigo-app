package edu.psu.ist.Controllers;

import org.springframework.web.bind.annotation.*;
import edu.psu.ist.Models.UserModel;

@RestController
@RequestMapping("/users")
public class LoginAPIController {

    // GET User by ID
    @GetMapping(value = "/{user_id}")
    public UserModel getUsersById(@PathVariable String user_id) {
        if (user_id == null) {
            System.out.println("FAIL - LoginAPIController.getUser called with userID: " + user_id);
            return null;
        }

        System.out.println("PASS - LoginAPIController.getUser called with userID: " + user_id);
        return new UserModel(1,"abc123", "John", "Doe", "password", 2);
    }

    // POST User
    @PostMapping
    public boolean postUsers(@RequestBody UserModel user) {
        if (user == null) {
            System.out.println("FAIL - LoginAPIController.postUsers called with user: " + user);
            return false;
        }

        System.out.println("PASS - LoginAPIController.postUsers called: " + user);
        return true;
    }

    // PUT User
    @PutMapping
    public boolean updateUser(@RequestBody UserModel user) {
        if (user == null) {
            System.out.println("FAIL - LoginAPIController.updateUser called with user: " + user);
            return false;
        }

        System.out.println("PASS - LoginAPIController.updateUser called: " + user);
        return true;
    }

    // DELETE User
    @DeleteMapping("/{user_id}")
    public boolean deleteUser(@PathVariable("user_id") String userID) {
        if (userID == null) {
            System.out.println("FAIL - LoginAPIController.deleteUser called with userID: " + userID);
            return false;
        }

        System.out.println("PASS - LoginAPIController.deleteUser called with userID: " + userID);
        return true;
    }

}