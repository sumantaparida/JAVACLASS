<%-- 
    Document   : GetSession
    Created on : 21-Jan-2023, 12:21:52 pm
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
        <h1>Get Session two JSP</h1>
        <%
            out.println("<p>Your session value is = " + session.getAttribute("userName") + "</p>");
        %>
    </body>
</html>
