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
public class Persons {

    private int age;

    public Persons(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge<0) {
            initialAge=0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        this.age=initialAge;
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if (this.age<13) {
            System.out.print("You are young.");
        }
        else if (this.age>=13 && this.age<18) {
            System.out.print("You are a teenager.");
        }
        else{
            System.out.print("You are old.");
        }
        System.out.println(/*Insert correct print statement here*/);
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Persons p = new Persons(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}