/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_carloslagos;

import java.util.ArrayList;

/**
 *
 * @author clago
 */
public class Jugadores {
    
    private String nombre;
    private char caracter;
    private int numvictorias;
    private int dinero;
    private ArrayList<String> items = new ArrayList();
    
    public Jugadores(){
        
    }
    public Jugadores(String nombre, char caracter, int numvictorias, int dinero){
        this.nombre = nombre;
        this.caracter = caracter;
        this.numvictorias = numvictorias;
        this.dinero = dinero;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCaracter(char caracter){
        this.caracter = caracter;
    }
    public char getCaracter(){
        return caracter;
    }
    public void setNumVictorias(int numvictorias){
        this.numvictorias = numvictorias;
    }
    public int getNumVictorias(){
        return numvictorias;
    }
    public void setDinero(int dinero){
        this.dinero = dinero;
    }
    public int getDinero(){
        return dinero;
    }
    public void setItems(ArrayList<String> items){
        this.items = items;
    }
    public ArrayList<String> getItems(){
        return items;
    }
    
    
}//fin clase
