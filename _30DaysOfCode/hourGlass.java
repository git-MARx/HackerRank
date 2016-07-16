/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank._30DaysOfCode;

import java.util.*;

/**
 *
 * @author Rahul
 */
public class hourGlass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int count=0,max=-99999;
        int arsum[] = new int[16];
        for (int i = 2; i < 6; i++) {
            for (int j = 2; j < 6; j++) {
                arsum[count]=arr[i-2][j-2]+arr[i-2][j-1]+arr[i-2][j]+arr[i-1][j-1]+arr[i][j-2]+arr[i][j-1]+arr[i][j];
                count++;
            }
        }
        for (int i = 0; i < 16; i++) {
            if (arsum[i]>max) {
                max=arsum[i];
            }
        }
        System.out.println(max);
    }
}
