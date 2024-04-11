package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    }

    @Test
    void suma() {
        double resultado = Main.suma(10,5);
        assertEquals(15,resultado);
        double resultado2 = Main.suma (-15, 0);
        assertEquals(-15, resultado2);
    }

    @Test
    void resta() {
        double resultado = Main.resta(10,5);
        assertEquals(5,resultado);
        double resultado2 = Main.resta(-3,-9);
        assertEquals(6,resultado2);
    }

    @Test
    void multiplicacion() {
    }

    @Test
    void division() {
    }

    @Test
    void maximo() {
    }

    @Test
    void minimo() {
    }

    @Test
    void potencia() {
    }

    @Test
    void porcentaje() {
    }

    @Test
    void solucionesCuadraticas() {
    }
}