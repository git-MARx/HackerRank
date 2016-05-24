/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Contest.weekOfCode;

import java.util.Scanner;

/**
 *
 * @author Rahul
 */
public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[]=new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int cnt=0;  
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if ((arr[i]+arr[j])%k==0) {
                    cnt++;
//                    System.out.println("i="+i+" j="+j);
//                    System.out.println(arr[i]+"+"+arr[j]);
                }
            }
        }
        System.out.println(cnt);
    }
}
