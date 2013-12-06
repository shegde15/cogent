package com.jdbc;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
class BuildFrame {
    private JFrame jf;
    private JScrollPane js;
    private JTable jt;
    private DefaultTableModel mod;
    private String link = "jdbc:mysql://127.0.0.1:3306/cogent";
    private String uname = "root";
    private String passwd ="Cogent123";
    public BuildFrame() {
        System.out.println("Constructor called");
        jf = new JFrame("JTable Example #2");
        js = new JScrollPane();
        jt = new JTable();
        mod = new DefaultTableModel() {
            @Override
            public int getColumnCount() {
                return 4;
            }
            @Override
            public String getColumnName(int column) {
                switch (column) {
                    case 0:
                        return "ID";
                    case 1:
                        return "Name";
                    case 2:
                        return "Age";
                    
                    default:
                        return "";
                }
            }
        };
        jt.setModel(mod);
        jf.setSize(400, 300);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocation(200, 300);
        jf.add(js);
        js.setViewportView(jt);
        loadTableData();
        jf.setVisible(true);
    }
    private void loadTableData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            Statement st;
            ResultSet rs = null;
            con = DriverManager.getConnection(link, uname, passwd);
            st = con.createStatement();
            rs = st.executeQuery("select * from studentjdbc");
            while (rs.next()) {
                mod.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getInt(3)});
            }
            rs.close();
            st.close();
            con.close();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
public class SwingJTable {
    public static void main(String[] args) {
        // TODO code application logic here
        BuildFrame bf = new BuildFrame();
    }
}
