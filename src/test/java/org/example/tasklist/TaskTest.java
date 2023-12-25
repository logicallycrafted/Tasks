package org.example.tasklist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    Task task;
    @BeforeEach
    void setUp() {
        task = new Task("Do Quiz","week 2 quiz",
                LocalDate.of(2023,12,30),60,
                new User("rattan@gmail.com","rattan1","7065554545"));

    }

    @Test
    void setTaskID() {
        task.setTaskID(1);
        assertEquals(1,task.getTaskID());
    }
}