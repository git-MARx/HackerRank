/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Contest.CodeSprint;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rahul
 */
public class BeautifulQuadruples {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int []arr ={A,B,C,D};
        Arrays.sort(arr);
        System.out.println(arr[1]);
        int cnt=0;
        int win=0;
        for (int i = 1; i <= arr[0]; i++) {
            for (int j = i; j <= arr[1]; j++) {
                for (int k = j; k <= arr[2]; k++) {
                    for (int l = k; l <= arr[3]; l++) {
                        win=i^j^k^l;
                        if (win!=0) {
                            cnt++;
//                            System.out.println("("+i+","+j+","+k+","+l+")");
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
