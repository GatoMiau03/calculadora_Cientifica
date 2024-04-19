package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
        double resultado2 = Main.suma(-15, 0);
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
        double resultado = Main.multiplicacion(5, 3);
        assertEquals(15, resultado);
        double resultado2 = Main.multiplicacion(2, 0);
        assertEquals(0, resultado2);
    }

    @Test
    void division() {
        double resultado = Main.division(10, 2);
        assertEquals(5, resultado);
        double resultado2 = Main.division(-21, 7);
        assertEquals(-3, resultado2);
    }

    @Test
    void maximo() {
        double resultado = Main.maximo(5, 10);
        assertEquals(10, resultado);
        double resultado2 = Main.maximo(-2, -10);
        assertEquals(-2, resultado2);
    }

    @Test
    void minimo() {
        double resultado = Main.minimo(5, 10);
        assertEquals(5, resultado);
        double resultado2 = Main.minimo(-2, -10);
        assertEquals(-10, resultado2);
    }

    @Test
    void potencia() {
        double resultado = Main.potencia(2, 3);
        assertEquals(8, resultado);
        double resultado2 = Main.potencia(-2, 4);
        assertEquals(16, resultado2);
    }

    @Test
    void porcentaje() {
        double resultado = Main.porcentaje(100, 50);
        assertEquals(50, resultado);
        double resultado2 = Main.porcentaje(-200, 25);
        assertEquals(-50, resultado2);
    }

    @Test
    void solucionesCuadraticas() {
        double[] resultado = Main.solucionesCuadraticas(1, -3, 2);
        double[] esperado = {1.0, 2.0};
        Arrays.sort(resultado);
        Arrays.sort(esperado);
        assertArrayEquals(esperado, resultado);

        double[] resultado2 = Main.solucionesCuadraticas(1, 0, -9);
        double[] esperado2 = {-3.0, 3.0};
        Arrays.sort(resultado2);
        Arrays.sort(esperado2);
        assertArrayEquals(esperado2, resultado2);
    }

}
