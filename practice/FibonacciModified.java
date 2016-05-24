/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.practice;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Rahul
 */
public class FibonacciModified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a =sc.nextBigInteger();
        BigInteger b =sc.nextBigInteger();
        int n =sc.nextInt();
        BigInteger c = null;
        for (int i = 0; i < n-2; i++) {
//            System.out.println("b="+b+"a="+a);
            c=(b.multiply(b)).add(a);
            a=b;
            b=c;
            
        }
        System.out.println(c);
    }
    
}
