/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Contest.weekOfCode7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rahul
 */
public class luck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0,sum=0;
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            if (arr[i][1] == 1) {
                cnt++;
            }
            sum = sum+arr[i][0];
        }
        int j = 0;
        int ar1[][] = new int[cnt][2];
        for (int i = 0; i < n; i++) {
            if (arr[i][1] == 1) {
                ar1[j][0] = arr[i][0];
                ar1[j][1] = arr[i][1];
                j++;
            }
        }
        int left = cnt - k;

        
        java.util.Arrays.sort(ar1, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return (a[0] < b[0] ? -1 : (a[0] == b[0] ? 0 : 1));
            }
        });
//        for (int i = 0; i < cnt; i++) {
//            System.out.println(ar1[i][0]+"   "+ar1[i][1]);
//        }
//        System.out.println(sum);
        for (int i = 0; i < left; i++) {
            sum= sum-(2*ar1[i][0]);
        }
        System.out.println(sum);
    }
}
