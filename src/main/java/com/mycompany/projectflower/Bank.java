
package com.mycompany.projectflower;

public class Bank {
    private static int money = 100;
    
    public void menu(){
        System.out.println("1. Bank");
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
