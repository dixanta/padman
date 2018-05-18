<%-- 
    Document   : add
    Created on : May 18, 2018, 8:49:37 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add User</h1>
        <form method="post" action="${pageContext.request.contextPath}/admin/users/save">
            <div class="form-group">
                <label>User Name</label>
                <input type="text" name="userName" class="form-control" required="required"/>
            </div>
            <div class="form-group">
                <label>Password</label>
                <input type="text" name="password" class="form-control" required="required"/>
            </div>
            <div class="form-group">
                <label>Email</label>
                <input type="email" name="email" class="form-control" required="required"/>
            </div>
            <button type="submit" class="btn btn-success">Save</button>
        </form>
    </body>
</html>
