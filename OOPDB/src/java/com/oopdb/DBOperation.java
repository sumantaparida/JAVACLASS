package com.oopdb;

import java.sql.*;
import java.util.ArrayList;

public class DBOperation {

    public static Connection createConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info", "root", "");
        } catch (Exception e) {
        }
        return con;
    }

    public boolean insertDetail(Students student) {
        boolean status = false;
        try {
            Connection con = createConnection();
            PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?,?)");
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getCourse());
            ps.setInt(4, student.getFees());
            int row = ps.executeUpdate();
            if (row > 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
        }
        return status;
    }

    public Students getDetail(int id) {
        Students student = null;
        try {
            Connection con = createConnection();
            PreparedStatement ps = con.prepareStatement("select * from students where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                student = new Students(id, rs.getString(2), rs.getString(3), rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return student;
    }

    public ArrayList getAllStudents() {
        ArrayList<Students> stuArray = new ArrayList();
        Students student = null;
        try {
            Connection con = createConnection();
            PreparedStatement ps = con.prepareStatement("select * from students");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                student = new Students(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                stuArray.add(student);
            }
        } catch (Exception e) {
        }
        return stuArray;
    }
}
