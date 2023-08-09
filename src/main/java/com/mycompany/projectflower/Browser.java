
package com.mycompany.projectflower;

//import java.awt.Desktop; // another way to open browser
//import java.net.URI;

public class Browser {
    
    void openBrowser(){
     try{
        Runtime rt = Runtime.getRuntime();
        String url = "http://stackoverflow.com";
        rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
    }catch(Exception e){  System.out.println("Something went wrong." + e);  }
    }
    /*
    void openBrowser(){
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            Desktop.getDesktop().browse(new URI("http://www.example.com"));
        }
    }
    */
    
}
