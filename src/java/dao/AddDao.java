/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Category;
import entity.Product;
import entity.ShopUser;
import entity.SubCategory;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;
import util.SessionUtil;

/**
 *
 * @author Mohsin
 */
public class AddDao {

    public boolean addCategory(Category cat) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();

            session.beginTransaction();
            session.save(cat);
            session.getTransaction().commit();
            session.close();

            return true;
        } catch (Exception e) {
            return false;
        }
    }
      public boolean addSubCategory(SubCategory subcat) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();

            session.beginTransaction();
            session.save(subcat);
            session.getTransaction().commit();
            session.close();

            return true;
        } catch (Exception e) {
            return false;
        }
    }
      public boolean addProduct(Product product) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();

            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
            session.close();

            return true;
        } catch (Exception e) {
            return false;
        }
    }
      
       public boolean updateProduct(Product product) {
        try {

            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();

            session.update(product);

            session.getTransaction().commit();
            session.close();

            return true;

        } catch (Exception e) {
            return false;
        }

    }
     
     
     
     
     public boolean deleteProduct(Product product) {
        try {

            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();

            session.delete(product);

            session.getTransaction().commit();
            session.close();

            return true;

        } catch (Exception e) {
            return false;
        }
    }
    
    
    
    
    public  List<Product> getAllProduct() {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        
        List<Product> list = session.createQuery("SELECT p FROM Product p").list();
        
        list.toString();
        
        session.close();
        
        return list;

    }
    
    
    
     public static List<Product> getProduct(String id) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        
        List<Product> list = session.createQuery("SELECT from Product where lower(id)='"+id.toLowerCase()+"'").list();
        
        list.toString();
        
        session.close();
        
        return list;

    }
    
     
     
     
      public static Product findProduct(int id){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        
        Product product = (Product) session.get(Product.class, id);
        return product;
    }
    
      
      
        
}
