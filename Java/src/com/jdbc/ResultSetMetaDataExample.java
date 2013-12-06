package com.jdbc;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMetaDataExample {
  public static void main(String args[]) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cogent", "root", "Cogent123");
    Statement stmt = con.createStatement();

    boolean notDone = true;
    String sqlStr = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (notDone) {
      sqlStr = br.readLine();
      if (sqlStr.startsWith("SELECT") || sqlStr.startsWith("select")) {
        ResultSet rs = stmt.executeQuery(sqlStr);
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();
        for (int x = 1; x <= columnCount; x++) {
          String columnName = rsmd.getColumnName(x);
          System.out.print(columnName);
        }
        while (rs.next()) {
          for (int x = 1; x <= columnCount; x++) {
            if (rsmd.getColumnTypeName(x).compareTo("CURRENCY") == 0)
              System.out.print("$");
            String resultStr = rs.getString(x);
            System.out.print(resultStr + "\t");
          }
        }
      } else if (sqlStr.startsWith("exit"))
        notDone = false;
    }
    stmt.close();
    con.close();
  }
}