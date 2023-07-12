<%-- 
    Document   : GetCookies
    Created on : 21-Jan-2023, 1:25:38 pm
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
        <h1>Get Cookies</h1>
        <%
            Cookie[] my_cookies = request.getCookies();
            
            out.println("<p>Cookies Value " + my_cookies[1].getValue() + "</p>");
        %>
    </body>
</html>
