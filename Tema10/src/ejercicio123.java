/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_12;


import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Luis
 */
public class ejercicio123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Set<Integer> num = new TreeSet<>(new Decrecientes());
    
        
        while(num.size()< 20){ //Mientras no existan 20 distintos en la colección
            Integer temp = (int) (Math.random()*100); //generamos un entero entre 0 y 99
            num.add(temp); //lo insertamos en conjunto
        }
        
        System.out.println("Números aleatorios insertados en orden decreciente");
        System.out.println(num);
        
    }
    
}
