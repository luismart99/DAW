/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Luis
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        try{
            BufferedReader f = new BufferedReader(new FileReader("hola.java")); //Programa original
            BufferedWriter bw = new BufferedWriter(new FileWriter("holav2.java")); //Programa limpio
            
            
            String lineaf = "";
            String lineabw = "";
            
            while((lineaf = f.readLine()) != null){
                
                lineaf = f.readLine();
                
               
                
            }
            
            f.close();
            bw.close();
            
        } catch(IOException ieo){
            System.out.println(ieo.getMessage());
        }
    }
    
}
