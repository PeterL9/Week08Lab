<%-- 
    Document   : users
    Created on : Mar 9, 2021, 1:19:53 PM
    Author     : 799768
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users</title>
    </head>
    <body>
        <form action="update" method="POST">
            <table>
                <tr>
                    <th>Email</th>
                    <th>S</th>
                    <th>Email</th>
                    <th>Email</th>
                </tr>
                <c:forEach items="${users}" var="user">

                    <tr>
                        <td>${user.email}</td>
                        <td>${user.firstName}</td>
                        <td>${user.lastName}</td>                        
                        <td>${user.role}</td>
                    </tr>
                </c:forEach>
            </table>
            <h1>Manage Users</h1>
            Email: <br>
            Active: <br>
            First Name: <br>
            Last Name: <br>
            Password: <br>
            Role: 
            <select name="roles" id="roles">
                <option value="sysadmin">System Admin</option>
                <option value="regularuser">Regular User</option>
                <option value="companyuser">Company Admin</option>
            </select> <br>
            <input type="submit" value="Save Changes">
        </form>

        <form action="create" method="POST">
            <h1>Add User</h1>
            Email: <input type="text" name="email"> <br>
            First Name: <input type="text" name="firstName"> <br>
            Last Name: <input type="text" name="lastName"> <br>
            Password: <input type="text" name="password"> <br>
            Role:             
            <select name="roles" id="roles">
                <option value="sysadmin">System Admin</option>
                <option value="regularuser">Regular User</option>
                <option value="companyuser">Company Admin</option>
            </select>

            <br><input type="submit" value="add User">

        </form>

        <form action="delete" method="POST">
            <h1>Edit / Delete User</h1>
            Email: <br>
            First Name: <br>
            Last Name: <br>
            Role: 
            <select name="roles" id="roles">
                <option value="sysadmin">System Admin</option>
                <option value="regularuser">Regular User</option>
                <option value="companyuser">Company Admin</option>
            </select> <br>
            <input type="submit" value="Save Changes">
            <input type="submit" value="Delete">
            <input type="submit" value="Cancel">
        </form>
    </body>
</html>
