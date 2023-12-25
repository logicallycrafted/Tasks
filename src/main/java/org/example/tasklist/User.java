package org.example.tasklist;

public class User {
    private String email,userName,phone;

    /**
     * This is the Constructor, it will be called whenever we create
     * an instance of a user
     * @param email - valid email syntax
     * @param userName - whatever user wishes to be called
     * @param phone -valid phone number
     */
    public User(String email, String userName, String phone) {
        setEmail (email);
        setUserName (userName);
        setPhone (phone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    /**
     * This is a username, cannot be blank
     * @param userName -  whatever the user wants it to be
     */
    public void setUserName(String userName) {
        userName =userName.trim(); //remove leading and trailing whitespaces
        if (userName.matches("[A-z1-9]+"))

        this.userName = userName;
        else
            throw new IllegalArgumentException("Username must have 1 char and/or 1 number");
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

