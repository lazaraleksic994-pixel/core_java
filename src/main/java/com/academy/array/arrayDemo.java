package com.academy.array;

public class arrayDemo {
    public static void main(String[] args) {
        int number =23;
        System.out.println(number);
         number =26;
        System.out.println(number);
        // Ukoliko želim varijablu koja može da upamtitit  23 i 26 vrednost - niz kao Tip
        //** 2 Načina kreiranja nizova

        int [] numbers=new int [2];
        numbers[0]=23;
        numbers[1]=26;
        //numbers[2]=39; ArrayIndexOutOfboundsExpection-Expection Error
        System.out.println("Element at index 0=" +numbers[0]);
        System.out.println("Element at index 1=" +numbers[1]);
       // System.out.println("Element at index 2=" +numbers[2]); ArrayIndexOutOfboundsExpection-Expection Error
        // 2.Način koji se koristi SAMO kad su vam unapred poznati brojevi.
        int[] numbers2 = {23, 26, 39, 43};






    }
}
