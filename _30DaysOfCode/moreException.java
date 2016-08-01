/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank._30DaysOfCode;

import java.util.*;
import java.io.*;

/**
 *
 * @author Rahul
 */
class Calculator {

    public int power(int n, int p) {
        if (n >= 0 && p > 0) {
            int x = (int) Math.pow(n, p);
            return x;

        } else {
            throw new IllegalStateException("n and p should be non-negative");
        }

    }
}

public class moreException {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
