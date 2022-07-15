package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Precio();
        Mayor();
    }

    private static void Precio() {
        String nom_prod = "";
        double precio = 0, precio_final = 0;
        int opcion = 0;

        Scanner enter = new Scanner(System.in);

        System.out.println("Ingresa el nombre del producto");
        nom_prod = enter.nextLine();

        System.out.println("Ingresa el precio: ");
        precio = enter.nextFloat();

        System.out.println(" op. 1: Contado \n" +
                " op. 2: Debito \n" +
                " op. 3: Tarjeta");
        System.out.println("Ingresa opcion de pago: ");
        opcion = enter.nextInt();

        switch (opcion) {
            case 1:
                precio_final = precio-(precio * 0.15) ;
                System.out.println("El precio final es: " + precio_final);
                break;
            case 2:
                precio_final = precio;
                System.out.println("El precio final es: " + precio_final);
                break;
            case 3:
                precio_final = (precio * 0.10) + precio;
                System.out.println("El precio final es: " + precio_final);
            default:
                System.out.println("La opcion es incorrecta");
        }
        System.out.println("Tu producto es:" + nom_prod);
        System.out.println("El precio es:" +precio_final);

    }

    private static void Mayor() {
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
