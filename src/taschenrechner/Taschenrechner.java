/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;

/**
 * 
 * 
 * @author Domi
 */
public class Taschenrechner 

{

    private double zahl1;
    private double zahl2;
    private double ergebnis;
    private Berechnung berechnung;

    
   
   public boolean setZahl1(double zahl){
       zahl1 = zahl;
    return true;
    }
   
   
    public boolean setZahl2(double zahl){
        zahl2 = zahl;
    return true;
    }
            
   
    public boolean setErgebnis(double zahl){
        ergebnis=zahl;
        return true;
    }
            
   
/**
 * 
 * @throws IllegalArgumentException wenn setBerechnung einen NULL Parameter übermittel wird
 * @author Domi
 */
    boolean setBerechnung (Berechnung berechnungsArt){
       if(berechnungsArt==null){
           throw new IllegalArgumentException("Fehler!");
       }
       else {
        berechnung =berechnungsArt;
        return true;
       }
    }
    
    String getBerechnung(){
        
        return berechnung.toString();
    }
    
    
    double getZahl1(){
        return zahl1;
    }
            
            
    
    double getZahl2(){
        return zahl2;
    }
 
    
    double getErgebnis(){
        return ergebnis;
    }
    
          
    void berechnen(){
        
        setErgebnis(
                berechnung.berechnen(getZahl1(), getZahl2())
        );
        
    }
    
    
}
