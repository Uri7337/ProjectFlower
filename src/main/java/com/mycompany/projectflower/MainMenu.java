
package com.mycompany.projectflower;

import java.util.ArrayList;

public class MainMenu implements MenuItem{
    ArrayList<String> menu = new ArrayList<String>();
    String name = "MainMenu";
    public void execute(int user){
        getItems();
    }
    public String name(){
        
       return name;
    }
    public ArrayList<String> getItems(){
        menu.add("ads");
        
        
        return menu;
    } 
}
