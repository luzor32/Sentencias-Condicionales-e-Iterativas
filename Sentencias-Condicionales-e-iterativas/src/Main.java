import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Seleccione una opcion: ");
        System.out.println("Op. 1: ex1 ");
        System.out.println("Op. 2: ex2 ");
        System.out.println("Op. 3: ex3 ");
        System.out.println("Op. 4: ex4 ");
        System.out.println("Op. 5: ex5 ");
        System.out.println("Op. 6: ex6 ");
        System.out.println("Op. 7: ex7 ");
        System.out.println("Op. 8: Salir ");

        int option = lector.nextInt();
        while (option != 8) {
            if (option == 1) {
                ex1();
            } else if (option == 2) {
                ex2();
            } else if (option == 3) {
                ex3();
            } else if (option == 4) {
                ex4();
            } else if (option == 5) {
                ex5();
            } else if (option == 6) {
                ex6();
            } else if (option == 7) {
                ex7();
            }else {
                System.out.println("Selecciono una opcion no valida");
            }
            System.out.println("--------------------------");
            System.out.println("Seleccione una opcion: ");
            System.out.println("Op. 1: ex1 ");
            System.out.println("Op. 2: ex2 ");
            System.out.println("Op. 3: ex3 ");
            System.out.println("Op. 4: ex4 ");
            System.out.println("Op. 5: ex5 ");
            System.out.println("Op. 6: ex6 ");
            System.out.println("Op. 7: ex7 ");
            System.out.println("Op. 8: Salir ");
            option = lector.nextInt();

        }

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



    private static void ex3() {
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

  
    private static void ex4() {
        for (int i = 0; i < 10; i++) {
            System.out.println("foo");
        }
    }
          

    private static void ex5() {
        String texto ="";
        for (int i = 0; i < 7; i++) {
            texto +="*";
            System.out.println(texto);
        }
    }

  
    private static void ex6() {
        for (int i = 0; i < 7; i++) {
            String texto = "";
            for (int j = 0; j < 7-i; j++) {
                texto +="*";
            }
        }
    } 
    
  
    private static void ex7() {
        String texto = "";
        for (int i = 0; i < 7; i++) {
            String espacio="";
            for (int j = 0; j < 7-i; j++) {
                espacio +=" ";
            }
            texto +="*";
            System.out.println(espacio+texto);
        }

    }
}