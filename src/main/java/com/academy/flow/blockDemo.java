package com.academy.flow;

import java.util.Scanner;

public class blockDemo {
    public static void main(String[] args) {
        System.out.println("Unesi neki broj i proveri da li si sretan?!..");
        int number= new Scanner(System.in).nextInt();
        boolean happinesCondition= number<=23;
        if(happinesCondition){
            System.out.println("sretni ste");
        } else{
            System.out.println("niste baš srećni");

        }
        System.out.println("Uslov je tačan");
        System.out.println("Uslov nije tačan");

    }
}
