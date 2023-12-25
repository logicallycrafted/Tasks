package org.example.tasklist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
private User newUser;
    @BeforeEach
    void setUp() {
        newUser = new User("rattan@gmail.com","rashat","705-716-3680");
    }

    @Test
    void setEmail() {
    }

    @Test
    void setUserName() {
        newUser.setUserName("Rattan");
        assertEquals("Rattan",newUser.getUserName());
    }
    @Test
    void  setInvalidUsername(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            newUser.setUserName("");
        });
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            newUser.setUserName("     ");
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
                newUser.setUserName("Fred  Thi");
            });
        });
        }


    @Test
    void setPhone() {
    }
}