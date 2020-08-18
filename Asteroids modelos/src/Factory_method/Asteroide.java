/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_method;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;


public abstract class Asteroide {
    int xpos,ypos,velocidad, vida,rotacion;
    Image imagen;
    
    public void Update() {
        xpos-=velocidad;
        rotacion+= 5;
    }
    public void Draw(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        int spriteheight = imagen.getHeight(null);
        int spritewidth = imagen.getWidth(null);
        AffineTransform AT = new AffineTransform();
        AT.rotate(Math.toRadians(rotacion), xpos + spritewidth/2, ypos + spriteheight/2);
        AT.translate(xpos, ypos);
        g2d.drawImage(imagen, AT, null);

    }
    public Rectangle getRecT(){
        Rectangle rect = null;
        rect = new Rectangle(xpos, ypos, imagen.getWidth(null), imagen.getHeight(null));
        return rect;
    }
    
    public void setVida(int v){
        vida = v;
    }
    
    public void setXpos(int xp){
        xpos = xp;
    }
    
    public void setYpos(int yp){
        ypos = yp;
    }
    
    public void setRotacion(int rot){
        rotacion = rot;
    }
    public void setVelocidad(int vel){
        velocidad = vel;
    }
    public int getvida(){
        return vida;
    }
    public int getYpos(){
        return ypos;
    }
}
