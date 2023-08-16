
package com.mycompany.projectflower;

import java.util.HashMap;
import java.util.List;

public class Shop implements MenuItem, Menu {
    private HashMap<String, Integer> shopFlowers;
    private String name = "Shop";
    @Override
    public String getName() {
        return name;
    }
    
    public HashMap<String, Integer> getShopFlowers() {
        return shopFlowers;
    }

    public void setShopFlowers(HashMap<String, Integer> shopFlowers) {
        this.shopFlowers = shopFlowers;
    }
    
   //buy seeds
   // sell seeds

    @Override
    public String itemName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MenuItem> getItems() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void execute(User user) {
        getName();
    }

    
    
    
}
