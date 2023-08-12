
package com.mycompany.projectflower;

import java.util.List;




public class Minigame implements MenuItem, Menu, Executable {
    Bank acc;
    
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MenuItem> getItems() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void execute(int user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
