
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
public class chhal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int[][] myArray = { {2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 1},
                                {2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 1},
                                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},  
                                {2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                                {2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                                {1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                                {1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                                {2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2},
                                {2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2},
                                {1, 1, 1, 1, 2, 2, 1, 1, 2, 2, 1, 1, 1, 1, 1},
                                {1, 1, 1, 1, 2, 2, 1, 1, 2, 2, 1, 1, 1, 1, 1},
                                {2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 2},
                                {2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 2},
                                {1, 1, 1, 1, 2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 1},
            
            };
            
            
            int x1= sc.nextInt();
            int y1= sc.nextInt();
            int x = x1-1;
            int y = y1-1;
            
            if (myArray[x][y]==1) {
                System.out.println("First");
                
            }
            if (myArray[x][y]==2) {
                System.out.println("Second");
            }
        }
    }
}
