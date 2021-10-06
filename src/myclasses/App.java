/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Manufacturer;
import entity.Product;
import entity.History;
import entity.Customer;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Vladimir
 */
public class App {
    
    public void run(){
        Manufacturer manufacturer1 = new Manufacturer();
        manufacturer1.setFirstname("Lev");
        manufacturer1.setLastname("Tolstoy");
        Manufacturer[] manufacturers = new Manufacturer[1];
        manufacturers[0]=manufacturer1;
        
        Product product1 = new Product();
        product1.setProductName("Voina i mir");
        product1.setManufacturers(manufacturers);
        product1.setPublishedYear(2021);
        
        Customer customer1 = new Customer();
        customer1.setFirstname("Peter");
        customer1.setLastname("Tamme");
        customer1.setPhone("534545454");
        
        History history1 = new History();
        history1.setProduct(product1);
        history1.setCustomer(customer1);
        Calendar c = new GregorianCalendar();
        history1.setGivenDate(c.getTime());
        System.out.println(history1.toString());
        
        history1.setReturnedDate(c.getTime());
        System.out.println(history1.toString());
    }
    
   
}
    
}
