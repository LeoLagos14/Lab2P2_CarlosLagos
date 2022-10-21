/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_carloslagos;

/**
 *
 * @author clago
 */
public class Bots {
    
    private int velocidades;
    private char caracterb;
    private String aspectos;
    private String audios;
    private String audiopostmortem;
    
    public Bots(){
        
    }
    public Bots(int velocidades, char caracterb, String aspectos, String audios, String audiopostmortem){
        
        this.velocidades = velocidades;
        this.caracterb = caracterb;
        this.aspectos = aspectos;
        this.audios = audios;
        this.audiopostmortem = audiopostmortem;
        
    }
    public void setVelocidades(int velocidades){
        this.velocidades = velocidades;
    }
    public int getVelocidades(){
        return velocidades;
    }
    public void setCaracterb(char caracterb){
        this.caracterb = caracterb;
    }
    public char getCaracterb(){
        return caracterb;
    }
    public void setAspectos(String aspectos){
        this.aspectos = aspectos;
    }
    public String getAspectos(){
        return aspectos;
    }
    public void setAudios(String audios){
        this.audios =  audios;
    }
    public String getAudios(){
        return audios;
    }
    public void setAudiopostmortem(String audiopostmortem){
        this.audiopostmortem = audiopostmortem;
    }
    public String getAudiopostmortem(){
        return audiopostmortem;
    }
}
    
