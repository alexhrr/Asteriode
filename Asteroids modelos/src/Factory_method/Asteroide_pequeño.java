
package Factory_method;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Asteroide_pequeño extends Asteroide{
    
    public Asteroide_pequeño(int vida, int velocidad, int xpos,int ypos, int rotacion){
        setVida(vida);
        setXpos(xpos);
        setYpos(ypos);
        setVelocidad(velocidad);
        setRotacion(rotacion);
        imagen = new ImageIcon(getClass().getResource("/Imagenes/asteroid.png")).getImage();
    }
    
    
}
    
