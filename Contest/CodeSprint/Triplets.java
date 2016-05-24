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
public class Triplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []a = new int[3];
        int []b = new int[3];
        a[0] = in.nextInt();
        a[1] = in.nextInt();
        a[2] = in.nextInt();
        b[0] = in.nextInt();
        b[1] = in.nextInt();
        b[2] = in.nextInt();
        int bob=0 ,alice=0;
        for (int i = 0; i < 3; i++) {
            if (a[i]<b[i]) {
                bob++;
            }
            else if (a[i]>b[i]) {
                alice++;
            }
            
        }
        System.out.println(alice+"  "+bob);
    }
}
