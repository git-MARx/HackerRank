
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul
 */
public class miserenim {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int win = 0;
            boolean f = false;
            for (int j = 0; j < k; j++) {
                int m = sc.nextInt();
                if (m >= 2) {
                    f = true;
                }
                win = win ^ m;
            }
            System.out.println((win != 0 && f) || win == 0 && !f ? "First" : "Second");
        }
    }
}
