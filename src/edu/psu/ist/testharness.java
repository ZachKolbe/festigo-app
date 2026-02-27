package edu.psu.ist;

import edu.psu.ist.Controllers.*;
import edu.psu.ist.Models.*;

import java.time.LocalDateTime;

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

    //Festival API Calls
    FestivalAPIController FestivalAPI = new FestivalAPIController();

    //POST
    FestivalAPI.postFestival(new FestivalModel(1, "Los Angeles", LocalDateTime.now(), LocalDateTime.now().plusDays(2), 1));

    //GET
    FestivalAPI.getFestivalById(1);

    //GET
    FestivalAPI.getAllFestivals();

    //PUT
    FestivalAPI.updateFestival(1);

    //DELETE
    FestivalAPI.deleteFestival(1);

    //PersonalSchedule API Calls
    PersonalScheduleAPIController PersonalScheduleAPI = new PersonalScheduleAPIController();

    //POST
    PersonalScheduleAPI.addToPersonalSchedule(new PersonalScheduleModel(1, 2));

    //GET
    PersonalScheduleAPI.getPersonalSchedule("abc123");

    //MasterSchedule API Calls
    MasterScheduleAPIController MasterScheduleAPI = new MasterScheduleAPIController();
    //GET
    MasterScheduleAPI.getMasterSchedule(1);
  }
}
