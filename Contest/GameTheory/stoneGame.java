
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
public class stoneGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            if (n%7==0 || n%7==1) {
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
        }
    }
    
}
