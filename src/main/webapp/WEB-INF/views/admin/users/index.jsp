<%-- 
    Document   : index
    Created on : May 18, 2018, 8:46:12 AM
    Author     : USER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Users!</h1>
        <div class="pull-right">
            <p>
                <a href="${pageContext.request.contextPath}/admin/users/add">
                    Add User
                </a>
            </p>
        </div>
        <table class="table">
            <tr>
                <th>Id</th>
                <th>UserName</th>
                <th>Email</th>
                <th>Status</th>
            </tr>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.userName}</td>
                    <td>${user.email}</td>
                    <td>${user.status}</td>
                </tr>
                
            </c:forEach>
        </table>
    </body>
</html>
