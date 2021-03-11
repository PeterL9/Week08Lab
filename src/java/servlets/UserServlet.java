/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import business.RoleService;
import business.UserService;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Role;
import models.User;

/**
 *
 * @author 631503
 */
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RoleService rs = new RoleService();
        UserService us = new UserService();

        HttpSession session = request.getSession();
        try {
            List<Role> roles = rs.getAll();
            request.setAttribute("roles", roles);
            List<User> users = us.getAll();
            request.setAttribute("users", users);
            String action = request.getParameter("action");
        } catch (Exception ex) {
            Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        RoleService rs = new RoleService();
        UserService us = new UserService();

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

        /*Role role = rs.get(role, name);
        List<User> users = us.getAll(email);
        request.setAttribute("roles", roles);
        request.setAttribute("users", users);*/
        getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
    }

}

//users in an arraylist
