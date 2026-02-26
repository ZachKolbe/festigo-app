package edu.psu.ist;

import edu.psu.ist.Controllers.EventAPIController;
import edu.psu.ist.Controllers.LoginAPIController;
import edu.psu.ist.Models.EventModel;
import edu.psu.ist.Models.UserModel;

import java.time.LocalDateTime;
import java.util.Date;

public class testharness {
    

  public static void main(String[] args) {

    //Login API Calls
    LoginAPIController LoginAPI = new LoginAPIController();
    
    //GET
    LoginAPI.getUsersById("abc1234");
    
    //POST
    LoginAPI.postUsers(new UserModel("xyz123", "Joe", "Smith"));
    
   //PUT
    LoginAPI.updateUser(new UserModel("xyz123", "Joe", "Smith"));

    //DELETE
    LoginAPI.deleteUser("abc1234");

    //ADMIN Event API Calls
    EventAPIController EventAPI = new EventAPIController();

    //POST
    EventAPI.addEvent(new EventModel(1, "concert", 1, LocalDateTime.now(), LocalDateTime.now().plusDays(1) , 2, 4));

    //PUT
    EventAPI.updateEvent(new EventModel(1, "concert", 1, LocalDateTime.now(), LocalDateTime.now().plusDays(2) , 2, 4));

    //DELETE
    EventAPI.deleteEvent(1);

    // USER Event API Calls
    //POST
    EventAPI.addToCalendar(new EventModel(1, "concert", 1, LocalDateTime.now(), LocalDateTime.now().plusDays(1) , 2, 4),"abc123");

    //DELETE
    // Changed name from removeEvent to removeFromCalendar
    EventAPI.removeFromCalendar("abc123", 1);
  }
}
