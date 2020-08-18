
package Memento;

public class Partida{
    
    private int puntaje,coins;
    private String nick;
    
    public void setPuntaje(int p){
        puntaje = p;
    }
    
    public void setCoins(int c){
        coins = c;
    }
    
    public void setNick(String n){
        nick = n;
    }
    
    public int getPuntaje(){
        return puntaje;
    }
    
    public int getCoins(){
        return coins;
    }
    
    public String getNick(){
        return nick;
    }
    
    public String toString(int valor){
        String cadena = Integer.toString(valor);
        return cadena;
    }
}
