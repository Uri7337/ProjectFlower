package com.mycompany.projectflower;

public class Flower {
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
   
   
}
