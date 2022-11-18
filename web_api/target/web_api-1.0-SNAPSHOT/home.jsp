<%-- 
    Document   : home
    Created on : Nov 17, 2022, 5:14:01 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>REST-API PAGE</h1>
        <span>Get List Students: </span><a href="${pageContext.request.contextPath}/api/student">Get List Students</a> <br><br>
        <span>Copy this URL then add id of Student at the End of URL (Default ID is 1): </span>
        <a href="${pageContext.request.contextPath}/api/student/1">${pageContext.request.contextPath}/api/student/</a> <br><br>
    </body>
</html>
