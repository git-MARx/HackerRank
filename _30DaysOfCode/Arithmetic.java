/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank._30DaysOfCode;

/**
 *
 * @author Rahul
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double meal = scan.nextDouble(); // original meal price
        double tip = scan.nextDouble(); // tip percentage
        double tax = scan.nextDouble(); // tax percentage
        
      
        // Write your calculation code here.
        double x = meal*(tip/100)+meal*(tax/100)+meal;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(x);
        System.out.print("The total meal cost is "+totalCost+" dollars.");
        // Print your result
    }
}