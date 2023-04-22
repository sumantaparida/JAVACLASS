/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oopjdbc;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcOperation {

    public String addStudentsDetails(Students s) {
        String status = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mis", "root", "");
            Statement stmt = con.createStatement();
            int row = stmt.executeUpdate("insert into students(name,course,fees) values('"+s.getName()+"','"+s.getCourse()+"',"+s.getFees()+")");
            if (row > 0) {
                status = "Details Added";
            } else {
                status = "Some Issues";
            }
        } catch (Exception e) {
            status = e.toString();
        }
        return status;
    };
    
    // GET STUDENTS
    public String getStudentsDetails(Students s){
        String status = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mis", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from students");
            status = "Ssd";
        } catch (Exception e) {
             status = e.toString();
        }
        return status;
    };
}
