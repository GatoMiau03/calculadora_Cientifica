import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void areaCuadrado() {
        int lado = 5;
        int expectedArea = 25;
        assertEquals(expectedArea, Main.areaCuadrado(lado));
    }

    @Test
    void perimetroCuadrado() {
        int lado = 5;
        int expectedPerimeter = 20;
        assertEquals(expectedPerimeter, Main.perimetroCuadrado(lado));
    }

    @Test
    void areaRectangulo() {
        int base = 4;
        int altura = 5;
        int expectedArea = 20;
        assertEquals(expectedArea, Main.areaRectangulo(base, altura));
    }

    @Test
    void perimetroRectangulo() {
        int base = 4;
        int altura = 5;
        int expectedPerimeter = 18;
        assertEquals(expectedPerimeter, Main.perimetroRectangulo(base, altura));
    }

    @Test
    void areaCirculo() {
        int radio = 5;
        double expectedArea = 78.5398;
        assertEquals(expectedArea, Main.areaCirculo(radio), 0.0001);
    }

    @Test
    void perimetroCirculo() {
        int radio = 5;
        double expectedPerimeter = 31.4159;
        assertEquals(expectedPerimeter, Main.perimetroCirculo(radio), 0.0001);
    }

    @Test
    void areaEsfera() {
        int radio = 5;
        double expectedArea = 314.1593;
        assertEquals(expectedArea, Main.areaEsfera(radio), 0.0001);
    }

    @Test
    void volumenEsfera() {
        int radio = 5;
        double expectedVolume = 523.5988;
        assertEquals(expectedVolume, Main.volumenEsfera(radio), 0.0001);
    }

    @Test
    void areaCubo() {
        int lado = 5;
        int expectedArea = 150;
        assertEquals(expectedArea, Main.areaCubo(lado));
    }

    @Test
    void volumenCubo() {
        int lado = 5;
        int expectedVolume = 125;
        assertEquals(expectedVolume, Main.volumenCubo(lado));
    }

    @Test
    void areaCono() {
        int radio = 5;
        int generatriz = 10;
        double expectedArea = Math.PI * 75;
        assertEquals(expectedArea, Main.areaCono(radio, generatriz), 0.0001);
    }

    @Test
    void volumenCono() {
        int radio = 5;
        int altura = 10;
        double expectedVolume = 261.7994;
        assertEquals(expectedVolume, Main.volumenCono(radio, altura), 0.0001);
    }

}