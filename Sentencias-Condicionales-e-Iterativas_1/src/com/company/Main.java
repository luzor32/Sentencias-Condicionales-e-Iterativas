package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NotaEstudiante();
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
}
