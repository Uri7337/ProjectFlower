
package com.mycompany.projectflower;


public class Exit implements MenuItem, Executable{
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
    public void execute(int user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
