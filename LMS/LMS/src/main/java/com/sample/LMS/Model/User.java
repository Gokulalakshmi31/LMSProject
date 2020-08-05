package com.sample.LMS.Model;

import javax.persistence.*;

@Entity
@Table(name="User_Table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int userID;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userPhone_Number;
    private String user_Status;
    @ManyToOne
    @JoinColumn(name="id")
    private UserType userType;

    

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhone_Number() {
        return userPhone_Number;
    }

    public void setUserPhone_Number(String userPhone_Number) {
        this.userPhone_Number = userPhone_Number;
    }

    public String getUser_Status() {
        return user_Status;
    }

    public void setUser_Status(String user_Status) {
        this.user_Status = user_Status;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}

