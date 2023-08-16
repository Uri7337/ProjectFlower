
package com.mycompany.projectflower;


public class Exit implements MenuItem {
    private String name = "Exit";
    
    public String getName(){
        return name;
    }
    
    public void Exitthegame(){
        System.exit(0);
    }

    @Override
    public String itemName() {
        return getName();
    }

    @Override
    public void execute(User user) {
        getName();
    }
    
}
