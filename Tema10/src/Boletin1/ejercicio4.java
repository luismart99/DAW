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

        try{
            BufferedReader original = new BufferedReader(new FileReader(nFichero));
            BufferedWriter nuevo = new BufferedWriter(new FileWriter("palabras_sort.txt"));
            
            ArrayList<String> a = new ArrayList<>();
            
     
            String pal = "";
            
            while(pal != null){
                
                a.add(pal);
                pal = original.readLine();
                  
                    }
            
            original.close();
            
            a.remove(pal);
            Collections.sort(a);
            
 
                for (String palabras : a) {
                        nuevo.write(palabras);
                        nuevo.newLine();
            
            }
                
             nuevo.close();
            
            
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }

   }
   
}