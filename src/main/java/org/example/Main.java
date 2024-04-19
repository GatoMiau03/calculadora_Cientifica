package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return Double.NaN;
        }
    }

    public static double maximo(double a, double b) {
        return Math.max(a, b);
    }

    public static double minimo(double a, double b) {
        return Math.min(a, b);
    }

    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static double porcentaje(double numero, double porcentaje) {
        return numero * (porcentaje / 100);
    }

    public static double[] solucionesCuadraticas(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;
        double[] soluciones = new double[2];

        try {
            if (a == 0) {
                throw new ArithmeticException("No es una ecuación cuadrática");
            }
            if (discriminante < 0) {
                throw new ArithmeticException("No existen soluciones reales");
            }

            soluciones[0] = (-b + Math.sqrt(discriminante)) / (2 * a);
            soluciones[1] = (-b - Math.sqrt(discriminante)) / (2 * a);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            soluciones[0] = Double.NaN;
            soluciones[1] = Double.NaN;
        }

        return soluciones;
    }

    public static double pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        double numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                numero = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: La entrada debe ser un número. Inténtalo de nuevo.");
                scanner.nextLine();
            }
        }

        return numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double a, b, c;

        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Máximo");
            System.out.println("6. Mínimo");
            System.out.println("7. Potencia");
            System.out.println("8. Porcentaje");
            System.out.println("9. Soluciones cuadráticas");
            System.out.println("0. Salir");

            try {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el primer número: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el segundo número: ");
                        b = pedirNumero();
                        System.out.println("Resultado: " + suma(a, b));
                        break;
                    case 2:
                        System.out.print("Ingresa el primer número: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el segundo número: ");
                        b = pedirNumero();
                        System.out.println("Resultado: " + resta(a, b));
                        break;
                    case 3:
                        System.out.print("Ingresa el primer número: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el segundo número: ");
                        b = pedirNumero();
                        System.out.println("Resultado: " + multiplicacion(a, b));
                        break;
                    case 4:
                        System.out.print("Ingresa el primer número: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el segundo número: ");
                        b = pedirNumero();
                        double resultadoDivision = division(a, b);
                        if (!Double.isNaN(resultadoDivision)) {
                            System.out.println("Resultado: " + resultadoDivision);
                        }
                        break;
                    case 5:
                        System.out.print("Ingresa el primer número: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el segundo número: ");
                        b = pedirNumero();
                        System.out.println("Resultado: " + maximo(a, b));
                        break;
                    case 6:
                        System.out.print("Ingresa el primer número: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el segundo número: ");
                        b = pedirNumero();
                        System.out.println("Resultado: " + minimo(a, b));
                        break;
                    case 7:
                        System.out.print("Ingresa la base: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el exponente: ");
                        b = pedirNumero();
                        System.out.println("Resultado: " + potencia(a, b));
                        break;
                    case 8:
                        System.out.print("Ingresa el número: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el porcentaje: ");
                        b = pedirNumero();
                        System.out.println("Resultado: " + porcentaje(a, b));
                        break;
                    case 9:
                        System.out.print("Ingresa el coeficiente a: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el coeficiente b: ");
                        b = pedirNumero();
                        System.out.print("Ingresa el coeficiente c: ");
                        c = pedirNumero();
                        double[] soluciones = solucionesCuadraticas(a, b, c);
                        if (!Double.isNaN(soluciones[0]) && !Double.isNaN(soluciones[1])) {
                            System.out.println("Soluciones: x1 = " + soluciones[0] + ", x2 = " + soluciones[1]);
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: La entrada debe ser un número. Inténtalo de nuevo.");
                scanner.nextLine();
            }
        } while (opcion != 0);

        scanner.close();
    }
}
