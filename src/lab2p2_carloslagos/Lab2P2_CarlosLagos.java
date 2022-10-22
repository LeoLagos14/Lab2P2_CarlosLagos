/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_carloslagos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author clago
 */
public class Lab2P2_CarlosLagos {

    /**
     * @param args the command line arguments
     */
    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();
    static ArrayList players = new ArrayList();
    static ArrayList botslist = new ArrayList();
    
    public static void main(String[] args) {
        
       
        
        boolean centinela = true;
        
        while(centinela == true){
            
            System.out.println("Laboratorio 2");
            System.out.println("--------------");
            System.out.println("1) Agregar Jugador");
            System.out.println("2) Crear Bot");
            System.out.println("3) Agregar Item a Jugador");
            System.out.println("4) Jugar");
            System.out.println("5) Salir");
            int opcion = lea.nextInt();
            
            switch(opcion){
                case 1:{
                    System.out.println("Jugadores");
                    System.out.println("Ingrese el nombre del jugador que quiere agregar: ");
                    String nombre = lea.next();
                    System.out.println("Ingrese el caracter para representar su jugador(minusculas): ");
                    char caracter = lea.next().charAt(0);
                    int numvictorias = 0;
                    int dinero = 0;
                    
                    for (int i = 0; i < players.size(); i++) {
                        while(players.contains(caracter)){
                        System.out.println("Este caracter no esta disponible");
                        System.out.println("Ingrese un caracter nuevo: ");
                        caracter = lea.next().charAt(0);
                        }
                    }
                    
                    
                    players.add(new Jugadores(nombre, caracter, numvictorias, dinero));
                    
                }//fin caso 1
                break;
                
                case 2:{
                    System.out.println("BOTS");
                    System.out.println("Ingrese la velocidad: ");
                    int velocidad = lea.nextInt();
                    System.out.println("Ingrese el caracter que representa el bot(minusculas): ");
                    char caracterb = lea.next().charAt(0);
                    System.out.println("Ingrese su aspecto: ");
                    String aspecto = lea.next();
                    String audio;
                    System.out.println("Ingrese el audio: ");
                    lea.nextLine();
                    audio = lea.nextLine();
                    String audiopostmortem = "POST MORTEM!!!";
                    
                    botslist.add(new Bots(velocidad, caracterb, aspecto, audio, audiopostmortem));
                    
                    
                }//fin caso 2
                break;
                
                case 3:{
                    System.out.println("Items");
                    AItems(players);
                    
                }//fin caso 3
                break;
                
                case 4:{
                    Object[][] tablero = new Object[30][30];
                    tablero = LlenaTablero();
                    ImprimeTablero(tablero);
                }//fin caso 4
                break;
                
                case 5:{
                    centinela = false;
                }//fin 5
                break;
                default:
            }//fin switch
            
            
        }//fin while
        
    }//fin main
    
    public static void JugadoresPredeterminado(){
       
        players.add(new Jugadores("Juanito",'j', 0, 0));
        players.add(new Jugadores("Pedrito",'p', 0, 0));
        players.add(new Jugadores("Manuelito",'m', 0, 0));
        players.add(new Jugadores("Carmelito",'c', 0, 0));
    }
    public static void AItems(ArrayList players){
        System.out.println("Ingrese la posicion: ");
        int posicion = lea.nextInt();
        
        if (posicion > players.size()) {
            System.out.println("Esta opcion no esta disponible");
        }else{
            System.out.println("Los Items que se pueden comprar son: ");
            System.out.println("Cola -> 60 monedas");
            System.out.println("Acelerador -> 30 monedas");
            System.out.println("Mina -> 45 monedas");
            System.out.println("Iluminador -> 45 monedas");
            System.out.println("Detector -> 30 monedas");
            System.out.println("Cual desea comprar: ");
            int opcion2 = lea.nextInt();
            
            if(posicion == 1){
                    if (((Jugadores)players.get(posicion)).getDinero()>= 60) {
                        
                        ((Jugadores)players.get(posicion)).items.add("Cola");
                        ((Jugadores)players.get(posicion)).setDinero(((Jugadores)players.get(posicion)).getDinero()- 60);
                        
                        
                    }else{
                        System.out.println("NO tiene dinero para comprarlo");
                    }
                   
                }else if(posicion == 2){
                    if (((Jugadores)players.get(posicion)).getDinero()>= 30) {
                        
                        ((Jugadores)players.get(posicion)).items.add("Acelerador");
                        ((Jugadores)players.get(posicion)).setDinero(((Jugadores)players.get(posicion)).getDinero()- 30);
                        
                        
                    }else{
                        System.out.println("NO tiene dinero para comprarlo");
                    }
                
                }else if(posicion == 3){
                     if (((Jugadores)players.get(posicion)).getDinero()>= 45) {
                        
                        ((Jugadores)players.get(posicion)).items.add("Mina");
                        ((Jugadores)players.get(posicion)).setDinero(((Jugadores)players.get(posicion)).getDinero()- 45);
                        
                        
                    }else{
                        System.out.println("NO tiene dinero para comprarlo");
                    }
                }else if(posicion == 4){
                     if (((Jugadores)players.get(posicion)).getDinero()>= 45) {
                        
                        ((Jugadores)players.get(posicion)).items.add("Iluminador");
                        ((Jugadores)players.get(posicion)).setDinero(((Jugadores)players.get(posicion)).getDinero()- 45);
                        
                        
                    }else{
                        System.out.println("NO tiene dinero para comprarlo");
                    }
                }else if(posicion == 5){
                     if (((Jugadores)players.get(posicion)).getDinero()>= 30) {
                        
                        ((Jugadores)players.get(posicion)).items.add("Detector");
                        ((Jugadores)players.get(posicion)).setDinero(((Jugadores)players.get(posicion)).getDinero()- 30);
                        
                        
                    }else{
                        System.out.println("NO tiene dinero para comprarlo");
                    }
                }else{
                    
                    System.out.println("Solo hay espacio para 5 items");
                }
            
        }
    }
    public static Object[][]LlenaTablero(){
        Object [][]tablerot = new Object [30][30];
        
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                
            }
        }
        return tablerot;
    }
    public static void ImprimeTablero(Object [][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("["+tablero[i][j]+"] ");
            }
            System.out.println();
        }
    }
}//fin clase 
