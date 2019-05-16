/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_12;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Luis
 */
public class ejercicio126 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner S = new Scanner(System.in);
        
        Set<String> nombres = new TreeSet<>();
        
        System.out.println("Introduzca nombres(<fin> para acabar)");
        String nom = S.nextLine();
        
        while(!nom.equalsIgnoreCase("fin")){
            nombres.add(nom);
            nom = S.nextLine();
        }
        
        System.out.println("Los nombres ordenados alfabéticamente sin repetir:"+nombres);
        
    }
    
}
