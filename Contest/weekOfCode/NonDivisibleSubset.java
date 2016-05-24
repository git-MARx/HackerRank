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
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[]=new int[n];
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if ((arr[i]+arr[j])%k!=0) {
                    if (!al.contains(arr[j])) {
                        al.add(arr[j]);
                    }
                    if (!al.contains(arr[i])) {
                        al.add(arr[i]);
                    }
                }
            }
        }
//        System.out.println(al);
//        ArrayList<Integer> b=al;
        for (int i = 0; i < al.size()-1; i++) {
            for (int j =i+1; j < al.size(); j++) {
                if ((al.get(i)+al.get(j))%k==0) {
                    al.remove(j);
//                    b.remove(i);
//                    System.out.println("");
                }
            }
        }
//        System.out.println(al.size()>b.size()?al.size():b.size());
        System.out.println(al.size());
    }
}
