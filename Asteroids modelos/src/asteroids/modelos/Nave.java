/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids.modelos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;

/**
 *
 * @author Temporar
 */
public class Nave {
    Image imagen = new ImageIcon(getClass().getResource("/Imagenes/nave.png")).getImage();
    int xpos = 50,ypos = 230;
    
    public void update(int c) {
        switch(c) {
            case 38:
                ypos -= 10;
                break;
            case 40:
                ypos += 10;
                break;
        }
    }
    public void update(){
        
    }
    public void Draw(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        int spriteheight = imagen.getHeight(null);
        int spritewidth = imagen.getWidth(null);
        AffineTransform AT = new AffineTransform();
        AT.translate(xpos, ypos);
        g2d.drawImage(imagen, AT, null);

    }
    public Rectangle getRecT(){
        Rectangle rect = null;
        rect = new Rectangle(xpos, ypos, imagen.getWidth(null), imagen.getHeight(null));
        return rect;
    }
    
}
