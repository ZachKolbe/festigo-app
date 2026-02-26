package edu.psu.ist;

import edu.psu.ist.Controllers.LoginAPIController;
import edu.psu.ist.Models.UserModel;

public class testharness {
    

  public static void main(String[] args) {
  
    LoginAPIController LoginAPI = new LoginAPIController();
    
    //GET
    LoginAPI.getUser("abc1234");
    
    //POST
    LoginAPI.addUser(new UserModel("xyz123", "Joe", "Smith"));
    
   //PUT
    LoginAPI.updateUser(new UserModel("xyz123", "Joe", "Smith"));

    //DELETE
    LoginAPI.deleteUser("abc1234");

  }
}
