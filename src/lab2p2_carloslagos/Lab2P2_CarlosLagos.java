/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_carloslagos;

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
    public static void main(String[] args) {
        
        Scanner lea = new Scanner(System.in);
        Random r = new Random();
        
        boolean centinela = true;
        
        while(centinela == true){
            
            System.out.println("Laboratorio 2");
            System.out.println("--------------");
            System.out.println("1) Agregar Jugador");
            System.out.println("2) Bot");
            System.out.println("3) Agregar Item a Jugador");
            System.out.println("4) Jugar");
            System.out.println("5) Salir");
            int opcion = lea.nextInt();
            
            switch(opcion){
                case 1:{
                    
                }//fin caso 1
                break;
                
                case 2:{
                    
                }//fin caso 2
                break;
                
                case 3:{
                    
                }//fin caso 3
                break;
                
                case 4:{
                    
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
    
}//fin clase
