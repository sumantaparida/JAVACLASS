<%-- 
    Document   : GetData2
    Created on : 21-Jan-2023, 12:15:19 pm
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
        <%
         String user=request.getParameter("userName");
         out.println("Hello "+user);
        %>
    </body>
</html>
