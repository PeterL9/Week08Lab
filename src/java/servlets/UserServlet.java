/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import business.RoleServices;
import business.UserServices;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/*import models.Role;
import models.User;*/

/**
 *
 * @author 631503
 */
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RoleServices rs = new RoleServices();
        UserServices us = new UserServices();

        HttpSession session = request.getSession();
        String action = request.getParameter("action");

        /*Role role = rs.get(role, name);
        User user = us.get(email, active, firstName, lastName password, role);*/
        
        getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        RoleServices rs = new RoleServices();
        UserServices us = new UserServices();

        String action = request.getParameter("action");
        //more STRINGS should be filled down the road

        /*switch (action) {
            case "create":
                us.insert(email, active, first_name, last_name, password, Integer.parseInt(role));
                break;
            case "update":
                us.update(email, active, first_name, last_name, password, Integer.parseInt(role));
                break;
            case "delete":
                us.delete(email);
        }*/
        request.setAttribute("message", action);
        
        /*List<User> users = us.getAll(email);
        request.setAttribute("users", users);*/

        getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
    }

}

//users in an arraylist
