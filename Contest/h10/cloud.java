/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Contest.h10;

import java.util.Scanner;

/**
 *
 * @author Rahul
 */
public class cloud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ar [] =new int [n];
         ar[0]=5;
         int first = sc.nextInt();
        for (int i = 1; i < n; i++) {
            ar[i]=sc.nextInt();
        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(ar[i]);
//        }
        int cnt = 0,x=0;
        boolean c = true;
        while  (c){
//            System.out.println("--"+ar[x]);
            if (ar[x]==0||ar[x]==5) {
                x=(x+k)%n;
                cnt++;
//                System.out.println("enter0 "+x);
            }
            else if (ar[x]==1){
                x=(x+k)%n;
                cnt=cnt+3;
//                System.out.println("enter1 "+x);
            }
            if (ar[x]==5) {
                c=false;
            }
        }
        if (first==1) {
            cnt=cnt+2;
        }
        System.out.println(100-cnt);
        
        
    }
}
