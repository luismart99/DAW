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
public class ejercicio122 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
        ArrayList<Integer> n = new ArrayList<>();
        
        int temp;
        
        for (int i = 0; i < 19; i++) {
            
            temp = (int) (Math.random()*100);
            n.add(temp);
        }
        
        System.out.println("Números generados");
        System.out.println(n);
        
       
       Decrecientes comp = new Decrecientes();
        
       Collections.sort(n, comp);
       
        System.out.println("Números ordenados de forma decreciente");
        System.out.println(n);
    }
    
}
