
package com.mycompany.projectflower;



public class ProjectFlower {
   
    
    public static void main(String[] args) {
        //předat usera a databázi
        Engine game = new Engine(new MainMenu());
        game.startGame();
    }
   
    
}
