/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_12;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author Luis
 */
public class ejercicio125 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner S = new Scanner(System.in);
        
        Set<String> nombres = new TreeSet<>();
        
        System.out.println("Introduce palabras('fin' para acabar)");
        String p = S.nextLine();
        
        while(!p.equalsIgnoreCase("fin")){
            nombres.add(p);
            p = S.nextLine();
        }
        
        System.out.println("Las lista de palabas sin repetir son: "+nombres);
        
    }
    
}
