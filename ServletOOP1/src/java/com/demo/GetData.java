/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class GetData extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetData</title>");
            out.println("</head>");
            out.println("<body>");
            String name, course;
            int id, fees;
            id = Integer.parseInt(request.getParameter("sId"));
            fees = Integer.parseInt(request.getParameter("sFees"));
            name = request.getParameter("sName");
            course = request.getParameter("sCourse");
            Student s = new Student();
            s.setId(id);
            s.setName(name);
            s.setCourse(course);
            s.setFees(fees);

            Student s1 = new Student();
            s1.setId(Integer.parseInt(request.getParameter("sId")));
            s1.setName(request.getParameter("sName"));
            s1.setCourse(request.getParameter("sCourse"));
            s1.setFees(Integer.parseInt(request.getParameter("sFees")));

            Student s2 = new Student(Integer.parseInt(request.getParameter("sId")), request.getParameter("sName"), request.getParameter("sCourse"), Integer.parseInt(request.getParameter("sFees")));

            out.println("<h1>ID : " + s.getId());
            out.println("<h1>Name : " + s.getName());
            out.println("<h1>Course : " + s.getCourse());
            out.println("<h1>Fees : " + s.getFees());

            out.println("<hr><h1>ID : " + s1.getId());
            out.println("<h1>Name : " + s1.getName());
            out.println("<h1>Course : " + s1.getCourse());
            out.println("<h1>Fees : " + s1.getFees());

            out.println("<hr><h1>ID : " + s2.getId());
            out.println("<h1>Name : " + s2.getName());
            out.println("<h1>Course : " + s2.getCourse());
            out.println("<h1>Fees : " + s2.getFees());
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
