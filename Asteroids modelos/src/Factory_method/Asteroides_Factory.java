/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_method;

import java.awt.Image;
import java.util.Random;

/**
 *
 * @author Temporar
 */
public class Asteroides_Factory implements AsteroideFactorymethod {
    
    Random r = new Random();
    int voto;
    @Override
    public Asteroide CrearAsteroide(int puntaje) {
        if (puntaje >100 && puntaje<2000){
            voto= r.nextInt(1);
            if(voto==0){
               return new Asteroide_pequeño(r.nextInt(4)+1, 1+ r.nextInt(10), 1000,10+r.nextInt(480), r.nextInt(360)); 
            }
            else{
                return new Asteroide_Grande(r.nextInt(10)+5, 3+ r.nextInt(15), 1000,10+r.nextInt(480), r.nextInt(360));
            }
        }
        else if(puntaje > 2000){
            return new Asteroide_Grande(r.nextInt(10)+5, 3+ r.nextInt(15), 1000,10+r.nextInt(480), r.nextInt(360));
        }
        else{
            return new Asteroide_pequeño(r.nextInt(4)+1, 1+ r.nextInt(10), 1000,10+r.nextInt(480), r.nextInt(360)); 
        }
    }
    
}
