/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;


import java.util.*;

import java.sql.*;
/**
 *
 * @author Domi
 */
public class CmdGUI {
        
    private static Taschenrechner taschenrechner = new Taschenrechner();
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
        //Taschenrechner taschenrechner = new Taschenrechner();
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
         dbAction();
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
    
    
    private static void dbAction(){
       
       // "Vorlage aus dem Internet -> angepasst 
        try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}

	System.out.println("MySQL JDBC Driver Registered!");
	Connection connection = null;

	try {
		connection = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/db_javacalctest","root", "");

	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		return;
	}

	if (connection != null) {
		//System.out.println("You made it, take control your database now!");
            
        try {    
            Statement stm1 = connection.createStatement();
            System.out.println("INSERT INTO tbl_berechnungen (ersteZahl, zweiteZahl, Berechnung) VALUES ("+taschenrechner.getZahl1()+", "+taschenrechner.getZahl2()+", '"+taschenrechner.getBerechnung()+"')");
            stm1.executeUpdate("INSERT INTO tbl_berechnungen (ersteZahl, zweiteZahl, Berechnung) VALUES ("+taschenrechner.getZahl1()+", "+taschenrechner.getZahl2()+", '"+taschenrechner.getBerechnung()+"')");
            
            
            //TODO
            Statement stm2 =connection.createStatement();
            stm2.executeQuery("");//Abfrage Anzahl
            
            Statement stm3 =connection.createStatement();
            stm3.executeQuery("");//Abfrage Anzahl Addition
            
            Statement stm4 =connection.createStatement();
            stm4.executeQuery("");//Abfrage Anzahl Subtraktion
            
            Statement stm5 =connection.createStatement();
            stm5.executeQuery("");//Abfrage Anzahl Division
            
            Statement stm6 =connection.createStatement();
            stm6.executeQuery("");//Abfrage Anzahl Multiplikation
            
            
            
        } catch (SQLException ex){
            
            System.out.println("Folgender Fehler ist aufgetreten: "+ex);
        }
            
            
	} else {
		System.out.println("Failed to make connection!");
	}
   
    
    }
}
