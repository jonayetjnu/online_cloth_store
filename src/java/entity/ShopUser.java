package entity;
// Generated Apr 1, 2018 12:51:15 PM by Hibernate Tools 4.3.1



/**
 * ShopUser generated by hbm2java
 */
public class ShopUser  implements java.io.Serializable {


     private Integer id;
     private String userName;
     private String userPassword;

    public ShopUser() {
    }

    public ShopUser(String userName, String userPassword) {
       this.userName = userName;
       this.userPassword = userPassword;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassword() {
        return this.userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }




}


