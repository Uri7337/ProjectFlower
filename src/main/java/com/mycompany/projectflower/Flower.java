package com.mycompany.projectflower;

import java.util.List;

public class Flower implements MenuItem, Menu {
    private int seeds = 0;
    private int growState = 0;
    private String name = "Fields";
    
    public String getName(){
        return name;
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
        return getName();
    }

    @Override
    public List<MenuItem> getItems() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void execute(User user) {
       getName();
    }
   
   
}
