package atm.simulation;

//import java.sql.Connection;
//import java.sql.Driver;
//import java.sql.DriverManager;
//import java.sql.Statement;

//import java.sql.Connection;

import java.sql.*;

public class connec {
    Connection connection;
    Statement statement;
    public connec()
    {

        try{
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","sb1x141org");
       statement=connection.createStatement();
        }catch(Exception e)
        {
            // E.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
