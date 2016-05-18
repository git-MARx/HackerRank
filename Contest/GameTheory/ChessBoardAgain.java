
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
public class ChessBoardAgain {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int win = 0;
            for (int j = 0; j < k; j++) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;
                int currWin = x / 2 % 2 == 0 && y / 2 % 2 == 0 ? 2 : 1;
                if (win == 0) {
                    win = currWin;
                } else if (win != currWin) {
                    win = 1;
                } else {
                    win = 3 - win;
                }
            }
            System.out.println(win == 1 ? "First" : "Second");
        }
    }
}
