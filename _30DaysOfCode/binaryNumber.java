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
public class binaryNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String res = d_TO_b(n);
        System.out.println(res);
        System.out.println(checkConsecutive(res));
    }

    static String d_TO_b(int n) {
        String res = "";
        while (n != 0) {
            res = n % 2 + res;
            n = n / 2;
        }
        return res;
    }
    static int checkConsecutive(String res){
        int count=1,max=1;
        for (int i = 1; i < res.length(); i++) {
            if (res.charAt(i)=='1') {
//                System.out.println("yes");
                if (res.charAt(i)==res.charAt(i-1)) {
                    count++;
                }
                else {
                    if (count > max) {
                        max = count;
                    }
                    count = 1;
                }
            }
        }
        if (count>max) {
            return count;
        }
        else{
            return max;
        }
    }
}
