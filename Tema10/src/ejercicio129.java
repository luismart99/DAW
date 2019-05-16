/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_12;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Luis
 */
public class ejercicio129 {

   
    static Set union(Set conj1, Set conj2) {
        
        Set resultado= new HashSet(conj1); 
        resultado.addAll(conj2);
        return resultado;
}

    public static void main(String[] args) {
       
            
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        
        for (int i = 1; i <= 6; i++) {
           s1.add(i);
            
        }
        
        for (int i = 3; i <= 10; i++) {
           s2.add(i);
            
        }
        
        System.out.println("Conjunto 1: " + s1);
        System.out.println("Conjunto 2: " + s2);
        System.out.println("\nUnion: "+ union(s1,s2));

        
    }
    
}
