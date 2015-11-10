/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;

/**
 * So mal ein Test für Git
 * @author Domi
 */
public class Addition implements Berechnung{
    
    @Override
    public double berechnen (double a, double b){
        return a+b;
    }
}
