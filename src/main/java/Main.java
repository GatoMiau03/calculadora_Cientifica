    import java.util.InputMismatchException;
    import java.util.Scanner;
    import java.lang.Math;


    //calcular perímetros, áreas y volúmenes según corresponda de las siguientes figuras geométricas: cuadrado, rectángulo, círculo, esfera, cubo y cono

    public class Main {
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
        public static void main(String[] args) {
            try {
                Main sensor = new Main();
                sensor.menuFiguras();
            } catch (IllegalArgumentException e) {
                System.out.println("Ingrese un opcion valida " + e.getMessage());
            }
        }

        //===================MENU===================//
        public void menuFiguras() {
            Scanner scanner = new Scanner(System.in);
            int opcion = -1;

            do {
                try {
                    System.out.println("\n =============Menu=============");
                    System.out.println("1. Calcular area de una figura");
                    System.out.println("2. Calcular perimetro de una figura");
                    System.out.println("3. Calcular volumen de una figura");
                    System.out.println("0. Salir del programa");
                    System.out.print("Seleccione una opcion: ");

                    // Intenta leer la opcion del usuario
                    opcion = scanner.nextInt();

                    // Switch para realizar la accion correspondiente
                    switch (opcion) {
                        case 1:
                            calcularArea();
                            break;
                        case 2:
                            calcularPerimetro();
                            break;
                        case 3:
                            calcularVolumen();
                            break;
                        case 0:
                            System.out.println("-Saliendo del programa-");
                            break;
                        default:
                            System.out.println("Opcion no valida. Intente nuevamente.");
                    }
                } catch (InputMismatchException e) {
                    // Captura la excepcion y maneja el error de entrada
                    System.out.println("Entrada no valida. Intente ingresar un numero.");
                    scanner.next(); // Limpiar el buffer del scanner
                }
            } while (opcion != 0);

            scanner.close();
        }

        public void calcularArea() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seleccione la figura geometrica de la que desea calcular el area:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Circulo");
            System.out.println("4. Esfera");
            System.out.println("5. Cubo");
            System.out.println("6. Cono");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    int lado = scanner.nextInt();
                    System.out.println("El area del cuadrado es: " + areaCuadrado(lado));
                    break;
                case 2:
                    System.out.print("Ingrese la base del rectangulo: ");
                    int base = scanner.nextInt();
                    System.out.print("Ingrese la altura del rectangulo: ");
                    int altura = scanner.nextInt();
                    System.out.println("El area del rectangulo es: " + areaRectangulo(base, altura));
                    break;
                case 3:
                    System.out.print("Ingrese el radio del circulo: ");
                    int radio = scanner.nextInt();
                    System.out.println("El area del circulo es: " + areaCirculo(radio));
                    break;
                case 4:
                    System.out.print("Ingrese el radio de la esfera: ");
                    radio = scanner.nextInt();
                    System.out.println("El area de la esfera es: " + areaEsfera(radio));
                    break;
                case 5:
                    System.out.print("Ingrese el lado del cubo: ");
                    lado = scanner.nextInt();
                    System.out.println("El area del cubo es: " + areaCubo(lado));
                    break;
                case 6:
                    System.out.print("Ingrese el radio del cono: ");
                    radio = scanner.nextInt();
                    System.out.print("Ingrese la generatriz del cono: ");
                    int generatriz = scanner.nextInt();
                    System.out.println("El area del cono es: " + areaCono(radio, generatriz));
                    break;
                default:
                    System.out.println("EROOOOOOR. Intentelo nuevamente.");
            }
        }

        public void calcularPerimetro() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seleccione la figura geometrica de la que desea calcular el perimetro:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Circulo");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    int lado = scanner.nextInt();
                    System.out.println("El perimetro del cuadrado es: " + perimetroCuadrado(lado));
                    break;
                case 2:
                    System.out.print("Ingrese la base del rectangulo: ");
                    int base = scanner.nextInt();
                    System.out.print("Ingrese la altura del rectangulo: ");
                    int altura = scanner.nextInt();
                    System.out.println("El perímetro del rectangulo es: " + perimetroRectangulo(base, altura));
                    break;
                case 3:
                    System.out.print("Ingrese el radio del circulo: ");
                    int radio = scanner.nextInt();
                    System.out.println("El perímetro del círculo es: " + perimetroCirculo(radio));
                    break;
                default:
                    System.out.println("EROOOOOOR. Intentelo nuevamente.");
            }
        }

        public void calcularVolumen() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seleccione la figura geométrica de la que desea calcular el volumen:");
            System.out.println("1. Esfera");
            System.out.println("2. Cubo");
            System.out.println("3. Cono");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio de la esfera: ");
                    int radio = scanner.nextInt();
                    System.out.println("El volumen de la esfera es: " + volumenEsfera(radio));
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cubo: ");
                    int lado = scanner.nextInt();
                    System.out.println("El volumen del cubo es: " + volumenCubo(lado));
                    break;
                case 3:
                    System.out.print("Ingrese el radio del cono: ");
                    radio = scanner.nextInt();
                    System.out.print("Ingrese la altura del cono: ");
                    int altura = scanner.nextInt();
                    System.out.println("El volumen del cono es: " + volumenCono(radio, altura));
                    break;
                default:
                    System.out.println("EROOOOOOR. Intentelo nuevamente.");


                }
            }
        }
