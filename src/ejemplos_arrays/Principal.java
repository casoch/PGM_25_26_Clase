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
        final int MAX = 4;
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
        int min = 0;
        int max = 10;

        for (int i = 0; i < MAX; i++) {
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
        double media = (suma*1.0)/MAX;
        System.out.println("Media: "+media);

//        -	Los números que son superiores a la media
        System.out.println("Números por encima de la media");
        for (int i = 0; i < MAX; i++) {
            if (numeros[i] > media)
                System.out.println(numeros[i]);
        }
//        -	El número máximo
        System.out.println("Contenido del array");
        for (int i = 0; i < MAX; i++) {
            System.out.println("["+i+"]: "+numeros[i]);
        }
        int maximo = numeros[0];
        for (int i = 1; i < MAX; i++) {
           if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("El más grande es: " + maximo);

//        -	El número mínimo
        int minimo = numeros[0];
        for (int i = 1; i < MAX; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        System.out.println("El más pequeño es: " + minimo);

    }

    public static void ejercicio58()
    {
        final int MAX = 10;
        int[] numeros = new int[MAX];
        int min = 0;
        int max = 10;

        for (int i = 0; i < MAX; i++) {
            int numeroRandom = (int)(Math.random() * ((max - min) + 1)) + min;
            numeros[i] = numeroRandom;
        }

        int[] numerosReverse = new int[numeros.length];

        //Primero, intentamos hacer una copia exacta
        for (int i = 0; i < MAX; i++) {
            numerosReverse[i] = numeros[i];
        }

        //Ahora, hacemos la copia inversa
        for (int i = 0, j=MAX-1; i < MAX; i++, j--) {
            numerosReverse[j] = numeros[i];
        }

        //¿Y sólo con la i se podría hacer?
        for (int i = 0; i < MAX; i++) {
            numerosReverse[MAX-i-1] = numeros[i];
        }

        for (int i = 0; i < MAX; i++) {
            System.out.println("numeros["+i+"]="+numeros[i]);
            System.out.println("numerosReverse["+(MAX-i-1)+"]="+numerosReverse[MAX-i-1]);
        }
    }

    public static void ejercicio59()
    {
        final int MAX = 10;
        int[] numeros = new int[MAX];
        int min = 0, max = MAX;

        for (int i = 0; i < MAX; i++) {
            numeros[i] = (int)(Math.random() * ((max - min) + 1)) + min;;
        }

        //Declarar los dos arrays "mini"
        int[] numsPares = new int[MAX/2];
        int[] numsImpares = new int[MAX/2];

        //Rellenarlos
        for (int i = 0; i < MAX; i++) {
            if (i%2 == 0) //Casilla par
            {
                numsPares[i/2] = numeros[i];
            }
            else //Casilla impar
            {
                numsImpares[i/2] = numeros[i];
            }
        }
    }

    public static void ejercicio62()
    {
        //PASO 1: Pedir al usuario el número de pizzas

        //PASO 2: Declarar y pedir memoria para un array
        //          que pueda guardar ese número de pizzas (los nombres)

        //PASO 3: Mostrar el menú hasta que el usuario escoja la opción de salir
        //          (bucle)

        //PASO 4: Implementar cada una de las opciones del menú (dentro del bucle del paso 3)
    }

    public static void main(String[] args) {
        ejercicio58();
    }
}
