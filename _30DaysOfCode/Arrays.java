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
public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []arr = new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
