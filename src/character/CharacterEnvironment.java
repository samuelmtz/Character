/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author samuelmartinezdelcampo
 */
class CharacterEnvironment extends Environment {
    
    
    Stewie stewieBig, stewieSmall;

    public CharacterEnvironment() {
        stewieBig = new Stewie(400, 50, 500, 500);
        stewieSmall = new Stewie(100, 400, 250, 250);      
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        
        if (stewieBig != null) {
            stewieBig.draw(graphics);
            
        if (stewieSmall != null){
            stewieSmall.draw(graphics);
        }    
        }
    }
    
}
