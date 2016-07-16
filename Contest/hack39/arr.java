/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Contest.hack39;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rahul
 */
public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int ar[] = new int [n];
        int []ma = new int [n];
        for (int i = 0; i < n; i++) {
            ar[i]=sc.nextInt();
            ma[i]= -1;
        }
        Arrays.sort(ar);
        
        int max =1;
        for (int i = 0; i < n-1; i++) {
            
            if (ar[i]!=ar[i+1]) {
                
                max=1;
//                System.out.println(" - "+max);
            }
            else
            {max++;
//                System.out.println("+ " + max);
                ma[i]= max;}
        }
        Arrays.sort(ma);
        if (ma[n-1]==-1) {
            System.out.println(n-1);
        }
        else{
            System.out.println(n-ma[n-1]);
        }
//        System.out.printlnA(n-max);
        
//        for (int i = 0; i < n; i++) {
//            System.out.println(ma[i]);
//        }
        
        
        
        
        
        
    }
}
