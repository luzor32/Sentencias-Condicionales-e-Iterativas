import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" Ingresa el nombre del cursante: ");
        String nombre = sc.nextLine();
        System.out.println("Notas del 1 al 10");
        System.out.print("Ingresa la primera nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Ingresa la segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Ingresa la tercera nota: ");
        double nota3 = sc.nextDouble();

        double promedio = (nota1 + nota2 + nota3)/3;

        System.out.println("----------------------------------");
        System.out.println("Nombre del cursante es: "+nombre);
        System.out.println("Su promedio es: "+promedio);

        if (promedio > 0 && promedio <=5) {
            System.out.println("El cursante esta desaprobado");
        } else if (promedio > 5 && promedio <= 8) {
            System.out.println("El cursante esta aprobado");
        } else if (promedio > 8 && promedio <= 10) {
            System.out.println("El cursante esta promocionado");
        }
    }
}