public class Main {
    public static void main(String[] args) {
        double A = 2;
        double B = 14;
        double C = 8;

        double D = 0;
        double E = 0;
        double F = 0;

        double det = A * E - B * D;
        if (det == 0) {
            System.out.println("El determinante es cero, el sistema no tiene una solucion unica o tiene infinitas soluciones.");
        } else {
            double x = (C * E - B * F) / det;
            double y = (A * F - C * D) / det;
            System.out.println("\nLa solucion del sistema de ecuaciones es:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
