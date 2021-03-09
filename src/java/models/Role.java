package models;

import java.io.Serializable;

/**
 *
 * @author 799768
 */
public class Role implements Serializable {
    private int role;
    private String name;

    public Role() {
        
    }
    
    public Role(int role, String name) {
        this.role = role;
        this.name = name;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
