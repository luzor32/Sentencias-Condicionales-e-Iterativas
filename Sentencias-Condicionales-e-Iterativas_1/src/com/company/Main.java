package com.company;

public class Main {

    public static void main(String[] args) {
        Triangulo3();
    }

    private static void Triangulo3() {
        String caract="*";

        for(int j=0; j<7; j++) {
            caract="";
            for (int i = 0; i < 7-j-1; i++) {
                caract += " ";
            }
            for (int i = 0; i < j+1; i++) {
                caract += "*";
            }

            System.out.println(caract);
        }
    }
}
