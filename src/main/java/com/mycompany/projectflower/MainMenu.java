
package com.mycompany.projectflower;

import java.util.ArrayList;
import java.util.List;

public class MainMenu implements Menu{
   
    private List<MenuItem> menuItems = new ArrayList<>();
    private String name = "MainMenu";
    //System.out.println(menuItems.get(user));
    public String getName(){
        
       return name;
    }
    
    public MainMenu() {
        menuItems.add(new Bank());
    }
    
    public List<MenuItem> getItems(){
        return menuItems;
    } 
     
  
}
