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
public class ejercicio127 {

    public static List eliminarRepetidos(List c){
        
        Set pal = new LinkedHashSet(c);
        return new ArrayList(pal);
        
    }
    
    
    public static void main(String[] args) {
      
        
        Scanner S = new Scanner(System.in);
        
        ArrayList<String> lista = new ArrayList<>();
        
        System.out.println("Introduzca nombres(<fin> para acabar)");
        String nom = S.nextLine();
        
        while(!nom.equalsIgnoreCase("fin")){
            lista.add(nom);
            nom = S.nextLine();
        }
        
        System.out.println("\nLista original");
        System.out.println(lista);
        
        System.out.println("\nLista sin repetir");
        lista = (ArrayList<String>) eliminarRepetidos(lista);
        System.out.println(lista);
        
    }
    
}
