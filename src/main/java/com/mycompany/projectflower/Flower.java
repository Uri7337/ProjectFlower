package com.mycompany.projectflower;

import java.util.List;

public class Flower implements MenuItem, Menu, Executable {
    private int seeds = 0;
    private int growState = 0;
   
    public void menu(){
        System.out.println("3. Check Fields");
    }
    
    public int getSeeds() {
        return seeds;
    }

    public void setSeeds(int seeds) {
        this.seeds = seeds;
    }

   public void grow(){
       if (seeds >10){
           System.out.println("Not Enought seeds");
       }else{
           System.out.println("-10 seeds");
           System.out.println("Growing...");
       }
       
       
   }

    @Override
    public String itemName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MenuItem> getItems() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void execute(int user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
   
}
