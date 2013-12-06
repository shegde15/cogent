package com.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
 
public class JDBCBatchUpdateExample {
 
	private static final String DB_DRIVER = "=com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost/cogent";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "Cogent123";
	private static final DateFormat dateFormat = new SimpleDateFormat(
			"yyyy/MM/dd HH:mm:ss");
 
	public static void main(String[] argv) {
 
		try {
 
			batchInsertRecordsIntoTable();
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
 
		}
 
	}
 
	private static void batchInsertRecordsIntoTable() throws SQLException {
		 
		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;
 
		String insertTableSQL = "INSERT INTO DBUSER"
				+ "(USER_ID, USERNAME, CREATED_BY, CREATED_DATE) VALUES"
				+ "(?,?,?,?)";
 
		try {
			dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(insertTableSQL);
 
			dbConnection.setAutoCommit(false);
 
			preparedStatement.setInt(1, 333);
			preparedStatement.setString(2, "Yao");
			preparedStatement.setString(3, "system");
			preparedStatement.setTimestamp(4, getCurrentTimeStamp());
			preparedStatement.addBatch();
 
			preparedStatement.setInt(1, 334);
			preparedStatement.setString(2, "Vivek");
			preparedStatement.setString(3, "system");
			preparedStatement.setTimestamp(4, getCurrentTimeStamp());
			preparedStatement.addBatch();
 
			preparedStatement.setInt(1, 335);
			preparedStatement.setString(2, "Mohammed");
			preparedStatement.setString(3, "system");
			preparedStatement.setTimestamp(4, getCurrentTimeStamp());
			preparedStatement.addBatch();
 
			preparedStatement.setInt(1, 336);
			preparedStatement.setString(2, "Ping");
			preparedStatement.setString(3, "system");
			preparedStatement.setTimestamp(4, getCurrentTimeStamp());
			preparedStatement.addBatch();
 
			
			preparedStatement.executeBatch();
 
			dbConnection.commit();
 
			System.out.println("Record is inserted into DBUSER table!");
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
			dbConnection.rollback();
 
		} finally {
 
			if (preparedStatement != null) {
				preparedStatement.close();
			}
 
			if (dbConnection != null) {
				dbConnection.close();
			}
 
		}
 
	}
 
	private static Connection getDBConnection() {
 
		Connection dbConnection = null;
 
		try {
 
			Class.forName(DB_DRIVER);
 
		} catch (ClassNotFoundException e) {
 
			System.out.println(e.getMessage());
 
		}
 
		try {
 
			dbConnection = DriverManager.getConnection(
                              DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
 
		}
 
		return dbConnection;
 
	}
 
	private static java.sql.Timestamp getCurrentTimeStamp() {
 
		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());
 
	}
 
}