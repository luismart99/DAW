/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        try{
            
            BufferedReader f = new BufferedReader(new FileReader("sevilla.txt"));
            
            String palabra = "ciudad";
            String linea = "";
            int contador = 0;
            int n = 0;
            boolean encontrado = false;
            
            while((linea = f.readLine()) !=null){
                
                 while ((n = linea.indexOf(palabra)) != -1) {
                    linea = linea.substring(n + palabra.length(), linea.length());
                    contador++;
                }
            }
            
            f.close();
            
            System.out.println("La palabra "+palabra+" se repite "+ contador +" veces.");
            
        }catch(IOException ieo){
            System.out.println(ieo.getMessage());
            
            
        }
    }
    
}
