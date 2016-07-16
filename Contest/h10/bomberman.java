/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Contest.h10;

import java.util.Scanner;

/**
 *
 * @author Rahul
 */
public class bomberman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();
        char mat [][] = new char[r][c];
        for (int i = 0; i < r; i++) {
            String temp = sc.next();
            for (int j = 0; j < c; j++) {
                mat[i][j]= temp.charAt(j);
            }
        }
        
        
        char mat2 [][] = new char [r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat2[i][j] = 'O';
            }
        
        }
        int tl=s-2;
        
//        blast(tl,r,c,mat,mat2);
        
        
        
        
//    }
//    void blast(int tl,int r,int c ,char mat[][], char mat2[][]){
        if(tl>0){
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (mat[i][j]=='O') {
                        mat2[i][j]='.';
                        if (i+1<=r) {
                            mat2[i+1][j]='.';
                        }if (i-1>=0) {
                            mat2[i-1][j]='.';
                        }if (j+1<=c) {
                            mat2[i][j+1]='.';
                        }if (j-1>=0) {
                            mat2[i][j-1]='.';
                        }
                       
                    }
                }
            }
            tl--;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(mat2[i][j]+"  ");
            }System.out.println("");
        }
    }
}
