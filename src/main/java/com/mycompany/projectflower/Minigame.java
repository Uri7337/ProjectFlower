
package com.mycompany.projectflower;




public class Minigame {
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
    
    
    
}
