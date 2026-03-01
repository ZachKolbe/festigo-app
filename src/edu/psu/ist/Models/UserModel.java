package edu.psu.ist.Models;

public class UserModel {

    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private int role;

    public UserModel(int id, String userid, String firstName, String lastName, String password, int role)
    {
        this.id = id;
        this.username = userid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserModel {" + "id=" + id + "userid=" + username + "firstName=" + firstName + "lastName=" + lastName + "password" + password + "role=" + role + "}";
}

}
