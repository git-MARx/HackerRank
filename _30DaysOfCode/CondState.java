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
public class CondState {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{
         // Complete the code
          if (n%2==0&&n>=2&&n<5) {
              System.out.println("Not Weird");
          }
          else if (n%2==0&&n>=6&&n<=20) {
              System.out.println("Weird");
          }
          else if (n%2==0&&n>=20) {
              System.out.println("Not Weird");
          }
      }
      System.out.println(ans);
   }
}
