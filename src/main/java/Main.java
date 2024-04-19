    import java.util.Scanner;
    import java.lang.Math;


    //calcular perímetros, áreas y volúmenes según corresponda de las siguientes figuras geométricas: cuadrado, rectángulo, círculo, esfera, cubo y cono

    public class Main {
        //--------------------metodo para el cuadrado-------------------//

        //ÁREA
        public static int areaCuadrado(int lado) {
            return lado * lado;
        }

        //PERÍMETRO
        public static int perimetroCuadrado(int lado) {
            return lado * 4;
        }

        //-----------------metodo para el rectángulo-------------------//

        //ÁREA
        public static int areaRectangulo(int base, int altura) {
            return base * altura;
        }

        //PERÍMETRO
        public static int perimetroRectangulo(int base, int altura) {
            return (base * 2) + (altura * 2);
        }

        //------------------metodo para el círculo-------------------//

        //ÁREA
        public static double areaCirculo(int radio) {
            return Math.PI * (radio * radio);
        }

        //PERÍMETRO
        public static double perimetroCirculo(int radio) {
            return 2 * Math.PI * radio;
        }

        //VOLUMEN
        public static double volumenCirculo(int radio) {
            double a = (double) 4 / 3;
            return (a) * Math.PI * (radio ^ 3);
        }

        //--------------------metodo para la esfera-------------------//

        //ÁREA
        public static double areaEsfera(int radio) {
            return 4 * Math.PI * (radio * radio);
        }

        //VOLUMEN
        public static double volumenEsfera(int radio) {
            double aa = (double) 4 / 3;
            return (aa) * Math.PI * (radio ^ 3);
        }

        //----------------------metodo para el cubo-------------------//

        //ÁREA
        public static int areaCubo(int lado) {
            return 6 * (lado * lado);
        }

        //VOLUMEN
        public static int volumenCubo(int lado) {
            return lado * lado * lado;
        }

        //-----------------------metodo para el cono-------------------//

        //ÁREA
        public static double areaCono(int radio, int generatriz) {
            return Math.PI * radio * (radio + generatriz);
        }

        //VOLUMEN
        public static double volumenCono(int radio, int altura) {
            double aaa = (double) 1 / 3;
            return aaa * Math.PI * (radio * radio) * altura;
        }

        public static void main(String[] args) {
            Main sensor = new Main();
            sensor.menu();
        }

        //===================MENU===================//
        public void menu() {
            int opcion;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("\n =============Menú=============");
                System.out.println("1. Calcular area de una figura");
                System.out.println("2. Calcular perimetro de una figura");
                System.out.println("3. Calcular volumen de una figura");
                System.out.println("0. Salir del programa");
                System.out.print("Seleccione una opcion: ");
                opcion = scanner.nextInt();
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
                        System.out.println("EROOOOOOR. Intentelo nuevamente.");
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
                    System.out.println("El área del cubo es: " + areaCubo(lado));
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
