/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import com.mysql.jdbc.PreparedStatement;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory.Result;
import models.User;
import dataaccess.ConnectionPool;
import dataaccess.UserDB;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author 843876
 */
public class UserService {
    
       public List<User> getAll() throws Exception{
           UserDB userdb = new UserDB();
           List<User> user = userdb.getAll();
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
