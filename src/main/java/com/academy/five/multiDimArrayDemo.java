package com.academy.five;

import java.util.Scanner;

public class multiDimArrayDemo {
    public static void main(String[] args) {
        String [] names = new String[3];
        names[0] = "Senaid";
        names[1] = "Milica";
        names[2] = "Elmir";
        // Herr  Frau  Herr
        // Senaid  Milica  Elmir
        String[] names2 ={"Senaid","Milica","Elmir"};
        char slovo= 's';
        String[][] array = {
                {"Herr", "Frau", "Herr"},
                {"Senaid", "Milica", "Elmir"},
        };
        System.out.println(array[0][1]+ "" + array[1][1]);
        System.out.println(array[0][0]+ "" + array[1][0]);
        System.out.println(array.length);
        System.out.println(array[0].length);
        System.out.println(array[1].length);
        System.out.println(array[0][2]+ " " +array[1][2]);



    }
}
