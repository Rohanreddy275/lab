/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author srohan
 */
public class evenOdd {
    
      public static void main (String [] args){
        int r = 0;
        int k = 0;
        int iseven = 0;
        int isodd =0;
        System.out.println("Loop running" + " even" + " odd");
        

        for (r = 1; r <= 10; r++){

           for (int j = 1; j <= 10; j++){
           int n = (int)(Math.random() * 1000 + 1);

            int even = isEven(n);
               if (even == 1){
            iseven++;

               }
               else
            isodd++;

            }
               System.out.println(r + " " + iseven + " " + isodd);

            }
        
           }
           public static int isEven(int number){
                if ((number % 2) == 0)
                   return 1;
                else
                   return 2;
                   }
   
}
