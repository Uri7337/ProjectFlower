
package com.mycompany.projectflower;

import java.util.List;

public class Bank implements MenuItem, Menu {
    private static int money = 100;
    String name = "Bank";
    
    public List<MenuItem> getItems(){
        
    }
    
    public String getName(){
        
    }
    
    public void execute(int user){
        accBalance();
    }
    public String name(){
        
       return name;
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
}
