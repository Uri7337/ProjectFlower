
package com.mycompany.projectflower;

import java.util.List;
import java.util.Scanner;

public class Engine {
    //list menu item
    Menu mm;
    User usr;
    DatabaseHandler dh;

    public Engine(MainMenu mm) {
        this.mm = mm;
    }
    
    public void startGame(){
        usr = new User();
        dh = new DatabaseHandler();
        
        System.out.println("Welcome!");
        Scanner userinpt = new Scanner(System.in);
        
        while(true){
            System.out.println("What do you want to do?");
            
            showMenu();
            
            
            MenuItem item = mm.getItems().get(userinpt.nextInt());
            item.execute(usr);
            // z listu si vytáhnu userinput a zavolám execute
            //Console.clearConsole();
            
            
        }
        
    }
    public void showMenu(){
        final List<MenuItem> items = mm.getItems();
        int i = 1;
        
        System.out.println(mm.getName());

        for (MenuItem item : items) {
            System.out.println( (i++) + ". "+item.itemName() );
        }
//      for (int i = 0; i < items.size(); i++) {
//            System.out.println((i+1) +". "+items.get(i).itemName() );
//        }
    }
}
