import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        double sueldo;
        int opcion;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido a la calculadora de sueldos");
        System.out.println("De que empleado hay que calcular el suedo?");
        System.out.println("1. Repositor");
        System.out.println("2. Cajero");
        System.out.println("3. Supervisor");
        System.out.print("Ingrese una opcion: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                sueldo = 15890;
                double bono = sueldo * 0.10;
                double sueldoFinal = sueldo + bono;
                System.out.println("El sueldo del repositor es: " + sueldoFinal);
                break;
            case 2:
                sueldo = 25630.89;
                System.out.println("El sueldo del cajero es: " + sueldo);
                break;
            case 3:
                sueldo = 35560.20;
                double descuentoJubilacion = sueldo * 0.11;
                double total = sueldo - descuentoJubilacion;
                System.out.println("El sueldo del supervisor es: " + total);
                break;
            default:
                System.out.println("Opcion no valida");
        }

        sc.close();
    }
}