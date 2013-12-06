package com.jdbc;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListExample extends JFrame {

        JPanel panel = new JPanel();

        public JListExample() {
                panel.setLayout(null);
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection(
                                        "jdbc:mysql://localhost:3306/", "root", "Cogent123");
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("show databases");
                        String data = "";
                        while (rs.next()) {
                                data += rs.getString("Database") + " ";
                        }
                        String db[] = data.split(" ");
                        final JList list1 = new JList(db);
                        JScrollPane pane1 = new JScrollPane(list1);
                        final DefaultListModel model = new DefaultListModel();
                        final JList list2 = new JList(model);
                        JScrollPane pane2 = new JScrollPane(list2);
                        final DefaultListModel model2 = new DefaultListModel();
                        final JList list3 = new JList(model2);
                        JScrollPane pane3 = new JScrollPane(list3);
                        list1.addListSelectionListener(new ListSelectionListener() {
                                public void valueChanged(ListSelectionEvent e) {
                                        if (!e.getValueIsAdjusting()) {
                                                model.clear();
                                                String st = (String) list1.getSelectedValue();
                                                System.out.println(st);
                                                try {
                                                        Connection conn = DriverManager.getConnection(
                                                                        "jdbc:mysql://localhost:3306/" + st,
                                                                        "root", "Cogent123");
                                                        DatabaseMetaData meta = conn.getMetaData();
                                                        ResultSet res = meta.getTables(null, null, "%",
                                                                        null);
                                                        String tableNames = "";
                                                        while (res.next()) {
                                                                tableNames = res.getString(3) + " ";
                                                                model.addElement(tableNames);
                                                        }
                                                        model.removeElement("mysql");
                                                } catch (Exception ex) {
                                                }
                                        }
                                }
                        });
                        list2.addListSelectionListener(new ListSelectionListener() {
                                public void valueChanged(ListSelectionEvent e) {
                                        if (!e.getValueIsAdjusting()) {
                                                model2.clear();
                                                String str = (String) list2.getSelectedValue();
                                                String s = (String) list1.getSelectedValue();
                                                try {
                                                        Connection conn = DriverManager.getConnection(
                                                                        "jdbc:mysql://localhost:3306/" + s, "root",
                                                                        "Cogent123");
                                                        Statement stmt = conn.createStatement();
                                                        ResultSet res = stmt.executeQuery("SELECT * FROM "
                                                                        + str + "");
                                                        ResultSetMetaData md = res.getMetaData();
                                                        int col = md.getColumnCount();
                                                        for (int i = 1; i <= col; i++) {
                                                                String col_name = md.getColumnName(i);
                                                                model2.addElement(col_name);
                                                        }
                                                } catch (Exception ex) {
                                                }
                                        }
                                }
                        });
                        pane1.setBounds(10, 10, 100, 100);
                        pane2.setBounds(120, 10, 100, 100);
                        pane3.setBounds(230, 10, 100, 100);
                        panel.add(pane1);
                        panel.add(pane2);
                        panel.add(pane3);
                        add(panel);
                        setSize(400, 200);
                        setVisible(true);
                } catch (Exception e) {
                }
        }

        public static void main(String[] args) {
                new JListExample();
        }
}