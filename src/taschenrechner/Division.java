/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;

/**
 * 
 * @author Domi
 */
public class Division  implements Berechnung{
    
    /**
     * 
     * @param a erste Zahl
     * @param b zweite Zahl
     * @return Ergebnis
     * @throws ArithmeticException bei der Division durch Null
     */
    
    @Override
    public double berechnen (double a, double b){
        if(b==0){
            
            throw new ArithmeticException("Das dividieren durch 0 ist nicht erlaubt!"); 
            
        }
        
        else {
        return a/b;
        }
    }
    
}
