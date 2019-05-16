/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Luis
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            
        try{ //Abrimos el fichero
            
            BufferedReader f = new BufferedReader(new FileReader("primos.dat"));
            
            String n = " ";
            
            while(n != null){ //mientras no lleguemos al final del fichero
                System.out.println(n + " ");
                n = f.readLine();
                
            }
            
            System.out.println();
            f.close(); //Cerramos el fichero
            
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        
    }
    
}
