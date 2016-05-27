/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Contest.weekOfCode;

import java.util.*;

/**
 *
 * @author Rahul
 */
public class NonDivisibleSubset {

    

    public static void main(String[] args) {
//		System.setIn(new FileInputStream(System.getProperty("user.home") + "/" + "in.txt"));

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] mod = new int[k];

        for (int i = 0; i < n; i++) {
            mod[a[i] % k] = mod[a[i] % k] + 1;
        }

        int mid = k / 2;
        if (k % 2 == 0) {
            mid = mid - 1;
        }

        int count = 0;
        for (int l = 1; l <= mid; l++) {
            int r = k - l;
            System.out.print(l + " vs " + r);
            if (mod[l] > mod[r]) {
                for (int i = 0; i < n; i++) {
                    if (a[i] % k == l) {
                        count++;
                    }
                }
                System.out.println(" --> " + l);
            } else {
                for (int i = 0; i < n; i++) {
                    if (a[i] % k == r) {
                        count++;
                    }
                }
                System.out.println(" --> " + r);
            }

        }

        if (mod[0] > 0) {
            count++;
        }

        if (k % 2 == 0 && mod[k / 2] > 0) {
            count++;
        }

        System.out.println(count);

    }

}
