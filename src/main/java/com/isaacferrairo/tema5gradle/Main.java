package com.isaacferrairo.tema5gradle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {






    }
    public static int signo(int x) {
        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        }
        return 0;
    }

    public static String clasificarEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("Edad no válida");
        }
        if (edad < 6) {
            return "Infancia";
        } else if (edad < 12) {
            return "Niñez";
        } else if (edad < 18) {
            return "Adolescencia";
        } else if (edad < 25) {
            return "Juventud";
        } else if (edad < 60) {
            return "Adultez";
        } else {
            return "Vejez";
        }

}

    public static int contarPositivos(int[] datos) {
        int contador = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] > 0) {
                contador++;
            }
        }
        return contador;
    }

    public static String calificacion(int nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota no válida");
        }
        return switch (nota) {
            case 0, 1, 2, 3, 4 -> "SUSPENSO";
            case 5 -> "SUFICIENTE";
            case 6 -> "BIEN";
            case 7, 8 -> "NOTABLE";
            default -> "SOBRESALIENTE";
        };
    }

    public static boolean esBisiesto(int anyo) {
        return (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);
    }

    public static int evaluarPassword(String password) {
        int puntos = 0;

        if (password.length() >= 8) puntos++;
        if (password.matches(".*[A-Z].*")) puntos++;
        if (password.matches(".*[a-z].*")) puntos++;
        if (password.matches(".*\\d.*")) puntos++;
        if (password.matches(".*[^A-Za-z0-9].*")) puntos++;

        return puntos;
    }

    public static String jugar(String jugador1, String jugador2) {
        if (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERA") ||
                !jugador2.equals("PIEDRA") && !jugador2.equals("PAPEL") && !jugador2.equals("TIJERA")) {
            throw new IllegalArgumentException();
        }

        if (jugador1.equals(jugador2)) return "EMPATE";

        if ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA")) ||
                (jugador1.equals("TIJERA") && jugador2.equals("PAPEL")) ||
                (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA"))) {
            return "JUGADOR1";
        }

        return "JUGADOR2";
    }

    public static String clasificacionPassword(int puntos) {
        if (puntos <= 2) return "DEBIL";
        if (puntos <= 4) return "MEDIA";
        return "FUERTE";
    }

}
