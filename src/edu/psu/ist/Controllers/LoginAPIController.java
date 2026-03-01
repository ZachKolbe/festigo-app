package edu.psu.ist.Controllers;

import edu.psu.ist.Models.UserModel;

public class LoginAPIController {

    //GET User Stub
    public UserModel getUsersById(String user_id) {

        if (user_id == null) {
//            throw new IllegalArgumentException("user_id is null");
            System.out.println("FAIL - LoginAPIController.getUser called with userID: " + user_id);
            return null;
        }

        System.out.println("PASS - LoginAPIController.getUser called with userID: " + user_id);
        var myUser = new UserModel(1,"abc123", "John", "Doe", "password", 2);
        return myUser ;
    }

    //POST User
    // Changed signature to pass in the user model instead of individual parameters
    public boolean postUsers(UserModel user) {
        if (user == null) {
//            throw new IllegalArgumentException("user is null");
            System.out.println("FAIL - LoginAPIController.postUsers called with user: " + user);
            return false;
        }

         System.out.println("PASS - LoginAPIController.postUsers called: " + user.toString());
        return true;
    }

    //PUT User
    public boolean updateUser(UserModel user) {
        if (user == null) {
//            throw new IllegalArgumentException("user is null");
            System.out.println("FAIL - LoginAPIController.updateUser called with user: " + user);
            return false;
        }

        System.out.println("PASS - LoginAPIController.updateUser called: " + user);
        return true;
    }

    //DELETE User
    public boolean deleteUser(String userID) {
        if (userID == null) {
//            throw new IllegalArgumentException("userID is null");
            System.out.println("FAIL - LoginAPIController.deleteUser called with userID: " + userID);
            return false;
        }

        System.out.println("PASS - LoginAPIController.deleteUser called with userID: " + userID);
        return true;
    }

}
