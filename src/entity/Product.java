/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Arrays;

/**
 *
 * @author Vladimir
 */
public class Product {
    private String productName;
    private Manufacturer[] manufacturers;
    private int publishedYear;

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Manufacturer[] getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(Manufacturer[] manufacturers) {
        this.manufacturers = manufacturers;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "Product{" + "productName=" + productName + ", manufacturers=" + Arrays.toString(manufacturers) + ", publishedYear=" + publishedYear + '}';
    }
    
    
    
    
}