package org.example.tasklist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;

public class DBUtility {
    //DB username and password
    private static String dbUser = "root";
    private static String password = "admin";
    //Database string defined - TASKDB database created in workbench
    private static String connectURL = "jdbc:mysql://localhost:3306/TASKDB";

    private static String addUserToDB(User user){
        String rspMessage = "broken";
        String sql = "insert into users values(?,?,?)";

        try(
                Connection conn = DriverManager.getConnection(connectURL,dbUser,password);
                PreparedStatement ps = conn.prepareStatement(sql);
        )
        {
            ps.setString(1,user.getEmail());
            ps.setString(2,user.getUserName());
            ps.setString(3,user.getPhone());

            ps.executeUpdate();

            rspMessage = "User Added";
        }
        catch (SQLIntegrityConstraintViolationException e)  //this is a duplicate key
        {
            rspMessage = "User with "+user.getEmail()+ " already defined";
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return rspMessage;

    }
}
