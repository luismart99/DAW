/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletín2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);
       
        int opcion = 0;
        String palabra = " ";
        
        ArrayList<String> a = new ArrayList<>();
        
        do{
            
            try{
                
            BufferedWriter fw = new BufferedWriter(new FileWriter("diccionario.dat"));
            
            System.out.println("DICCIONARIO");
            System.out.println("==========");
            System.out.println("1. Consultar");
            System.out.println("2. Añadir palabras");
            System.out.println("3. Volcar palabras");
            System.out.println("4. Salir");
            opcion = S.nextInt();
            
            switch(opcion){
                
                case 1:
                    
                    try{
                        BufferedReader fr = new BufferedReader(new FileReader("diccionario.dat"));
                        
                        
                        while((palabra = fr.readLine())!=null) {
                                System.out.println(palabra);
                            }
                            fr.close();
                        
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    } catch (IOException e){
                        System.out.println(e.getMessage());
                    }
                    
                    
                    break;
                    
                    
                case 2:
            
                    try{
                             
                        BufferedWriter fw1 = new BufferedWriter(new FileWriter("diccionario.dat"));
                 
                        System.out.println("Introduzca la palabra ha añadir");
                        palabra = S.nextLine();
                        while(palabra != null){ //mientras no lleguemos al final fichero

                            a.add(palabra); //Lo añadimos al ArrayList
                            palabra = fw1.readLine();
                        }
                        
                        fw1.close();
                    } catch(IOException e) {
                        System.out.println(e.getMessage());
                    }
            
                    
                    
                    break;
                    
                    
                case 3:
                    
                    
                    break;
                
                case 4:
                    break;
                default:
                    
                
            }

                } catch(IOException e) {
                    System.out.println(e.getMessage());

            }
        }while(opcion != 4);
        
        
    }
    
}
