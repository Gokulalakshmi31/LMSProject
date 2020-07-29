package com.spring_boot.lmsproject.model;


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
    @JoinColumn(name="userID")
    private UserType userType;
    private int userTypeID;
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

    public int getUserTypeID() {
        return userTypeID;
    }

    public void setUserTypeID(int userTypeID) {
        this.userTypeID = userTypeID;
    }
}
