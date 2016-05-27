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
public class DicMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Map<String,Integer> set = new HashMap<String,Integer>();
        int n =scan.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            int num = scan.nextInt();
            set.put(s, num);
        }
        while(scan.hasNext()){
            String s = scan.next();
            // Write code here
            if (set.get(s)!= null) {
                System.out.println(s+"="+set.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
