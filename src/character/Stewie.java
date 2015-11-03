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

    private static Color FACE_PINK = new Color(247, 214, 183);

    public void draw(Graphics graphics) {

        graphics.setColor(Color.BLACK);
//       HEAD
        graphics.setColor(FACE_PINK);
        graphics.fillOval(x, y, width, height * 5 / 8);

        graphics.setColor(Color.black);
        graphics.drawOval(x, y, width, height * 5 / 8);
        graphics.setColor(Color.BLACK);

//        Eyes -Eyeballs
        graphics.setColor(Color.white);

        graphics.fillOval(x + width / 6, y + height / 10, width / 6, height / 6);
        graphics.fillOval(x + width * 6 / 10, y + height / 10, width / 6, height / 6);

        //eyelids
        graphics.setColor(FACE_PINK);
//        graphics.fillArc(x + width / 6, y + (height * 5 / 100), width / 6, height / 6, 0, 180);
        int[] xValues = new int[3];

        xValues[0] = (x + width / 6 * 115 / 100);
        xValues[1] = (x + width / 3);
        xValues[2] = (x + width / 4);

        int[] yValues = new int[3];

        yValues[0] = (y + height * 1 / 8);
        yValues[1] = (y + height * 101 / 650);
        yValues[2] = (y + height * 3 / 65);

        graphics.setColor(FACE_PINK);
        graphics.fillPolygon(xValues, yValues, xValues.length);

        int[] xxValues = new int[3];

        xxValues[0] = (x + width * 429 / 700);
        xxValues[1] = (x + width * 377 / 500);
        xxValues[2] = (x + width * 7 / 10);

        int[] yyValues = new int[3];

        yyValues[0] = (y + height / 7);
        yyValues[1] = (y + height / 7);
        yyValues[2] = (y + height * 2 / 65);

        graphics.setColor(FACE_PINK);
        graphics.fillPolygon(xxValues, yyValues, xxValues.length);

        int[] xxxValues = new int[3];

        xxxValues[0] = (x + width / 6);
        xxxValues[1] = (x + width * 100 / 308);
        xxxValues[2] = (x + width * 1 / 4);

        int[] yyyValues = new int[3];

        yyyValues[0] = (y + height * 17 / 80);
        yyyValues[1] = (y + height * 145 / 650);
        yyyValues[2] = (y + height * 25 / 65);

        graphics.setColor(FACE_PINK);
        graphics.fillPolygon(xxxValues, yyyValues, xxxValues.length);

        int[] xxxxValues = new int[3];

        xxxxValues[0] = (x + width * 425 / 700);
        xxxxValues[1] = (x + width * 378 / 500);
        xxxxValues[2] = (x + width * 27 / 40);

        int[] yyyyValues = new int[3];

        yyyyValues[0] = (y + height * 17 / 80);
        yyyyValues[1] = (y + height * 145 / 650);
        yyyyValues[2] = (y + height * 25 / 65);

        graphics.setColor(FACE_PINK);
        graphics.fillPolygon(xxxxValues, yyyyValues, xxxxValues.length);

        graphics.setColor(Color.BLACK);
        graphics.drawOval(x + width / 6, y + height / 10, width / 6, height / 6);
        graphics.drawOval(x + width * 6 / 10, y + height / 10, width / 6, height / 6);

        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + width / 4, y + height / 6, width / 6 / 15, height / 6 / 15);
        graphics.fillOval(x + width * 88 / 130, y + height / 6, width / 6 / 15, height / 6 / 15);
//      Eye lids
        graphics.drawLine(x + width / 6 * 115 / 100, y + height * 1 / 8, x + width * 100 / 308, y + height * 10 / 65);
        graphics.drawLine(x + width / 6 * 104 / 100, y + height * 10 / 47, x + width * 99 / 308, y + height * 10 / 45);
        graphics.drawLine(x + width * 425 / 700, y + height * 10 / 47, x + width * 377 / 500, y + height * 10 / 45);
        graphics.drawLine(x + width * 429 / 700, y + height / 7, x + width * 377 / 500, y + height / 7);

//        Nose
        graphics.drawLine(x + width * 102 / 230, y + height * 7 / 45, x + width * 4 / 10, y + height / 5);
        graphics.drawLine(x + width * 4 / 10, y + height / 5, x + width * 97 / 230, y + height * 102 / 450);
//        Mouth
        graphics.drawLine(x + width * 99 / 230, y + height * 127 / 450, x + width * 93 / 230, y + height * 137 / 450);
        graphics.drawLine(x + width * 93 / 230, y + height * 137 / 450, x + width * 103 / 230, y + height * 137 / 450);
        graphics.drawArc(x + width * 87 / 230, y + height * 274 / 900, width / 8, height / 8, 60, 25);
        graphics.drawLine(x + width * 97 / 230, y + height * 137 / 450, x + width * 101 / 230, y + height * 145 / 450);

//        Eyebrows
        graphics.drawLine(x + width / 6 * 6/4, y + height * 25 / 320, x + width * 101 / 308, y + height * 34/320);
        graphics.drawLine(x + width *  7/10 , y + height * 23 / 320, x + width * 62 / 100, y + height * 32/320);

        
//        Ears
        graphics.drawOval(x, y + height * 23/100, width/20, height/15);
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
