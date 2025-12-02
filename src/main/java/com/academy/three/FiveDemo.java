package com.academy.three;

import java.util.Scanner;

public class FiveDemo {
    public static void main(String[] args) {
        System.out.println("Hej zdravo.Upiši svoj omiljeni broj");
        int omiljenibroj=new Scanner(System.in).nextInt();
        boolean condition = omiljenibroj==23;
        if (condition) {
            System.out.println("Zadovoljio si broj");
        }
        else {
            System.out.println("Nisi zadovoljio");

        }
    }
}
