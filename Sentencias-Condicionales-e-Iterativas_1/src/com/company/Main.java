package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1=0, num2=0;

        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        num1=entrada.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        num2=entrada.nextInt();

        if (num1 > num2){
            System.out.println("EL PRIMER NUMERO ES MAYOR");
        }else if(num1<num2){
            System.out.println("EL SEGUNDO NUMERO ES MAYOR");
        }else if(num1 < num2){
            System.out.println("los numeros son iguales");
        }else{
            System.out.println("los nuemeros son iguales");
        }
    }
}
