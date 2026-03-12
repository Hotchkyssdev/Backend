import java.util.Scanner;

public class Repetitivas {
    public static void main(String[] args) {
        int limite;
        Scanner sc = new Scanner(System.in);
        System.out.println("Contar hasta limite");
        System.out.print("Ingrese el limite: ");
        limite = sc.nextInt();
        
        for (int i = 1; i <= limite; i++) {
            System.out.println(i);
        }

        System.out.println("\nContar de 2 en 2 hasta limite");
        for (int i = 2; i <= limite; i += 2) {
            System.out.println(i);
        }

        System.out.println("\nIngreso de palabras controlado por centinela");
        String palabra;
        do {
            System.out.print("Ingrese una palabra (o 'salir' para terminar): ");
            palabra = sc.next();
            if (palabra.equalsIgnoreCase(palabra)) {
                System.out.println("Palabra ingresada: " + palabra);
            }
        } while (!palabra.equalsIgnoreCase(palabra));

        System.out.println("\nMaraton Del Inmigrante");
        String dni;
        String nombre;
        int edad;

        System.out.print("Ingrese su DNI (0 para terminar): ");
        dni = sc.next();      

        System.out.print("Ingrese su nombre (fin para terminar): ");
        nombre = sc.next();
        
        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        while ((!dni.equals("0")) && (!nombre.equalsIgnoreCase("fin"))) {
            if (edad >= 6 && edad <= 10) {
                System.out.println("Usted debe ser inscripto a la categoria Menores A");
            } else if (edad >= 11 && edad <= 17) {
                System.out.println("Usted debe ser inscripto a la categoria Menores B");
            } else if (edad >= 18 && edad <= 30) {
                System.out.println("Usted debe ser inscripto a la categoria Juveniles");
            } else if (edad >= 31 && edad <= 50) {
                System.out.println("Usted debe ser inscripto a la categoria Adultos");
            } else if (edad > 50) {
                System.out.println("Usted debe ser inscripto a la categoria Adultos Mayores");
            } else  {
                System.out.println("Edad no valida para la maraton");
            }

            System.out.print("\nIngrese su DNI (0 para terminar): ");
            dni = sc.next();      

            System.out.print("Ingrese su nombre (fin para terminar): ");
            nombre = sc.next();
        
            System.out.print("Ingrese su edad: ");
            edad = sc.nextInt();
        }

        System.out.println("\nArbol de Navidad");
        int altura;
        System.out.print("Ingrese la altura del arbol: ");
        altura = sc.nextInt();
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}