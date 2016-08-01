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
import java.util.*;
/**
 *
 * @author Rahul
 */


public class RegExPatternsAndIntroToDatabases {
    private BufferedReader br;
    private PrintWriter out;

    public static void main(String[] args) throws IOException {
        new RegExPatternsAndIntroToDatabases();
    }

    private void solve() throws IOException {
        int t = Integer.parseInt(br.readLine());
        List<String> nameList = new ArrayList<>();
        while (t-- > 0) {
            String line = br.readLine();
            if (line.endsWith("@gmail.com")) {
                nameList.add(line.split(" ")[0]);
            }
        }
        Collections.sort(nameList);
        for (String name : nameList) {
            out.println(name);
        }
    }

    public RegExPatternsAndIntroToDatabases() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
}
