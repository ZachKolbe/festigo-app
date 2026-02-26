package edu.psu.ist.Models;

public class UserModel {

    private String username;
    private String firstName;
    private String lastName;

    public UserModel(String userid, String fname, String lname)
    {
        this.username = userid;
        this.firstName = fname;
        this.lastName = lname;
    }

    @Override
public String toString() {
    return "UserModel {\n" + "userid=" + username +  ",\n" + "firstName=" + firstName + ",\n" + "lastName=" + lastName + "}";
}

}
