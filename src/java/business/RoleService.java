/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dataaccess.RoleDB;
import dataaccess.UserDB;
import java.util.List;
import models.Role;
import models.User;

/**
 *
 * @author 843876
 */
public class RoleService {
    public List<Role> getAll() throws Exception{
        RoleDB roledb = new RoleDB();
        List<Role> role = roledb.getAll();
        return role;
    }

}
