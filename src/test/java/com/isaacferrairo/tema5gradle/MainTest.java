package com.isaacferrairo.tema5gradle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // 1 -------------------------------------------------------------------------------

    @Test
    void pruebaConNumeroPositivo() {
        assertEquals(1, Main.signo(5));
    }
    @Test
    void pruebaConNumeroNegativo() {
        assertEquals(-1, Main.signo(-3));
    }
    @Test
    void pruebaConNumero0() {
        assertEquals(0, Main.signo(0));
    }

    // 2 -------------------------------------------------------------------------------

    @Test
    void edadNegativa() {
        assertThrows(IllegalArgumentException.class, () -> Main.clasificarEdad(-1));
    }

    @Test
    void infancia() {
        assertEquals("Infancia", Main.clasificarEdad(1));
    }

    @Test
    void ninez() {
        assertEquals("Niñez", Main.clasificarEdad(8));
    }

    @Test
    void adolescencia() {
        assertEquals("Adolescencia", Main.clasificarEdad(14));
    }

    @Test
    void juventud() {
        assertEquals("Juventud", Main.clasificarEdad(21));
    }

    @Test
    void adultez() {
        assertEquals("Adultez", Main.clasificarEdad(29));
    }

    @Test
    void vejez() {
        assertEquals("Vejez", Main.clasificarEdad(61));
    }

    // 3 -------------------------------------------------------------------------------

    @Test
    void arrayVacio() {
        assertEquals(0, Main.contarPositivos(new int[]{}));
    }

    @Test
    void noPositivos() {
        assertEquals(0, Main.contarPositivos(new int[]{-1, -5, 0}));
    }

    @Test
    void mezclaValores() {
        assertEquals(2, Main.contarPositivos(new int[]{-3, 2, 10, 12}));
    }

    // 4 -------------------------------------------------------------------------------

    @Test
    void notaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> Main.calificacion(-1));
    }

    @Test
    void suspenso() {
        assertEquals("SUSPENSO", Main.calificacion(3));
    }

    @Test
    void suficiente() {
        assertEquals("SUFICIENTE", Main.calificacion(5));
    }

    @Test
    void bien() {
        assertEquals("BIEN", Main.calificacion(6));
    }

    @Test
    void notable() {
        assertEquals("NOTABLE", Main.calificacion(8));
    }

    @Test
    void sobresaliente() {
        assertEquals("SOBRESALIENTE", Main.calificacion(10));
    }

    // 5 -------------------------------------------------------------------------------

    @Test
    void divisiblePor4No100() {
        assertTrue(Main.esBisiesto(2028));
    }


    @Test
    void divisiblePor100No400() {
        assertFalse(Main.esBisiesto(1300));
    }


    @Test
    void divisiblePor400() {
        assertTrue(Main.esBisiesto(2400));
    }


    @Test
    void noDivisiblePor4() {
        assertFalse(Main.esBisiesto(2023));
    }



    // 6 -------------------------------------------------------------------------------

    @Test
    void empate() {
        assertEquals("EMPATE", Main.jugar("PAPEL", "PAPEL"));
    }



    @Test
    void ganaJugador1() {
        assertEquals("JUGADOR1", Main.jugar("PIEDRA", "TIJERA"));
    }

    @Test
    void ganaJugador2() {
        assertEquals("JUGADOR2", Main.jugar("PAPEL", "PIEDRA"));
    }


    @Test
    void jugadaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> Main.jugar("PIEDRA", "X"));
    }

    // 7 -------------------------------------------------------------------------------

    @Test
    void passwordDebil() {
        assertEquals("DEBIL", Main.clasificacionPassword(Main.evaluarPassword("123")));
    }


    @Test
    void passwordMedia() {
        assertEquals("MEDIA", Main.clasificacionPassword(Main.evaluarPassword("aeiDEF23")));
    }


    @Test
    void passwordFuerte() {
        assertEquals("FUERTE", Main.clasificacionPassword(Main.evaluarPassword("ak2$sde1!!")));
    }

}