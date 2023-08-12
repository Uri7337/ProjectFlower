
package com.mycompany.projectflower;


public class Exit implements MenuItem, Executable{
    String name = "Exit";
    public String name(){
        return name;
    }
    
    public void Exitthegame(){
        System.exit(0);
    }

    @Override
    public String itemName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void execute(int user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
