/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display;

import dao.ListDao;
import entity.Product;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Mohsin
 */
@ManagedBean
@SessionScoped
public class DisplayProductMB {
    Product product=new Product();
   String allproduct;
    private Product selectedProduct;

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectProduct) {
        this.selectedProduct = selectProduct;
    }

    public String getAllproduct() {
        return allproduct;
    }

    public void setAllproduct(String allproduct) {
        this.allproduct = allproduct;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public List<Product>getALLProduct(){
    List<Product> plist=new ListDao().allProductList();
    
    return plist;
    }
}
