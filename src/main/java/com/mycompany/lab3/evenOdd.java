/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author satyanagasaitejaadabala
 */
public class evenOdd {
    
    public static void main(String[] args) {
       
        int number;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number ");
        number = scn.nextInt();
        
        if ((number %2) == 0) 
            System.out.print("Enter Number is EVEN ");
         else 
            System.out.print("Enter Number is ODD ");

    }
    
}
