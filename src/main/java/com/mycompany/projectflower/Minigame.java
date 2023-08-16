
package com.mycompany.projectflower;

import java.util.List;




public class Minigame implements MenuItem, Menu {
    private String name = "Minigame";
    
    Bank acc;
    
    public String getName(){
        return name;
    }
    
    public void menu(){
        System.out.println("4. Minigame");
    }
    
    //press WASD to earn 1$ or loose 1$ if you miss end with Q
    public void start(){
    acc = new Bank();
        while(true){
            acc.accBalance();
            //keyPressed();
        }
    }

    @Override
    public String itemName() {
        return getName();
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
