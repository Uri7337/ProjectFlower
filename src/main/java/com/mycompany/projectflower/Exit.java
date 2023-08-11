
package com.mycompany.projectflower;


public class Exit implements MenuItem, Executable{
    String name = "Exit";
    public String name(){
        return name;
    }
    
    public void Exitthegame(){
        System.exit(0);
    }
    
}
