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


public class BitwiseAND {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int n = in.nextInt();
            int k = in.nextInt();
            if(n <= k)
            {
                System.out.println(0);
            }
            else
            {
                int max = Integer.MIN_VALUE;
                for(int i=1; i< n; i++)
                {
                    for(int j=i+1; j<= n; j++)
                    {
                        if((i & j) < k)
                        {
                            int temp = i & j;
                            if(temp > max)
                            {
                                max = temp;
                            }
                        }
                    }
                }
                System.out.println(max);
            }
        }
    }
}
