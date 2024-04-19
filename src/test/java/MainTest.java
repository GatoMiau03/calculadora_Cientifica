import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void areaCuadrado() {
        assertEquals(25, Main.areaCuadrado(5));
        assertEquals(0, Main.areaCuadrado(0));
    }

    @Test
    void perimetroCuadrado() {
        assertEquals(20, Main.perimetroCuadrado(5));
        assertEquals(0, Main.perimetroCuadrado(0));
    }

    @Test
    void areaRectangulo() {
        assertEquals(20, Main.areaRectangulo(4, 5));
        assertEquals(0, Main.areaRectangulo(0, 5));
    }

    @Test
    void perimetroRectangulo() {
        assertEquals(18, Main.perimetroRectangulo(4, 5));
        assertEquals(10, Main.perimetroRectangulo(0, 5));
    }

    @Test
    void areaCirculo() {
        assertEquals(78.5398, Main.areaCirculo(5), 0.0001);
        assertEquals(0, Main.areaCirculo(0), 0.0001);
    }

    @Test
    void perimetroCirculo() {
        assertEquals(31.4159, Main.perimetroCirculo(5), 0.0001);
        assertEquals(0, Main.perimetroCirculo(0), 0.0001);
    }

    @Test
    void areaEsfera() {
        assertEquals(314.1593, Main.areaEsfera(5), 0.0001);
        assertEquals(0, Main.areaEsfera(0), 0.0001);
    }

    @Test
    void volumenEsfera() {
        assertEquals(523.5988, Main.volumenEsfera(5), 0.0001);
        assertEquals(0, Main.volumenEsfera(0), 0.0001);
    }

    @Test
    void areaCubo() {
        assertEquals(150, Main.areaCubo(5));
        assertEquals(0, Main.areaCubo(0));
    }

    @Test
    void volumenCubo() {
        assertEquals(125, Main.volumenCubo(5));
        assertEquals(0, Main.volumenCubo(0));
    }

    @Test
    void areaCono() {
        double radio = 5;
        double generatriz = 10;
        double expectedArea = Math.PI * 75;
        assertEquals(expectedArea, Main.areaCono((int) radio, (int) generatriz), 0.0001);
    }

    @Test
    void volumenCono() {
        assertEquals(261.7994, Main.volumenCono(5, 10), 0.0001);
        assertEquals(0, Main.volumenCono(0, 0), 0.0001);
    }

}