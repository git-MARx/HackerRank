/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank._30DaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;
/**
 *
 * @author Rahul
 */


public class RunningTimeAndComplexity {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new RunningTimeAndComplexity();
    }

    void solve() throws IOException {
        int n = nextInt();

        while (n-- > 0) {
            out.println(BigInteger.valueOf(nextInt()).isProbablePrime(1) ? "Prime" : "Not prime");
        }
    }

    RunningTimeAndComplexity() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                return null;
            }
        }
        return st.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    String nextString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
