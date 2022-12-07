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
        <span>Get List Students: ${pageContext.request.contextPath}/api/student</span> <br><br>
        <span>Get Student by Id - Method GET: ${pageContext.request.contextPath}/api/student/{Id of Student}</span> <br><br>
        <span>Delete Student by Id - Method DELETE: ${pageContext.request.contextPath}/api/student/{Id of Student}</span><br><br>
        <span>Add Student - Method POST: ${pageContext.request.contextPath}/api/student</span><br><br>
        <span>UPDATE Student by Id - Method PUT: ${pageContext.request.contextPath}/api/student</span><br><br>
    </body>
</html>
