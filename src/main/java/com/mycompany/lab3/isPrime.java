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
public class isPrime {
    
    public static void main(String[] args) {
        
        int number;
        String inputNumber;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number ");
        inputNumber = scn.nextLine();
        
        number = Integer.parseInt(inputNumber);
        
        if(isPrime(number))
            System.out.println(number  +"   True");
        else
            System.out.println(number  +"   False");
     
    }
    
    public static boolean isPrime(int num){
    
        int count = 0;
        for(int i =2; i<num/2;i++){
            
            if(num%i==0)
                count++;
        }
        
        if(count > 0)
            return false;
        else
            return true;
    }
}
