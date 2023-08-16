
package com.mycompany.projectflower;

import java.util.ArrayList;
import java.util.List;

public class MainMenu implements Menu{
   
    private List<MenuItem> menuItems = new ArrayList<>();
    private String name = "MainMenu";
    //System.out.println(menuItems.get(user));
    
    public MainMenu() {
        menuItems.add(new Bank());
        menuItems.add(new Shop());
        menuItems.add(new Flower());
        menuItems.add(new Minigame());
        menuItems.add(new Exit());
        
        
    }
    
    
    public String getName(){
        
       return name;
    }
    
    public List<MenuItem> getItems(){
        return menuItems;
    } 
     
  // System.out.println(menuItems.get(userinput)
}
