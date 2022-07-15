package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Triangulo2();
        Triangulo1();
        Contar();
        MetodoFoo();
        NotaEstudiante();
        Precio();
        Mayor();
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

    private static void Triangulo1() {
        String caract="*";
        for(int i=0; i<7; i++){
            System.out.println(caract);
            caract+="*";
        }

    }

    private static void Contar() {
        for(int i=1; i<=10; i++){
            System.out.println("numero " + i);

        }


    }

    private static void MetodoFoo() {
        String texto="foo";

        for(int i=0; i<10; i++){
            System.out.println(texto);
        }

    }

    private static void NotaEstudiante() {
        String nombre = "";
        double nota1 = 0, nota2 = 0, nota3 = 0;
        double prom_nota = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el nombre del estudiante; ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese la primera nota: ");
        nota1 = entrada.nextFloat();

        System.out.print("Ingrese la segunda nota: ");
        nota2 = entrada.nextFloat();
        System.out.print("Ingrese la tercera nota: ");
        nota3=entrada.nextFloat();

        prom_nota = (nota1 + nota2 + nota3)/3;

        System.out.println("El estudiante es: " + nombre);
        System.out.println("Nota promedio: " + prom_nota);

        if (prom_nota>8 && prom_nota<=10){
            System.out.println("Promocionado");
        }else if(prom_nota<9 && prom_nota>5){
            System.out.println("Aprobado");
        }else if(prom_nota<=5 && prom_nota>0) {
            System.out.println("Desaprobado");
        }


      
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
