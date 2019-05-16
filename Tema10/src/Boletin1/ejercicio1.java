/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Luis
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    
      public static Boolean esPrimo(int n) {
    if (n < 2) {
      return false;
    } else {
      for (long i = n / 2; i >= 2; i--) {
        if (n % i == 0) {
          return false;
        }
      }
    }
    return true;
  }
    public static void main(String[] args) {
        
        try{
            
            BufferedWriter f = new BufferedWriter(new FileWriter("primos.dat"));
            
            int n = 0;
            
            for (int i = 0; i < 500; i++) {
                if(esPrimo(i)){
                    f.write(String.valueOf(i)+ "\n");
                }
                
            }
            
            f.close();
            
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        
       
        
    }
    
}
