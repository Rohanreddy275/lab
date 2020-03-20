
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author srohan
 */
public class paintJobEstimator {
    
    public static void main(String[]args)
        {
                Scanner input=new Scanner(System.in);
                double wallSpace,pricePerGallon;
                int gallonsRequired;
                double costOfPaint,hoursRequired,laborCharge,TotalCost;
                
               
                System.out.print("Enter the wall space to in square feet:");
                wallSpace=input.nextDouble();
                System.out.print("Enter price per gallon of paint:");
                pricePerGallon=input.nextDouble();
                
                
                gallonsRequired=getGallonsRequired(wallSpace);
                costOfPaint=getPaintCost(gallonsRequired,pricePerGallon);
                
                hoursRequired=getHours(wallSpace);
                laborCharge=getLaborCost(hoursRequired);
        
                TotalCost=costOfPaint+laborCharge;
                
                
                System.out.printf("Area to paint:\t%.2f\nPaint per gallon price:\t$%.2f\n",wallSpace,pricePerGallon);
                System.out.printf("Gallons required:\t%d\n", gallonsRequired);
                System.out.printf("Cost of Paint:\t$%.2f\n", costOfPaint);
                System.out.printf("Hours required:\t%.2f\n", hoursRequired);
                System.out.printf("Cost of Labor:\t$%.2f\n\n", laborCharge);
                System.out.printf("Total Charge:\t$%.2f\n", TotalCost);
                
                input.close();
        }
        
        public static int getGallonsRequired(double area){
                return  (int)Math.ceil(area/115.0);
        }
        public static double getPaintCost(int gallons,double gallonCost){
                return gallons*gallonCost;
        }
        public static double getHours(double area){
                return (area*8.0)/115.0;
        }
        public static double getLaborCost(double hours){
                return hours*18.0;
        }
}
