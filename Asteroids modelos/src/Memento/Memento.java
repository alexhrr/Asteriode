
package Memento;

public class Memento {
    
    private Partida estado;
    
    public Memento(Partida estado){
        this.estado = estado;
    }
    
    public Partida getSaved(){
        return estado;
    }
}
