import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void resolverSistema_ConSolucionUnica() {
        double A = 2, B = 3, C = 7;
        double D = 1, E = 2, F = 5;

        double[] resultadoEsperado = {-1.0, 3.0};

        assertArrayEquals(resultadoEsperado, Main.resolverSistema(A, B, C, D, E, F), 1e-10,
                "El sistema debería tener una solución única (1.0, 2.0)");
    }

    @Test
    void resolverSistema_SinSolucion() {
        double A = 2, B = 3, C = 7;
        double D = 4, E = 6, F = 14;

        assertNull(Main.resolverSistema(A, B, C, D, E, F),
                "El sistema no debería tener solución porque los determinantes son proporcionales");
    }
}
