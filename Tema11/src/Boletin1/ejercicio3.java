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
     
        
        try{ //Abrimos los ficheros (de entrada y salida)
            
            BufferedReader f = new BufferedReader(new FileReader("G:\\Usuarios\\Luis\\Documentos\\NetBeansProjects\\Tema_11\\Ficheros\\fichero1.txt"));
            BufferedReader f1 = new BufferedReader(new FileReader("G:\\Usuarios\\Luis\\Documentos\\NetBeansProjects\\Tema_11\\Ficheros\\fichero2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\Usuarios\\Luis\\Documentos\\NetBeansProjects\\Tema_11\\Ficheros\\mezcla.txt"));
            
            
            String f1L = "";
            String f2L = "";
            
            
            while((f1L != null) || (f2L != null)){ //mientras no se llegue al final del fichero
                
                f1L = f.readLine(); //Leemos el fichero 1
                f2L = f1.readLine(); //Leemos el fichero2
                
                    if(f1L != null){ //si el fichero no es nulo se escribe
                       
                        bw.write(f1L+ "\n"); /*escribimos los datos del fichero 1
                                             y luego salta a la siguiente línea*/
                        
                    }
                    
                    
                    if(f2L != null){ //si el fichero no es nulo se escribe
                          bw.write(f2L+ "\n"); /*escribimos los datos del fichero 2
                                             y luego salta a la siguiente línea*/
                        
                    }
            }
            
            //Una vez utilizados los ficheros se cierran
            f.close();
            f1.close();
            bw.close();
            
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
            
    }
    
}
