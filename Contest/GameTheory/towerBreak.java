package HackerRank.Contest.GameTheory;
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
public class towerBreak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            for (int j = 0; j < n - 1; j++) {
                int b = sc.nextInt();
                a = a ^ b;
            }
            if (a==0) {
                System.out.println("Second");
            }
            else
                System.out.println("First");
        }
    }
}
