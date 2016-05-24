/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Contest.CodeSprint;

import java.util.Scanner;

/**
 *
 * @author Rahul
 */
public class city {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int q =sc.nextInt();
        int []T =new int [n];
        for (int i = 0; i < n; i++) {
            T[i]=sc.nextInt();
        }
        int [][]w=new int [n][n];
        for (int i = 0; i < m; i++) {
            int x =sc.nextInt();
            int y =sc.nextInt();
            int u =sc.nextInt();
            w[x-1][y-1]=u;
            w[y-1][x-1]=u;
        }
        int start = sc.nextInt();
        int finish= sc.nextInt();
        int k= sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(w[i][j]+" ");
            }
            System.out.println("");
        }
//        System.out.println(w.length);
        int track[][] = new int[n][n];
        int []tap = new int [n];
        
    }
    
}
