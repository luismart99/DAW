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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        try{
            
            BufferedReader f = new BufferedReader(new FileReader("C:\\Users\\Luis\\Documents\\NetBeansProjects\\Tema11\\Ficheros\\fichero1.txt"));
            BufferedReader f1 = new BufferedReader(new FileReader("C:\\Users\\Luis\\Documents\\NetBeansProjects\\Tema11\\Ficheros\\fichero2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Luis\\Documents\\NetBeansProjects\\Tema11\\Ficheros\\mezcla.txt"));
            
            
            String f1L = "";
            String f2L = "";
            
            
            while((f1L != null) || (f2L != null)){
                
                f1L = f.readLine();
                f2L = f1.readLine();
                
                    if(f1L != null){
                       
                        bw.write(f1L+ "\n");
                        
                    }
                    
                    
                    if(f2L != null){
                          bw.write(f2L+ "\n");
                        
                    }
            }
            
            
            f.close();
            f1.close();
            bw.close();
            
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
            
    }
    
}
