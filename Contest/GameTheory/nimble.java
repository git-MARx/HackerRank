
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
public class nimble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int []c= new int[N];
            for (int j = 0; j < N; j++) {
                c[j]=sc.nextInt();
            }
            int nimsum =0;
            for (int j = 0; j < N; j++) {
                if (c[j]%2==1) {
                    nimsum^=j;
                }
            }
            System.out.println(nimsum == 0 ? "Second" : "First");
        }
    }
}
