
package com.mycompany.projectflower;

import java.util.Scanner;

public class Engine {
    //list menu item
    
    User usr;
    Bank acc;
    Flower f;
    Shop sh;
    Minigame mg;
    DatabaseHandler dh;
    Browser br;
    Curl cr;
    Exit ex;
    public void startGame(){
        usr = new User();
        acc = new Bank();
        f = new Flower();
        sh = new Shop();
        mg = new Minigame();
        dh = new DatabaseHandler();
        br = new Browser();
        cr = new Curl();
        ex = new Exit();
        
        System.out.println("Welcome!");
        //dh.connectToDatabase();
        //br.openBrowser();
        cr.getPageData();
        Scanner userinpt = new Scanner(System.in);
        
       
        
        while(true){
            System.out.println("What do you want to do?");
            showmenu();
            usr.setChoice(userinpt.nextInt());
            // z listu si vytáhnu userinput a zavolám execute
            if(usr.getChoice()==1){
                acc.accBalance();
                
            }
            if(usr.getChoice()==4){
                mg.start();
            }
            if(usr.getChoice()==5){
                ex.Exitthegame();
            }
            //Console.clearConsole();
            
            
        }
    }
     public void showmenu(){
        //index + jméno položky
        //for cyklus přes lista zavloám menu
        acc.name();
        sh.menu();
        f.menu();
        mg.menu();
        ex.menu();
    }
}
