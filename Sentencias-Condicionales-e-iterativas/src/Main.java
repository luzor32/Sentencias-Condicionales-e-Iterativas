import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex2();
        ex1();

    }

    private static void ex2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su producto: ");
        String producto = sc.nextLine();

        System.out.print("ingrese el precio: ");
        double precio = sc.nextDouble();

        System.out.println("op 1: Contado  \n"+
                           "op 2: Debito \n"+
                           "op 3: Tarjeta" );
        int opcion = sc.nextInt();
        double precio_final = 0;

        switch (opcion){
            case 1:
                precio_final = precio - (precio * 0.15);
                break;

            case 2:
                precio_final = precio;
                break;

            case 3:
                precio_final = precio + (precio *0.10);
                break;


            default:
                System.out.println("La opcion no es correcta");
        }
        System.out.println("---------------------------------------");
        System.out.println("El nombre del producto es: "+producto);
        System.out.println("El importe final es: "+precio_final);

        
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