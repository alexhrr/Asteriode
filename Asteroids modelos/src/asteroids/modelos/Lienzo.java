
package asteroids.modelos;

import Factory_method.Asteroide;
import Factory_method.AsteroideFactorymethod;
import Factory_method.Asteroides_Factory;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;import java.util.Iterator;

import javax.swing.JPanel;

public class Lienzo extends JPanel implements KeyListener{
    Nave na;
    Toolkit screen = Toolkit.getDefaultToolkit();
    Dimension screensize = screen.getScreenSize();
    public int alto = (int) screensize.getHeight();
    public int ancho = (int) screensize.getWidth();
    Image imgBuffer;
    AsteroideFactorymethod FabricaAsteroides = new Asteroides_Factory();
    ArrayList<Asteroide> meteoro;
    Graphics miG;
    private final Timer timer;

    public Lienzo(){
        na = new Nave();
        meteoro = new ArrayList<Asteroide>();
        for (int i = 0; i <5; i++) {
            meteoro.add(FabricaAsteroides.CrearAsteroide(10));
        }
        setBounds(0, 0, ancho, alto);
        imgBuffer = new BufferedImage(ancho, alto, BufferedImage.OPAQUE);
        timer = new Timer();
        timer.schedule(new Actualizador(), 0, 100);
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        Iterator<Asteroide> it = meteoro.iterator();
        miG = imgBuffer.getGraphics();
        na.Draw(miG);
        while (it.hasNext()) {
            it.next().Draw(miG);
            
        }  
        
        g.drawImage(imgBuffer, 0, 0, this);
        collision();

    }

    public void collision() {
       Iterator<Asteroide> it = meteoro.iterator();
        while (it.hasNext()) {
            Asteroide as = it.next();
            as.Update();
        } 
        na.update();
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
     int numero = e.getKeyCode();
     na.update(numero);    
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

   
    private class Actualizador extends TimerTask {

        @Override
        public void run() {
            repaint();
        }
    }
}
