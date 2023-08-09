
package com.mycompany.projectflower;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class KeyHandler implements KeyListener {
    
    
    
    /** Handle the key typed event from the text field. */
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e + "KEY TYPED: ");
    }

    /** Handle the key-pressed event from the text field. */
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e+ "KEY PRESSED: ");
    }

    /** Handle the key-released event from the text field. */
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e+ "KEY RELEASED: ");
    }
}
