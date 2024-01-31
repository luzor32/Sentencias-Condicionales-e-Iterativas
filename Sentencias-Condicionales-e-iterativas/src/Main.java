import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ex1();
    }

    private static void ex1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingresa otro numero entero: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
        } else if (num1 < num2) {
            System.out.println("El numero " + num2 + " es mayor que el numero " + num1);
        } else {
            System.out.println("Los dos numeros son iguales");
        }
    }
}