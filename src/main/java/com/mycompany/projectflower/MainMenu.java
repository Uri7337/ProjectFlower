
package com.mycompany.projectflower;

import java.util.ArrayList;

public class MainMenu implements MenuItem{
    User usr;
    Bank acc;
    Flower f;
    Shop sh;
    Minigame mg;
    DatabaseHandler dh;
    Browser br;
    Curl cr;
    Exit ex;
    ArrayList<String> menu = new ArrayList<String>();
    String name = "MainMenu";
    public void execute(int user){
        System.out.println(menu.get(user));
    }
    public String name(){
        
       return name;
    }
    public ArrayList<String> getItems(){
        menu.add("ads"); // <-- jak dostamu do arrayListu hodnoty z ostatních Objektů prosím?
        
        
        return menu;
    } 
     public void showmenu(){
        //index + jméno položky
        //for cyklus přes lista zavloám menu
        for (String i : menu) {
             System.out.println(i);
        }
        acc.name();
        sh.menu();
        f.menu();
        mg.menu();
        ex.menu();
    }
}
