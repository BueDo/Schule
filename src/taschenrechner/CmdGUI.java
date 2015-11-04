/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;


import java.util.*;
/**
 *
 * @author Domi
 */
public class CmdGUI {
    
    
    private static final Berechnung add = new Addition();
    private static final Berechnung sub = new Subtraktion();
    private static final Berechnung mult = new Multiplikation();
    private static final Berechnung div = new Division();
    private static String continueOrnot;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Taschenrechner taschenrechner = new Taschenrechner();
        do{
       
        System.out.println("Geben Sie die erste Zahl ein");
        taschenrechner.setZahl1(scan.nextDouble());
        
        System.out.println("Geben Sie die zweite Zahl ein");
        taschenrechner.setZahl2(scan.nextDouble());
        
        System.out.println("Wählen Sie eine Rechenoperation aus(add, sub, mult, div)");
        scan.nextLine();
        String calc = scan.nextLine();
        
        switch (calc){
            
            case "add" : try { taschenrechner.setBerechnung(add); } catch (IllegalArgumentException e){System.out.println(e);}
            
                break;
             
            case "sub" : try { taschenrechner.setBerechnung(sub); } catch (IllegalArgumentException e){System.out.println(e);}
                break;
                
            case "mult" : try { taschenrechner.setBerechnung(mult); } catch (IllegalArgumentException e){System.out.println(e);}
                break;
                
            case "div" : try { taschenrechner.setBerechnung(div); } catch (IllegalArgumentException e){System.out.println(e);}
                break;
                
            case "+" : try { taschenrechner.setBerechnung(add);  } catch (IllegalArgumentException e){System.out.println(e);}
                break;
             
            case "-" : try { taschenrechner.setBerechnung(sub);  } catch (IllegalArgumentException e){System.out.println(e);}
                break;
                
            case "*" : try { taschenrechner.setBerechnung(mult);  } catch (IllegalArgumentException e){System.out.println(e);}
                break;
                
            case "/" : try { taschenrechner.setBerechnung(div);  } catch (IllegalArgumentException e){System.out.println(e);}
                break;
                
            default :  taschenrechner.setBerechnung(add);
                break;
        }
            
        try {
         taschenrechner.berechnen();
        }
        
        catch (ArithmeticException e){
            taschenrechner.setErgebnis(0);
            System.out.println(e);
        }
                
                
                
        System.out.println("Das Ergebnis ist: "+taschenrechner.getErgebnis());
        System.out.println("Wollen Sie eine weitere Berechnung durchführen? j/n");
        continueOrnot = scan.nextLine();
        
       
        
        } while (!continueOrnot.equals("n"));
    }
    
}
