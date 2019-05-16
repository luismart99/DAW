/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_12;

import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class ejercicio124 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        ArrayList<Integer> l = new ArrayList<>();
        
        int num;
        
        l.add((int) (Math.random()*10)); //inserta el primer número aleatorio
        
        for (int i = 1; i < 20; i++) {
           
            num = (int) (Math.random()*10); //generamos el número
            
            int n = 0;
            
            while(n < i && num < l.get(n)){
                n++;
            }
            
            l.add(n, num);
            
        }
        System.out.println("Números aleatorios en ordn decreciente: "+l);
        
    }
    
}
