
package com.mycompany.projectflower;

import java.util.Scanner;

public class Engine {
    //list menu item
    MainMenu mm;
    User usr;
    DatabaseHandler dh;
    
    public void startGame(){
        usr = new User();
        dh = new DatabaseHandler();
        mm = new MainMenu();
        
        System.out.println("Welcome!");
        Scanner userinpt = new Scanner(System.in);
        
        while(true){
            System.out.println("What do you want to do?");
            
            mm.showMenu();
            usr.setChoice(userinpt.nextInt());
            // z listu si vytáhnu userinput a zavolám execute
            //Console.clearConsole();
            
            
        }
    }
    
}
