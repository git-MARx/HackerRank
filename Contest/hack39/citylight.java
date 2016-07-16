/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Contest.hack39;

import java.util.Scanner;

/**
 *
 * @author Rahul
 */
public class citylight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        lngSq(c, k, n);

    }

    public static void lngSq(int[] a, int k, int n) {
        int count = 1, max = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] == 0) {
                if (a[i] == a[i - 1]) {
                    count++;
                } else {
                    if (count > max) {
                        max = count;
                    }
                    count = 1;
                }
            }
        }
        int x = 0;
        if (count > max) {
            x = count;
        } else {
            x = max;
        }
        if (x > (2 * (k - 1))) {
            System.out.println("-1");
        } else {
            int coun = 0;
            for (int i = k - 1; i < n; i = i + (2 * k - 1)) {
                int ch = 1;

                if (a[i] == 0) {

                    for (int j = i - 1; j >= i - 2 * k; j--) {
                        if (j < 0) {
                            break;
                        }
                        if (j >= 0 && a[j] == 1) {
                            i = j;
                            ch = 1;
                            //        System.out.println("in:  "+i);
                            break;
                        } else {
                            ch = 0;
                        }
                    }
                }
                coun++;
                if (ch == 0) {
                    System.out.println("-1");
                    return;

                }
                if (i + 1 < n && i + 2 * k - 1 >= n && i + k < n) {
                    coun++;
                }
                //      System.out.println(c[i]+" : "+i);
            }
            System.out.println(coun);
        }
    }
}
//
//import java.io.*;
//import java.util.*;
//
//public class citylight {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int c[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            c[i] = sc.nextInt();
//        }
//        int count = 0;
//        for (int i = k - 1; i < n; i = i + (2 * k - 1)) {
//            int ch = 1;
//
//            if (c[i] == 0) {
//
//                for (int j = i - 1; j >= i - 2 * k; j--) {
//                    if (j < 0) {
//                        break;
//                    }
//                    if (j >= 0 && c[j] == 1) {
//                        i = j;
//                        ch = 1;
//                        //        System.out.println("in:  "+i);
//                        break;
//                    } else {
//                        ch = 0;
//                    }
//                }
//            }
//            count++;
//            if (ch == 0) {
//                System.out.println("-1");
//                return;
//
//            }
//            if (i + 1 < n && i + 2 * k - 1 >= n && i + k < n) {
//                count++;
//            }
//            //      System.out.println(c[i]+" : "+i);
//        }
//        System.out.println(count);
//    }
//}
