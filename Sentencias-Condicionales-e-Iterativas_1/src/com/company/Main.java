package com.company;

public class Main {

    public static void main(String[] args) {
        Triangulo1();
    }

    private static void Triangulo1() {
        String caract="*";
        for(int i=0; i<7; i++){
            System.out.println(caract);
            caract+="*";
        }
    }
}
