
package Factory_method;

import javax.swing.ImageIcon;

public class Asteroide_Grande extends Asteroide{
    
    public Asteroide_Grande(int vida, int velocidad, int xpos,int ypos, int rotacion){
        setVida(vida);
        setXpos(xpos);
        setYpos(ypos);
        setVelocidad(velocidad);
        setRotacion(rotacion);
        imagen = new ImageIcon(getClass().getResource("/Imagenes/asteroid.png")).getImage();   
    }
}
