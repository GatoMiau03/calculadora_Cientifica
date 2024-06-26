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

    //--------------------metodo para el cuadrado-------------------//

    //ÁREA
    public static int areaCuadrado(int lado) {
        try {
            if (lado <= 0) {
                throw new IllegalArgumentException("El lado no puede ser 0, negativo ni una letra.");
            }
            return lado * lado;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }

    //PERÍMETRO
    public static int perimetroCuadrado(int lado) {
        try {
            if (lado <= 0) {
                throw new IllegalArgumentException("El lado no puede ser 0, negativo ni una letra.");
            }
            return lado * 4;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }
    //-----------------metodo para el rectángulo-------------------//

    //ÁREA
    public static int areaRectangulo(int base, int altura) {
        try {
            if (base <= 0 || altura <= 0) {
                throw new IllegalArgumentException("La base y la altura no pueden ser 0, negativas ni letras.");
            }
            return base * altura;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }

    //PERÍMETRO
    public static int perimetroRectangulo(int base, int altura) {
        try {
            if (base <= 0 || altura <= 0) {
                throw new IllegalArgumentException("La base y la altura no pueden ser 0, negativas ni letras.");
            }
            return (base * 2) + (altura * 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }

    //------------------metodo para el círculo-------------------//

    //ÁREA
    public static double areaCirculo(int radio) {
        try {
            if (radio <= 0) {
                throw new IllegalArgumentException("El radio no puede ser 0, negativo ni una letra.");
            }
            return Math.PI * (radio * radio);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }
    //PERÍMETRO
    public static double perimetroCirculo(int radio) {
        try {
            if (radio <= 0) {
                throw new IllegalArgumentException("El radio no puede ser 0, negativo ni una letra.");
            }
            return 2 * Math.PI * radio;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }

    //--------------------metodo para la esfera-------------------//

    //ÁREA
    public static double areaEsfera(int radio) {
        try {
            if (radio <= 0) {
                throw new IllegalArgumentException("El radio no puede ser 0, negativo ni una letra.");
            }
            return 4 * Math.PI * (radio * radio);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }


    //VOLUMEN
    public static double volumenEsfera(int radio) {
        try {
            if (radio <= 0) {
                throw new IllegalArgumentException("El radio no puede ser 0, negativo ni una letra.");
            }
            double aa = (double) 4 / 3;
            return (aa) * Math.PI * (radio * radio * radio);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }
    //----------------------metodo para el cubo-------------------//

    //ÁREA
    public static int areaCubo(int lado) {
        try {
            if (lado <= 0) {
                throw new IllegalArgumentException("El lado no puede ser 0, negativo ni una letra.");
            }
            return 6 * (lado * lado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }
    //VOLUMEN
    public static int volumenCubo(int lado) {
        try {
            if (lado <= 0) {
                throw new IllegalArgumentException("El lado no puede ser 0, negativo ni una letra.");
            }
            return lado * lado * lado;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }

    //-----------------------metodo para el cono-------------------//

    //ÁREA
    public static double areaCono(int radio, int generatriz) {
        try {
            if (radio <= 0 || generatriz <= 0) {
                throw new IllegalArgumentException("El radio y la generatriz no pueden ser 0, negativos ni letras.");
            }
            return (radio + generatriz)* Math.PI * radio;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }
    //VOLUMEN
    public static double volumenCono(int radio, int altura) {
        try {
            if (radio <= 0 || altura <= 0) {
                throw new IllegalArgumentException("El radio y la altura no pueden ser 0, negativos ni letras.");
            }
            double aaa = (double) 1 / 3;
            return aaa * Math.PI * (radio * radio) * altura;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }

    public static double[] resolverSistema(double A, double B, double C, double D, double E, double F) {
        double determinantePrincipal = A * E - B * D;

        if (Math.abs(determinantePrincipal) < 1e-10) {
            return null;
        }

        double x = (C * E - B * F) / determinantePrincipal;
        double y = (A * F - C * D) / determinantePrincipal;

        return new double[]{x, y};
    }

    public static void resolverSistemaLinear() {
        double A = 2, B = 3, C = 7;
        double D = 1, E = 2, F = 5;

        double[] solucion = resolverSistema(A, B, C, D, E, F);

        if (solucion != null) {
            System.out.println("La solución del sistema de ecuaciones es:");
            System.out.println("x = " + solucion[0]);
            System.out.println("y = " + solucion[1]);
        } else {
            System.out.println("El sistema no tiene una solución única.");
        }
    }
    public static double[] calcularEcuacionRecta(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void calcularEcuacionRecta() {
        Scanner scanner = new Scanner(System.in);
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        boolean entradaValida;

        System.out.println("Ingresa las coordenadas del primer punto (x1, y1):");
        entradaValida = false;
        while (!entradaValida) {
            try {
                x1 = scanner.nextDouble();
                y1 = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: La entrada debe ser un número. Inténtalo de nuevo.");
                scanner.nextLine();
            }
        }

        System.out.println("Ingresa las coordenadas del segundo punto (x2, y2):");
        entradaValida = false;
        while (!entradaValida) {
            try {
                x2 = scanner.nextDouble();
                y2 = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: La entrada debe ser un número. Inténtalo de nuevo.");
                scanner.nextLine();
            }
        }

        double[] resultado = calcularEcuacionRecta(x1, y1, x2, y2);
        System.out.println("La ecuación de la recta es: Y = " + resultado[0] + "X + " + resultado[1]);
    }
    public static void main(String[] args) {
        mostrarMenuGeneral();
    }

    public static void mostrarMenuGeneral() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Menú general:");
            System.out.println("1. Operaciones numericas");
            System.out.println("2. Figuras geometricas");
            System.out.println("3. Sistema de ecuaciones");
            System.out.println("4. Ecuacion de la recta");
            System.out.println("0. Salir");

            try {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        mostrarMenuOperacionesNumericas();
                        break;
                    case 2:
                        mostrarMenuFigurasGeometricas();
                        break;
                    case 3:
                        resolverSistemaLinear();
                        break;
                    case 4:
                        calcularEcuacionRecta();
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROOOR. La entrada no puede ser una letra");
                scanner.nextLine();
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static void mostrarMenuOperacionesNumericas() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double a, b;

        do {
            System.out.println("Operaciones numrricas:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Maximo");
            System.out.println("6. Minimo");
            System.out.println("7. Potencia");
            System.out.println("8. Porcentaje");
            System.out.println("0. Volver al menu general");

            try {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el primer numero: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el segundo numero: ");
                        b = pedirNumero();
                        System.out.println("Resultado: " + suma(a, b));
                        break;
                    case 2:
                        System.out.print("Ingresa el primer numero: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el segundo numero: ");
                        b = pedirNumero();
                        System.out.println("Resultado: " + resta(a, b));
                        break;
                    case 3:
                        System.out.print("Ingresa el primer numero: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el segundo numero: ");
                        b = pedirNumero();
                        System.out.println("Resultado: " + multiplicacion(a, b));
                        break;
                    case 4:
                        System.out.print("Ingresa el primer numero: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el segundo numero: ");
                        b = pedirNumero();
                        double resultadoDivision = division(a, b);
                        if (!Double.isNaN(resultadoDivision)) {
                            System.out.println("Resultado: " + resultadoDivision);
                        }
                        break;
                    case 5:
                        System.out.print("Ingresa el primer numero: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el segundo numero: ");
                        b = pedirNumero();
                        System.out.println("Resultado: " + maximo(a, b));
                        break;
                    case 6:
                        System.out.print("Ingresa el primer numero: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el segundo numero: ");
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
                        System.out.print("Ingresa el numero: ");
                        a = pedirNumero();
                        System.out.print("Ingresa el porcentaje: ");
                        b = pedirNumero();
                        System.out.println("Resultado: " + porcentaje(a, b));
                        break;
                    case 0:
                        System.out.println("Volviendo al menu general");
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROOOR. La entrada no puede ser una letra");
                scanner.nextLine();
            }
        } while (opcion != 0);
    }

    public static void mostrarMenuFigurasGeometricas() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Figuras geometricas:");
            System.out.println("1. Area de un cuadrado");
            System.out.println("2. Perimetro de un cuadrado");
            System.out.println("3. Area de un rectangulo");
            System.out.println("4. Perimetro de un rectangulo");
            System.out.println("5. Area de un circulo");
            System.out.println("6. Perimetro de un circulo");
            System.out.println("7. Area de una esfera");
            System.out.println("8. Volumen de una esfera");
            System.out.println("9. Area de un cubo");
            System.out.println("10. Volumen de un cubo");
            System.out.println("11. Area de un cono");
            System.out.println("12. Volumen de un cono");
            System.out.println("0. Volver al menu general");

            try {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el lado del cuadrado: ");
                        int ladoCuadrado = scanner.nextInt();
                        System.out.println("Area: " + areaCuadrado(ladoCuadrado));
                        break;
                    case 2:
                        System.out.print("Ingresa el lado del cuadrado: ");
                        int ladoCuadradoPerimetro = scanner.nextInt();
                        System.out.println("Perimetro: " + perimetroCuadrado(ladoCuadradoPerimetro));
                        break;
                    case 3:
                        System.out.print("Ingresa la base del rectangulo: ");
                        int baseRectangulo = scanner.nextInt();
                        System.out.print("Ingresa la altura del rectangulo: ");
                        int alturaRectangulo = scanner.nextInt();
                        System.out.println("Area: " + areaRectangulo(baseRectangulo, alturaRectangulo));
                        break;
                    case 4:
                        System.out.print("Ingresa la base del rectangulo: ");
                        int baseRectanguloPerimetro = scanner.nextInt();
                        System.out.print("Ingresa la altura del rectangulo: ");
                        int alturaRectanguloPerimetro = scanner.nextInt();
                        System.out.println("Perimetro: " + perimetroRectangulo(baseRectanguloPerimetro, alturaRectanguloPerimetro));
                        break;
                    case 5:
                        System.out.print("Ingresa el radio del circulo: ");
                        int radioCirculo = scanner.nextInt();
                        System.out.println("Area: " + areaCirculo(radioCirculo));
                        break;
                    case 6:
                        System.out.print("Ingresa el radio del circulo: ");
                        int radioCirculoPerimetro = scanner.nextInt();
                        System.out.println("Perimetro: " + perimetroCirculo(radioCirculoPerimetro));
                        break;
                    case 7:
                        System.out.print("Ingresa el radio de la esfera: ");
                        int radioEsfera = scanner.nextInt();
                        System.out.println("Area: " + areaEsfera(radioEsfera));
                        break;
                    case 8:
                        System.out.print("Ingresa el radio de la esfera: ");
                        int radioEsferaVolumen = scanner.nextInt();
                        System.out.println("Volumen: " + volumenEsfera(radioEsferaVolumen));
                        break;
                    case 9:
                        System.out.print("Ingresa el lado del cubo: ");
                        int ladoCubo = scanner.nextInt();
                        System.out.println("Area: " + areaCubo(ladoCubo));
                        break;
                    case 10:
                        System.out.print("Ingresa el lado del cubo: ");
                        int ladoCuboVolumen = scanner.nextInt();
                        System.out.println("Volumen: " + volumenCubo(ladoCuboVolumen));
                        break;
                    case 11:
                        System.out.print("Ingresa el radio del cono: ");
                        int radioCono = scanner.nextInt();
                        System.out.print("Ingresa la generatriz del cono: ");
                        int generatrizCono = scanner.nextInt();
                        System.out.println("Area: " + areaCono(radioCono, generatrizCono));
                        break;
                    case 12:
                        System.out.print("Ingresa el radio del cono: ");
                        System.out.print("Ingresa el radio del cono: ");
                        int radio = scanner.nextInt();
                        System.out.print("Ingresa la altura del cono: ");
                        int altura = scanner.nextInt();
                        System.out.println("Volumen: " + volumenCono(radio, altura));
                        break;
                    case 0:
                        System.out.println("Volviendo al menu general");
                        break;
                    default:
                        System.out.println("ERROR. Opcion invalida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROOOR. La entrada no puede ser una letra");
                scanner.nextLine();
            }
        } while (opcion != 0);
    }
}
