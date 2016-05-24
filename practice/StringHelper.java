/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.practice;

/**
 *
 * @author Rahul
 */
 
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 

public class StringHelper {
    public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<String>();
        //Handling error scenarios
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0); // first character
        String rem = str.substring(1); // Full string without first character
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }
 
    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T =sc.nextInt();
        for (int i = 0; i < T; i++) {
            String d =sc.next();
            int s=permutationFinder(d).size();
            
        }
        
    }
}