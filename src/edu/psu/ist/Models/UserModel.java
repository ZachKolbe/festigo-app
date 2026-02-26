package edu.psu.ist.Models;

public class UserModel {

    private String userid;
    private String fname;
    private String lname;

    public UserModel(String userid, String fname, String lname)
    {
        this.userid = userid;
        this.fname = fname;
        this.lname = lname;
    }

    @Override
public String toString() {
    return "UserModel {\n" + "userid=" + userid +  ",\n" + "firstName=" + fname + ",\n" + "lastName=" + lname + "}";
}
    
}
