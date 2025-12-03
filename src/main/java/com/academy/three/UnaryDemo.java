package com.academy.three;

public class UnaryDemo {
    public static void main(String[] args) {
        int number=23;
        System.out.println(number++); //1. Pošalji u konzolu (23) -> nakon slanja u konzolu uvećaj za 1 -> 24
        System.out.println(++number); //1. Uvećaj za 1 = 25 2. Pošalji u konzolu 25

        int broj= 24;
        System.out.println(broj++); // 24 -> 23
        System.out.println(++broj); // 22 -> 22


        boolean success= true;
        System.out.println(!success);
    }
}
