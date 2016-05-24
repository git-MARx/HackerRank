/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Contest.CodeSprint;

import java.util.*;

/**
 *
 * @author Rahul
 */
public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        boolean c= true;
        int[] intArray = new int[s.length()];

        int strLength = s.length();

        for (int i = 0; i < n; i++) {
            if (!Character.isDigit(s.charAt(i))) {
                System.out.println("Contains an invalid digit");
                break;
            }
            intArray[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        int []arr =new int[n/2];
        for (int i = 0; i < n/2; i++) {
            arr[i]=intArray[n-i-1];
        }
        int cnt=0;
        for (int i = 0; i < n/2; i++) {
            if (arr[i]!=intArray[i]) {
                cnt++;
            }
        }
        if (k<cnt) {
            System.out.println("-1");
            c=false;
        }
        else if (k==cnt) {
            for (int i = 0; i < n/2; i++) {
                if (arr[i]>intArray[i]) {
                    intArray[i]=arr[i];
                }
                else if (arr[i]<intArray[i]) {
                    intArray[n-i-1]=intArray[i];
                }
            }
        }
        else if (k>cnt && k<n) {
            int diff = k-cnt;
            for (int i = 0; i < n/2; i++) {
                if (diff%2==1) {
                    if (intArray[i]!=9 && diff >0) {
                    intArray[i]=9;
                    
                }
                }
                else if (diff%2==0) {
                    if (intArray[i]!=9 && diff >0 && intArray[i]!=arr[i]) {
                    intArray[i]=9;
                    
                }
                }
                diff--;
            }
//            System.out.println(diff+"-------");
            for (int i = 0; i < n/2; i++) {
                if (arr[i]>intArray[i]) {
                    intArray[i]=arr[i];
                }
                else if (arr[i]<intArray[i]) {
                    intArray[n-i-1]=intArray[i];
                }
            }
            
        }
        else if (k>=n) {
            for (int i = 0; i < n; i++) {
                intArray[i]=9;
            }
        }
        
        if (c) {
            for (int i = 0; i < n; i++) {
            System.out.print(intArray[i]);
        }
        }
    }

}
