/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank._30DaysOfCode;

import java.util.Scanner;

/**
 *
 * @author Rahul
 */
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int input = sc.nextInt();
        System.out.println(factorial(input));
    }
    static int factorial(int n){
        if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));   
    }
}
