package com.jdbc;

import java.sql.*;

public class JDBC {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException,ClassNotFoundException {
	//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("oracle.jdbc.driver.OracleDriver");
	//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cogent","root","Cogent123");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","Cogent123");
	
	Statement st=con.createStatement();
	//st.execute("create table tong2(eno number(10),ename varchar2(70),esal number(10))");
	st.execute("insert into tong2 values(1,'Jim',3000)");
	st.execute("insert into tong2 values(2,'Sindhoor',4000)");
	st.execute("insert into tong2 values(3,'Li',5000)");
	ResultSet rs=st.executeQuery("select * from tong2");
	while(rs.next()){
		int a1=rs.getInt(1);
		String a2=rs.getString(2);
		int a3=rs.getInt(3);
		System.out.println(a1);System.out.println(a2);System.out.println(a3);
		
	}
	con.close();
	st.close();
		
		
		
		
		
		

	}

}
