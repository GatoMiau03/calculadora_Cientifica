public class Main {
    public static double[] resolverSistema(double A, double B, double C, double D, double E, double F) {
        double determinantePrincipal = A * E - B * D;

        if (Math.abs(determinantePrincipal) < 1e-10) {
            return null;
        }

        double x = (C * E - B * F) / determinantePrincipal;
        double y = (A * F - C * D) / determinantePrincipal;

        return new double[]{x, y};
    }

    public static void main(String[] args) {
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
}
