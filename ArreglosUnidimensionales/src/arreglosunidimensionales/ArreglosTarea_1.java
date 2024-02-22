package arreglosunidimensionales;

import java.util.Scanner;

public class ArreglosTarea_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] miArreglo = new int[10]; // Arreglo de tamañ0 10

        while (true) { //Menu con las opciones
            System.out.println("\nMenu con todas las opciones:");
            System.out.println("1. Agregar dato");
            System.out.println("2. Borrar dato");
            System.out.println("3. Limpiar arreglo");
            System.out.println("4. Consultar arreglo");
            System.out.println("5. Calcular promedio");
            System.out.println("6. Salir");
            System.out.print("\nElije una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) { //Logica de las opciones
                case 1:
                    System.out.print("Ingresa el numero a agregar: ");
                    int dato = scanner.nextInt();
                    System.out.print("Ingresa la posicion (0-9): ");
                    int posicion = scanner.nextInt();
                    if (posicion >= 0 && posicion < 10) {
                        miArreglo[posicion] = dato;
                        System.out.println("\nDato agregado correctamente.");
                    } else {
                        System.out.println("\nPosicion invalida.");
                    }
                    break;
                case 2:
                    System.out.print("Ingresa la posicion a borrar: ");
                    posicion = scanner.nextInt();
                    if (posicion >= 0 && posicion < 10) {
                        miArreglo[posicion] = 0; // Borrar el dato
                        System.out.println("\nDato borrado correctamente.");
                    } else {
                        System.out.println("\nPosicion invalida.");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 10; i++) {
                        miArreglo[i] = 0; // Limpiar el arreglo
                    }
                    System.out.println("\nArreglo limpiado correctamente.");
                    break;
                case 4:
                    System.out.println("\nDatos en el arreglo:\n");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Posicion " + i + ": " + miArreglo[i]);
                    }
                    break;
                case 5:
                    double promedio = calcularPromedio(miArreglo);
                    System.out.println("Promedio: " + promedio);
                    break;
                case 6:
                    System.out.println("Gracias por usar mi codigo");
                    System.exit(0);
                default:
                    System.out.println("Opcion invalida.");
            }
        }
    }

    public static double calcularPromedio(int[] arreglo) { //Logica del promedio del programa
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return (double) suma / arreglo.length;
    }
}

  

