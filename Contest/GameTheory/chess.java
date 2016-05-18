/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Rahul
 */
public class chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n;
            if (x%4==3||x%4==0 ||y%4==3 ||y%4==0 ) {
                System.out.println("First");
            }
            else
                System.out.println("Second");
        }
    }
}
