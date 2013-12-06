package com.jdbc;

//STEP 1. Import required packages
import java.sql.*;
import java.util.*;

public class InsertExample {
 // JDBC driver name and database URL
/* static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
 static final String DB_URL = "jdbc:mysql://localhost:3306/cogent";

 //  Database credentials
 static final String USER = "root";
 static final String PASS = "Cogent123";
  */
 private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
	private static final String DB_USER = "SCOTT";
	private static final String DB_PASS = "Cogent123";
 
 
 
 public static void main(String[] args) {
 Connection conn = null;
 Statement stmt = null;
 try{
    //STEP 2: Register JDBC driver
    Class.forName(DB_DRIVER);

    //STEP 3: Open a connection
    
    System.out.println("Connecting to a selected database...");
    conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    System.out.println("Connected database successfully...");
    
    //STEP 4: Execute a query
    System.out.println("Inserting records into the table...");
    stmt = conn.createStatement();
    
    
  /*  String sql="create table vivek(empId numeric(4),enpName varchar(50),empSal numeric(7,2))";
   stmt.execute(sql);
    sql = "INSERT INTO vivek " +
                 "VALUES (100, 'Sachin', 1000)";
    stmt.executeUpdate(sql);
    sql = "INSERT INTO vivek " +
                 "VALUES (101, 'MahndraSingh', 2345)";
    stmt.executeUpdate(sql);
    sql = "INSERT INTO vivek " +
                 "VALUES (102, 'Yuvraj', 3456)";
    stmt.executeUpdate(sql);
    sql = "INSERT INTO vivek " +
                 "VALUES(103, 'Kapil', 1234)";
    stmt.executeUpdate(sql);*/
    String sql="delete from vivek where empId=100";
   stmt.execute(sql);
      sql = "UPDATE vivek " +
            "SET enpName= 'Deve' WHERE empId in (101,102)";
    stmt.executeUpdate(sql);
   //  stmt.executeUpdate(sql);
    System.out.println("Inserted records into the table...");
    

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
