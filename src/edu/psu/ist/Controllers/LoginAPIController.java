package edu.psu.ist.Controllers;

import edu.psu.ist.Models.UserModel;

public class LoginAPIController {

    //GET User Stub
    public UserModel getUsersById(String user_id)
    {
        System.out.println("LoginAPIController.getUser called with userID: " + user_id);
        var myUser = new UserModel(user_id, "TestFName", "TestLName");

        return myUser ;
    }

    //POST User
    // Changed signature to pass in the user model instead of individual parameters
    public boolean postUsers (UserModel user)
    {
         System.out.println("LoginAPIController.addUser called: " + user.toString());

        return true;
    }

    //PUT User
    public boolean updateUser(UserModel user)
    {
        System.out.println("LoginAPIController.updateUser called: " + user);
        
        return true;
    }

    //DELETE User
    public boolean deleteUser(String userID)
    {
        System.out.println("LoginAPIController.deleteUser called with userID: " + userID);

        return true;
    }

}
