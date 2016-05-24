/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.practice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Rahul
 */
public class BreadthFirstSearchShortestReach {

    final int[][] G;
    final int start;

    BreadthFirstSearchShortestReach(int[][] G, int start) {
        this.G = G;
        this.start = start;
    }

    static BreadthFirstSearchShortestReach load(Scanner sc) {
        int nodes = sc.nextInt();
        int[][] G = new int[nodes][nodes];
        int edges = sc.nextInt();
        for (int i = 0; i < edges; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            G[a][b] = 6;
            G[b][a] = 6;
        }
        int start = sc.nextInt() - 1;
        return new BreadthFirstSearchShortestReach(G, start);
    }

    int[] solve() {
        int n = G.length;
        int[] ret = new int[n];
        boolean[] p = new boolean[n];
        Arrays.fill(ret, -1);
        Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(start);
        ret[start] = 0;
        p[start] = true;
        while (!q.isEmpty()) {
            int a = q.remove();
            for (int b = 0; b < n; b++) {
                if (G[a][b] > 0) {
                    if (ret[b] >= 0) {
                        ret[b] = Math.min(ret[b], ret[a] + G[a][b]);
                    } else {
                        ret[b] = ret[a] + G[a][b];
                    }
                    if (p[b] == false) {
                        p[b] = true;
                        q.add(b);
                    }
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BreadthFirstSearchShortestReach o = BreadthFirstSearchShortestReach.load(sc);
            int[] result = o.solve();
            for (int i = 0; i < result.length; i++) {
                if (i != o.start) {
                    System.out.printf("%d ", result[i]);
                }
            }
            System.out.println();
        }
    }
}
