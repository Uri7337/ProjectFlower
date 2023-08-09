
package com.mycompany.projectflower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// We are using SQLite database - SQLiteJDBC driver is needed
public class DatabaseHandler {
    Connection conn = null;
    public void connectToDatabase(){
        
        try {
            // jdbc:sqlite:sqlite_database_file_path
            String connectionString = "jdbc:sqlite:c:/ProgramsUri/ALL_Files/Sqlitedb/ProjectFlowerdb/Game.db";
            // create a connection to the database
            conn = DriverManager.getConnection(connectionString);
            System.out.println("Connected...");
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
        
    public void closeDatabase(){
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Closed.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
