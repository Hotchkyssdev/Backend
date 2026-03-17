import java.util.Scanner;

public class VectoresMatrices {
    public static void main(String[] args) {
        //Cuantas veces aparece el numero 3 en el vector
        int[] vector = {1, 2, 3, 4, 5, 3, 6, 7, 8, 9};
        int contador = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 3) {
                contador++;
            }
        }

        System.out.println("El numero 3 aparece " + contador + " veces en el vector.");

        //Notas y promedios de 4 alumnos
        Scanner sc = new Scanner(System.in);
        double[][] notas = new double[4][3];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("\nIngrese las notas del alumno " + (i + 1) + ":");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        System.out.println("");

        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            System.out.println("El promedio del alumno " + (i + 1) + " es: " + promedio);
        }

        System.out.println("");

        //Recorrido y carga de nombres
        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            nombres[i] = sc.next();
        }

        System.out.print("\nLos nombres ingresados son: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }

        System.out.println("");

        //Temperaturas de ciudades
        String[] ciudades = {"Buenos Aires", "Cordoba", "Rosario"};
        double[][] temperaturas = new double[3][7];

        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("\nIngrese las temperaturas de " + ciudades[i] + ":");
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.print("Dia " + (j + 1) + ": ");
                temperaturas[i][j] = sc.nextDouble();
            }
        }

        System.out.println("");

        for (int i = 0; i < ciudades.length; i++) {
            double suma = 0;
            for (int j = 0; j < temperaturas[i].length; j++) {
                suma += temperaturas[i][j];
            }
            double promedio = suma / temperaturas[i].length;
            System.out.println("La temperatura promedio de " + ciudades[i] + " es: " + promedio);
        }

        System.out.println("");

        //Rellenar una matriz
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el valor para posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nLa matriz ingresada es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("");

        //Empresa de vuelos con matrices
        String[] aerolineas = {"Aerolineas Argentinas", "LATAM", "Flybondi"};
        String[] destinos = {"Buenos Aires", "Cordoba", "Rosario"};
        double[][] precios = new double[3][3];

        for (int i = 0; i < aerolineas.length; i++) {
            System.out.println("\nIngrese los precios de " + aerolineas[i] + ":");
            for (int j = 0; j < destinos.length; j++) {
                System.out.print("Destino " + destinos[j] + ": ");
                precios[i][j] = sc.nextDouble();
            }
        }

        sc.close();
    }
}