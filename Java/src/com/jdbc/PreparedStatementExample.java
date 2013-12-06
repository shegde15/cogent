package com.jdbc;

import java.sql.*;

public class PreparedStatementExample {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/cogent";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "Cogent123";
   
   public static void main(String[] args) {
   Connection conn = null;
   PreparedStatement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      String sql = "UPDATE emp_cogent set salary=? WHERE id=?";
      stmt = conn.prepareStatement(sql);
      
      //Bind values into the parameters.
      stmt.setInt(1, 235000000);  // This would set salary
      stmt.setInt(2, 13); // This would set ID
      
      // Let us update age of the record with ID = 102;
      int rows = stmt.executeUpdate();
      System.out.println("Rows impacted : " + rows );

      // Let us select all the records and display them.
      sql = "SELECT id, first_name, last_name, salary FROM emp_cogent";
      ResultSet rs = stmt.executeQuery(sql);

      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt(1);
         int salary = rs.getInt(4);
         String first = rs.getString(2);
         String last = rs.getString(3);

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", Salary: " + salary);
         System.out.print(", First: " + first);
         System.out.println(", Last: " + last);
      }
      //STEP 6: Clean-up environment
      rs.close();
      stmt.close();
      conn.close();
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
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
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