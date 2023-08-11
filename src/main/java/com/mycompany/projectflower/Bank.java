
package com.mycompany.projectflower;

public class Bank implements MenuItem {
    private static int money = 100;
    String name = "Bank";
    
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
