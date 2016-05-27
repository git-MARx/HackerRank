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
public class LetsReview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            String input = scan.next();
            for (int j = 0; j < input.length(); j++) {
                System.out.print(input.charAt(j));
                j++;
            }
            System.out.print("  ");
            for (int j = 1; j < input.length(); j++) {
                System.out.print(input.charAt(j));
                j++;
            }
        }
    }
}
