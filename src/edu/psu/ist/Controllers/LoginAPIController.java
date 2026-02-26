package edu.psu.ist.Controllers;

import edu.psu.ist.Models.UserModel;

public class LoginAPIController {

    //GET User Stub
    public UserModel getUser(String userID) 
    {
        System.out.println("LoginAPIController.getUser called with userID: " + userID);
        var myUser = new UserModel(userID, "TestFName", "TestLName");

        return myUser ;
    }

    //POST User
    public boolean addUser (UserModel user)
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
