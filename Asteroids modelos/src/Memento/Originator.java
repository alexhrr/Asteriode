
package Memento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Originator {
 
    private Partida estado;
    File f;
    FileWriter fw;
    BufferedWriter bw;
    PrintWriter pw;
    FileReader fr;
    BufferedReader br;
    
    public void setEstado(Partida estado){
        this.estado = estado;
    }
    
    public Partida getEstado(){
        return estado;
    }
   
    public Memento Guardar(){
        
        return new Memento(estado);
    }
    
    public void Restaurar(Memento m){
        estado = m.getSaved();
        System.out.println(estado.getNick());
        System.out.println(estado.getPuntaje());
        System.out.println(estado.getCoins());
    }
}

