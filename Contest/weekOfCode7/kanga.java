/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Contest.weekOfCode7;
import java.util.*;
/**
 *
 * @author Rahul
 */
public class kanga {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        if (v1<v2) {
            if (x1<x2) {
                System.out.println("No");
                System.exit(0);
            }
            while(x1>=x2){
                if (x1==x2) {
                    System.out.println("Yes");
                    break;
                }
                x1=x1+v1;x2=x2+v2;
            }
            if (x1!=x2) {
                System.out.println("NO");System.exit(0);
            }
        }
        else if (v1>v2) {
            if (x1>x2) {
                System.out.println("No");
                System.exit(0);
            }
            while(x1<=x2){
                if (x1==x2) {
                    System.out.println("Yes");
                    break;
                }
                x1=x1+v1;x2=x2+v2;
            }
            if (x1!=x2) {
                System.out.println("NO");System.exit(0);
            }
        }
        else if (v1==v2) {
            if (x1==x2) {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
