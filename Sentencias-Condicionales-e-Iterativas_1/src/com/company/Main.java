package com.company;

public class Main {

    public static void main(String[] args) {
        Triangulo2();
    }

    private static void Triangulo2() {
        String caract="*";

        for(int j=0; j<7; j++) {
            caract="";
            for (int i = 0; i < 7-j; i++) {
                caract += "*";
            }

            System.out.println(caract);
        }
    }
}
