/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_12;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Luis
 */
public class ejercicio128 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner S= new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase= S.nextLine(); 
        String palabras[] = frase.split(" "); 
        
        
        List<String> listaPalabras = new ArrayList<>(); 
        
        for (String p : palabras) {
           listaPalabras.add(p);
            }
           
        
        Set<String> palabrasRepe = new LinkedHashSet<>(); 
        
        List<String> aux = new ArrayList<>(listaPalabras);
        
        
        aux.removeAll(palabrasRepe); 
        
        System.out.print("\nPalabras no repetidas:\n" + aux+"\n");
    }
}