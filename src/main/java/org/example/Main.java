package org.example;

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
            soluciones[0] = Double.NaN; //Double.nan representa que la solucion no es un numero real.
            soluciones[1] = Double.NaN;
        }

        return soluciones;
    }
}