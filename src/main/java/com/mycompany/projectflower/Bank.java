
package com.mycompany.projectflower;

import java.util.List;

public class Bank implements MenuItem, Menu, Executable {
    private static int money = 100;
    private String name;

    public Bank() {
        this.name = "Bank";
    }
    
    
    
    public String getName(){
        return name;
    }
    
    public void execute(int user){
        accBalance();
    }
    public String Menuname(){
        
       return getName();
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        Bank.money = money;
    }
   
    public void accBalance(){
        System.out.println("You have:"+getMoney()+"$");
    }

    @Override
    public String itemName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MenuItem> getItems() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
