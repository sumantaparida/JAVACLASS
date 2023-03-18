/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author Admin
 */
@WebServlet(name = "GetDetailsByID", urlPatterns = {"/GetDetailsByID"})
public class GetDetailsByID extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String sId;
            sId = request.getParameter("sId");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetDetailsByID</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3> Selected id is : " + sId+"</h3>");
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ims", "root", "");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from students where id="+sId);
                out.println("<table>");
                out.println("<form action=\"UpdateData\" method=\"post\">");
                while (rs.next()) {
                    out.println("<tr>");
                    out.println("<td><input readonly type=\"text\" value=\"");
                    out.println(rs.getInt(1));
                    out.println("\" name=\"sId\"></td>");
                    out.println("<td><input type=\"text\" value=\"");
                    out.println(rs.getString(2));
                    out.println("\" name=\"sName\"></td>");
                    out.println("<td><input type=\"text\" value=\"");
                    out.println(rs.getString(3));
                    out.println("\" name=\"sCourse\"></td>");
                    out.println("<td><input type=\"text\" value=\"");
                    out.println(rs.getInt(4));
                    out.println("\" name=\"sFees\"></td>");
                    out.println("<td><input type=\"submit\" name=\"update\" /></td>");
                    out.println("</tr>");
                }
                out.println("</form");
                out.println("</table>");
            } catch (Exception e) {
                out.println("Error : " + e.toString());
            }
            out.println("<a href=\"GetDataByID\">Back</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
