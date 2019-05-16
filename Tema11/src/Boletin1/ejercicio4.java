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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner S = new Scanner(System.in);
        
        System.out.println("Introduzca el nombre del fichero");
        String nFichero = S.nextLine();

        try{ //Abrimos los ficheros (de entrada y salida)
            BufferedReader original = new BufferedReader(new FileReader(nFichero));
            BufferedWriter nuevo = new BufferedWriter(new FileWriter("palabras_sort.txt"));
            
            ArrayList<String> a = new ArrayList<>();
            
     
            String pal = "";
            
            while(pal != null){ //mientras no lleguemos al final fichero
                
                a.add(pal); //Lo añadimos al ArrayList
                pal = original.readLine(); //Leemos el fichero original
                
                    }
            
            original.close(); //Cerramos el archivo original
            
            a.remove(pal); //Lo borramos del ArrayList
            Collections.sort(a); //Ordena las palabras por ordén alfabético
            
              
                for (String palabras : a) {   //Recorre el ArrayList
                        nuevo.write(palabras); //escribe las palabras del fichero original
                        nuevo.newLine();/*y cada vez que escribe una palabra salta a la 
                                        siguiente línea*/
            
                }
             
             nuevo.close(); //Cerramos el archivo que se ha creado
            
            
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }

   }
   
}