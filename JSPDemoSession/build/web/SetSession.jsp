<%-- 
    Document   : SetSession
    Created on : 21-Jan-2023, 12:26:04 pm
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Get Session one JSP</h1>
        <%
            String userName = request.getParameter("userName");
            session.setAttribute("userName", userName);
            out.println("<p>Hello " + userName + "</p>");
            out.println("<p>Now your name set in session = " + session.getAttribute("userName") + "</p>");
        %>
        <a href="GetSession.jsp">Navigate Page Two</a>
    </body>
</html>
