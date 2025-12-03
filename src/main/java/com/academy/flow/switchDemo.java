package com.academy.flow;

import java.util.Scanner;

public class switchDemo {
    public static void main(String[] args) {
        System.out.println("Unesite redni broj dana u sedmici za koji želite saznati ime na Nemačkom jeziku ");
        int weekDayNumber = new Scanner(System.in).nextInt();
        String dayName = switch (weekDayNumber) {
            case 1 -> {
                System.out.println("Ponedeljak");
                 yield "Mintag";
            }
            case 2 -> "Dienstag";
            case 3 -> "Mitwoch";
            case 4 -> "Donnerstag";
            case 5 -> "Friestag";
            case 6 -> "Samstag";
            case 7 -> "Sonntag";
            default -> "Sedmica ima 7 dana unesi broj izmedju 1 i 7";
        };
        System.out.println(dayName);
    }
}





