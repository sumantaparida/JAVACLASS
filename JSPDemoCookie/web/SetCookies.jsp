<%-- 
    Document   : SetCookies
    Created on : 21-Jan-2023, 1:03:07 pm
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
        <h1>Cookies</h1>
        <%
            String userName = request.getParameter("userName");
            out.println("<p>Hello " + userName + "</p>");
            
            Cookie userNameCookie = new Cookie("userName", userName);
            userNameCookie.setMaxAge(32);
            response.addCookie( userNameCookie );
        %>
        <a href="GetCookies.jsp">Get Cookies</a>
    </body>
</html>
