/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema_12;

import java.util.Comparator;

/**
 *
 * @author Luis
 */
  public class Decrecientes implements Comparator {

   @Override
   public int compare(Object o1, Object o2){
       return (Integer)o2- (Integer)o1;
   }
    
}
