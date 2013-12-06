package com.jdbc;

import java.sql.*;

public class ResultSetMetaDataExample1 {
   public static void main(String[] args) throws Exception{
    //  Class.forName("org.apache.derby.jdbc.ClientDriver");
      Connection con = DriverManager.getConnection
      ("jdbc:mysql://localhost:3306/cogent","root","Cogent123");
      Statement stmt = con.createStatement();
      String query = "select * from emp order by empName";
      ResultSet rs = stmt.executeQuery(query);
      ResultSetMetaData rsmd = rs.getMetaData();
      System.out.println("no of columns in the table= "+
      rsmd.getColumnCount());
      System.out.println("Name of the first column "+ 
      rsmd.getColumnName(1));
      System.out.println("Type of the second column "+
      rsmd.getColumnTypeName(2));
      System.out.println("No of characters in 3rd column "+ 
      rsmd.getColumnDisplaySize(2));
   }
}