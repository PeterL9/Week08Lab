/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dataaccess.UserDB;
import java.util.List;
import models.User;

/**
 *
 * @author 843876
 */
public class RoleServices {
    
       public List<User> getAll(String email) throws Exception{
           UserDB userdb = new UserDB();
           List<User> user = userdb.getAll(email);
           return user;
       }
       
       public void insert(String email, boolean active, String firstName, String lastName, String password, int role) throws Exception{
           User user = new User(email, active, firstName, lastName, password, role);
           UserDB userDB = new UserDB();
           userDB.insert(user);
       }
       
       public void delete (String email)throws Exception{
           User user = new User();
           user.setEmail(email);
           UserDB userDB = new UserDB();
           userDB.delete(user);
       }
       
       public void update(String email, boolean active, String firstName, String lastName, String password, int role) throws Exception{
           User user = new User(email, active, firstName, lastName, password, role);
           UserDB userDB = new UserDB();
           userDB.update(user);
       }
}
