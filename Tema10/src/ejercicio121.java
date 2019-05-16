/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_12;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Luis
 */
public class ejercicio121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> n = new ArrayList();
        
        int num;
        
        for (int i = 0; i < 20; i++) {
            
            num = (int) (Math.random()*100);
            n.add(num);
        }
        
        System.out.println("Lista de numeros");
        System.out.println(n);
        
        Collections.sort(n);
        
        System.out.println("Lista en orden creciente");
        System.out.println(n);
    }
    
}
