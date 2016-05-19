/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank._30DaysOfCode;

/**
 *
 * @author Rahul
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataType {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        System.out.println(i+scan.nextInt());
        double f = scan.nextDouble();
        System.out.println(d+f);
        String t = scan.nextLine();
//        System.out.println(t);
        System.out.println(s+scan.nextLine());
    }
}