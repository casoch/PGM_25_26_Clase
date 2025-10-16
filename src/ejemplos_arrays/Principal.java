package ejemplos_arrays;

import java.util.Scanner;

public class Principal {
    static final int NUM_JUGADORES = 5;
    enum Demarcaciones {PORTERO, DEFENSA, MEDIO, DELANTERO};
    enum Colores {BLANCO, NEGRO, AMARILLO, AZUL};
    static Scanner scann = new Scanner(System.in);

    public static void ejemploEnums()
    {
//        String strDemarcacion = "PORTERO";
//        strDemarcacion = "abc123";

        Demarcaciones demarcacion = Demarcaciones.DELANTERO;
        System.out.println(demarcacion);

        Colores color = Colores.AZUL;

    }

    public static void ejemploEquipo()
    {
        String[] nombres = new String[NUM_JUGADORES];

        //Pedir un nombre al usuario y guardarlo en la casilla [0]
        for (int i = 0; i < NUM_JUGADORES; i++) {
            System.out.println("Introduce nombre...");
            String nombre = scann.nextLine();
            nombres[i] = nombre;
        }

        for (int i = 0; i < NUM_JUGADORES; i++) {
            System.out.println(nombres[i]);
        }
    }

    public static void ejercicio53()
    {
        final int MAX = 20;
        int[] numeros = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            numeros[i] = i;
        }

        for (int i = 0; i < MAX; i++) {
            System.out.println("["+i+"] = "+numeros[i]);
        }
    }

    public static void ejercicio54()
    {
        final int MAX = 20;
        int[] mult5 = new int[MAX];

//        for (int i = 0; i < MAX; i++) {
//            mult5[i] = (i+1)*5;
//        }

        for (int i = 0, j = 5; i < MAX; i++, j+=5) {
            mult5[i] = j;
        }

        for (int i = 0; i < MAX; i++) {
            System.out.println("["+i+"] = "+mult5[i]);
        }
    }

    public static void ejercicio56()
    {

        //Parte 1: inicializar un array de 10 casillas con
        //              números random del 0 al 10
        final int MAX = 10;
        int[] numeros = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            int min = 0;
            int max = 10;
            int numeroRandom = (int)(Math.random() * ((max - min) + 1)) + min;
            numeros[i] = numeroRandom;
        }
//        -	La suma de los 10 elementos
        int suma = 0;
        for (int i = 0; i < MAX; i++) {
            suma += numeros[i];
        }
        System.out.println("Suma: "+suma);
//        -	La media aritmética de los 10 números
//        -	Los números que son superiores a la media
//        -	El número máximo
//        -	El número mínimo

    }

    public static void main(String[] args) {
        ejercicio56();
    }
}
