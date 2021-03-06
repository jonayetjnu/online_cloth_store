package entity;
// Generated Apr 1, 2018 12:51:15 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * UserRole generated by hbm2java
 */
public class UserRole  implements java.io.Serializable {


     private Integer roleId;
     private String roleName;
     private Set shopUser1s = new HashSet(0);

    public UserRole() {
    }

	
    public UserRole(String roleName) {
        this.roleName = roleName;
    }
    public UserRole(String roleName, Set shopUser1s) {
       this.roleName = roleName;
       this.shopUser1s = shopUser1s;
    }
   
    public Integer getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public Set getShopUser1s() {
        return this.shopUser1s;
    }
    
    public void setShopUser1s(Set shopUser1s) {
        this.shopUser1s = shopUser1s;
    }




}


