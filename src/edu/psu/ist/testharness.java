package edu.psu.ist;

import edu.psu.ist.Controllers.*;
import edu.psu.ist.Models.*;

import java.time.LocalDateTime;

public class testharness {
    

  public static void main(String[] args) {

    //Login API Calls
    LoginAPIController LoginAPI = new LoginAPIController();
    System.out.println("*******************");
    System.out.println("**BEGIN LOGIN API**");
    System.out.println("*******************");
    //GET
    LoginAPI.getUsersById("abc1234");
    LoginAPI.getUsersById(null);


    //POST
    LoginAPI.postUsers(new UserModel(1,"abc123", "John", "Doe", "password", 2));
    LoginAPI.postUsers(null); //FAILURE
    
   //PUT
    LoginAPI.updateUser(new UserModel(1,"abc123", "John", "Doe", "password", 2));
    LoginAPI.updateUser(null);

    //DELETE
    LoginAPI.deleteUser("abc1234");
    LoginAPI.deleteUser(null);
    System.out.println("*****************");
    System.out.println("**END LOGIN API**");
    System.out.println("*****************\n");


    //Festival API Calls
    FestivalAPIController FestivalAPI = new FestivalAPIController();

    System.out.println("**********************");
    System.out.println("**BEGIN FESTIVAL API**");
    System.out.println("**********************");
    //POST
    FestivalAPI.postFestival(new FestivalModel(1, "Los Angeles", LocalDateTime.now(), LocalDateTime.now().plusDays(2), 1));
    FestivalAPI.postFestival(null);

    //GET
    FestivalAPI.getFestivalById(1);
    FestivalAPI.getFestivalById(-1);

    //GET
    FestivalAPI.getAllFestivals();

    //PUT
    FestivalAPI.updateFestival(1);
    FestivalAPI.updateFestival(-1);

    //DELETE
    FestivalAPI.deleteFestival(1);
    FestivalAPI.deleteFestival(-1);
    System.out.println("********************");
    System.out.println("**END FESTIVAL API**");
    System.out.println("*********************\n");

    //ADMIN Event API Calls
    EventAPIController EventAPI = new EventAPIController();

    System.out.println("*******************");
    System.out.println("**BEGIN EVENT API**");
    System.out.println("*******************");
    //POST
    EventAPI.addEvent(new EventModel(1, "concert", 1, LocalDateTime.now(), LocalDateTime.now().plusDays(1) , 2, 4));
    EventAPI.addEvent(null);

    //PUT
    EventAPI.updateEvent(new EventModel(1, "concert", 1, LocalDateTime.now(), LocalDateTime.now().plusDays(2) , 2, 4));
    EventAPI.updateEvent(null);

    //DELETE
    EventAPI.deleteEvent(1);
    EventAPI.deleteEvent(-1);

    // USER Event API Calls
    //POST
    EventAPI.addToCalendar(new EventModel(1, "concert", 1, LocalDateTime.now(), LocalDateTime.now().plusDays(1) , 2, 4),"abc123");
    EventAPI.addToCalendar(null, null);
    //DELETE
    // Changed name from removeEvent to removeFromCalendar
    EventAPI.removeFromCalendar("abc123", 1);
    EventAPI.removeFromCalendar(null, -1);
    System.out.println("*******************");
    System.out.println("**END EVENT API****");
    System.out.println("*******************\n");

    //PersonalSchedule API Calls
    PersonalScheduleAPIController PersonalScheduleAPI = new PersonalScheduleAPIController();

    System.out.println("*******************************");
    System.out.println("**BEGIN PERSONAL SCHEDULE API**");
    System.out.println("*******************************");
    //POST
    PersonalScheduleAPI.addToPersonalSchedule(new PersonalScheduleModel(1, 2));
    PersonalScheduleAPI.addToPersonalSchedule(null);

    //GET
    PersonalScheduleAPI.getPersonalSchedule("abc123");
    PersonalScheduleAPI.getPersonalSchedule(null);
    System.out.println("*****************************");
    System.out.println("**END PERSONAL SCHEDULE API**");
    System.out.println("*****************************\n");

    //MasterSchedule API Calls
    MasterScheduleAPIController MasterScheduleAPI = new MasterScheduleAPIController();
    System.out.println("*****************************");
    System.out.println("**BEGIN MASTER SCHEDULE API**");
    System.out.println("*****************************");
    //GET
    MasterScheduleAPI.getMasterSchedule(1);
    MasterScheduleAPI.getMasterSchedule(-1);
    System.out.println("***************************");
    System.out.println("**END MASTER SCHEDULE API**");
    System.out.println("***************************\n");
  }
}
