/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank._30DaysOfCode;

import java.util.*;

/**
 *
 * @author Rahul
 */

abstract class Book {

    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    abstract void display();

}
class MyBook extends Book{
    private int price ;
    MyBook(String t, String a, int price){
        super(t,a);
        this.price=price;
    }
    public void display(){
        System.out.println("Title: " +MyBook.super.title);
        System.out.println("Author: " +MyBook.super.author);
        System.out.println("Price: "+price);

    }
}

public class day13abstract {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        Book new_novel = new MyBook(title, author, price);
        new_novel.display();

    }
}
