/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author samuelmartinezdelcampo
 */
public class Stewie {

    public void draw(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.drawOval(x, y, width, height *  5/ 8);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(x + width / 6, y + height  / 10, width / 6, height / 6);
        graphics.drawOval(x + width * 6/ 10, y + height  / 10, width / 6, height / 6);
        graphics.fillOval(x + width / 4  ,y + height  / 6 , width / 6 / 15 , height/ 6 / 15);
        graphics.fillOval(x + width * 88/130, y + height / 6, width/ 6 /15, height/ 6 /15);
        graphics.drawLine(x + width / 6 * 115/100, y + height * 1 / 8, x + width * 100/308 ,y + height * 10/ 65);
        graphics.drawLine(x + width / 6 * 104/100, y + height * 10/ 47, x + width * 99/308 ,y + height * 10/ 45);
        graphics.drawLine(x + width * 425/700, y + height * 10/ 47, x + width * 377/500 ,y + height * 10/ 45);
        graphics.drawLine(x + width * 429/700, y + height / 7, x + width * 377/500 ,y + height / 7);
        
        graphics.drawLine(x + width * 10/23, y + height *  10/ 45, x + width * 10/2 ,y + height / 7);



        

    }

    public Stewie(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    private int x;
    private int y;
    private int height;
    private int width;

}
