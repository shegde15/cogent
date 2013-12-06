package com.jdbc;

import java.sql.*;

public class SortingExample {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/cogent";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "Cogent123";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();

      // Extract records in ascending order by first name.
      System.out.println("Fetching records in ascending order...");
      String sql = "SELECT user_id, user_name, user_password FROM user_table" +
                   " ORDER BY user_name ASC";
      ResultSet rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("user_id");
         String user = rs.getString("user_name");
         String pwd = rs.getString("user_password");
 

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", Age: " + user);
         System.out.println(", First: " + pwd);
          
      }

      // Extract records in descending order by first name.
      System.out.println("Fetching records in descending order...");
      sql = "SELECT user_id, user_name, user_password FROM user_table" +
                   " ORDER BY user_name DESC";
      rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
    	  int id  = rs.getInt("user_id");
          String user = rs.getString("user_name");
          String pwd = rs.getString("user_password");
  

          //Display values
          System.out.print("ID: " + id);
          System.out.print(", Age: " + user);
          System.out.println(", First: " + pwd);
      }
      rs.close();
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample