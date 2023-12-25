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
}
