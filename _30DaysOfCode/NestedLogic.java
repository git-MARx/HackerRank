/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank._30DaysOfCode;

import java.util.Scanner;
/**
 *
 * @author Rahul
 */


public class NestedLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int da = sc.nextInt();
        int ma = sc.nextInt();
        int ya = sc.nextInt();
        int de = sc.nextInt();
        int me = sc.nextInt();
        int ye = sc.nextInt();
        if (ya>ye) {
            System.out.println("10000");
        }else if(ya==ye){
            if (ma>me) {
                System.out.println((ma-me)*500);
            }
            else if(ma==me){
                if (da>de) {
                    System.out.println((da-de)*15);
                }
                
            }
            else if (ma<me) {
                System.out.println("0");
            }
        }
        else if (ya<ye) {
            System.out.println("0");
        }
    }
}
