package com.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class JDBCTransactionExample {
 
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/cogent";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "Cogent123";
 
	public static void main(String[] argv) throws SQLException {
 
		Connection dbConnection = null;
		PreparedStatement preparedStatementInsert = null;
		PreparedStatement preparedStatementUpdate = null;
 
		String insertTableSQL = "INSERT INTO DBUSER"
				+ "(USER_ID, USERNAME, CREATED_BY, CREATED_DATE) VALUES"
				+ "(?,?,?,?)";
 
		String updateTableSQL = "UPDATE DBUSER SET USERNAME =? "
				+ "WHERE USER_ID = ?";
 
		try {
			dbConnection = getDBConnection();
 
			dbConnection.setAutoCommit(false);
 
		preparedStatementInsert = dbConnection.prepareStatement(insertTableSQL);
			preparedStatementInsert.setInt(1, 100);
			preparedStatementInsert.setString(2, "Saran");
			preparedStatementInsert.setString(3, "system");
			preparedStatementInsert.setTimestamp(4, getCurrentTimeStamp());
			preparedStatementInsert.executeUpdate();
 
		preparedStatementUpdate = dbConnection.prepareStatement(updateTableSQL);
			
			preparedStatementUpdate.setInt(1, 100);
			preparedStatementUpdate.setString(2, "Mohammed");
			
			
			preparedStatementUpdate.executeUpdate();
 
			dbConnection.commit();
 
			System.out.println("Done!");
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
			dbConnection.rollback();
 
		} finally {
 
			if (preparedStatementInsert != null) {
				preparedStatementInsert.close();
			}
 
			if (preparedStatementUpdate != null) {
				preparedStatementUpdate.close();
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
 
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,
					DB_PASSWORD);
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