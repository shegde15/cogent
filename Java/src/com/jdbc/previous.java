package com.jdbc;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;


public class previous extends Frame implements ActionListener{
TextField tf1=new TextField(10);
TextField tf2=new TextField(10);
TextField tf3=new TextField(10);
Button b1=new Button("next");
Button b2=new Button("previous");
Button b3=new Button("first");
Button b4=new Button("last");
Connection con;
Statement st;
ResultSet rs;
public previous(){
try{
setLayout(new FlowLayout());
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/cogent","root","Cogent123");
st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
ResultSet.CONCUR_READ_ONLY);
rs=st.executeQuery("select * from emp");
}catch(Exception ex){}
add(tf1);
add(tf2);
add(tf3);
add(b1);
add(b2);
add(b3);
add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){
	System.exit(0);}});
}





    public void actionPerformed(ActionEvent e1){
    try{ 
    if(e1.getSource()==b1){
    rs.next();
    if(rs.isAfterLast())
    rs.first();
    call();
    }


    else if(e1.getSource()==b2){
    rs.previous();
    if(rs.isBeforeFirst())
    rs.last();
    call();
    }

    else if(e1.getSource()==b3){
    rs.first();
    call();
    }

    else if(e1.getSource()==b4){
    rs.last();
    call();
    }
    }catch(Exception eeee){}
}
    public void call(){
    try{
    tf1.setText(""+rs.getInt(1));
    tf2.setText(""+rs.getString(2));
    tf3.setText(""+rs.getDouble(3));
     }catch(Exception cc){System.out.println(cc);}
    }

     

public static void main(String args[]){
previous pp=new previous();
pp.setSize(400,400);
pp.setVisible(true);
}
}



