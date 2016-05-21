package HackerRank.Contest.GameTheory;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PokarNim {
    public static String PLAYER_ONE = "First";
    public static String PLAYER_TWO = "Second";
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named NimGameNormal. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int [] towers = new int[N];
            int res = -1;
            for(int i = 0; i < N; i++) {
                towers[i] = sc.nextInt();
                if(i == 0) {
                    res = towers[i];
                } else {
                    res ^= towers[i];
                }
            }
            System.out.println(res == 0 ? "Second" : "First");
        }
    }
}