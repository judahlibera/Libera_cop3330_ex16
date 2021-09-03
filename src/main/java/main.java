/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("What is your age? ");
        int a = sc.nextInt();
        if(a < 16)
            System.out.printf("You are not old enough to legally drive.");
        else
            System.out.printf("You are old enough to legally drive.");
    }
}