package ejemplos_bucles;

import java.util.Scanner;

public class EjemplosBucles {
    static Scanner scann = new Scanner(System.in);
    public static void CalcularMedia3Notas() {
        //int numNotas = 0 --> Se ejecuta sólo al entrar (1ª vez)
        //numNotas < 3 --> Mientras sea true, me mantengo dentro del for
        //              Se evalúa en cada iteración, incluso antes de entrar
        //numNotas++ --> Incremento que ocurre en cada iteración
        //      Se ejecuta a partir de la segunda entrada al bucle

        double notaActual = 0;
        System.out.println("¿Cuántas notas vas a introducir?");
        int cantidadNotasPedir = Integer.parseInt(scann.nextLine());

        for (int numNotas = 0; numNotas < cantidadNotasPedir; numNotas++) {
            System.out.println("Introduce nota:");
            notaActual = notaActual + Double.parseDouble(scann.nextLine());
        }
        double notaMedia = notaActual/cantidadNotasPedir;
        System.out.println("Nota media: "+notaMedia);

    }

    public static void ejercicio36()
    {
        System.out.println("Cuántos números...");
        int cuantosNumeros = Integer.parseInt(scann.nextLine());
        int acum = 0;
        for (int i = 0; i < cuantosNumeros; i++) {
            System.out.println("Introduce número");
            //acum = acum + Integer.parseInt(scann.nextLine());
            acum += Integer.parseInt(scann.nextLine());
        }
        System.out.println("Suma: "+acum);
    }

    public static void ejercicio37()
    {
//        String strAcum = "";
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Introduce texto a concatenar...");
//            strAcum = strAcum + " " + scann.nextLine();
//           //strAcum += " " + scann.nextLine();
//        }
//        System.out.println(strAcum);
        System.out.println("Escribe numero de bucles");
        int nBucles= Integer.parseInt(scann.nextLine());
        System.out.println("escribe"+nBucles+"textos");
        String strAcum= "";
        for (int i = 0; i < nBucles ; i++) {
            System.out.println("Introduce texto para concatenar");
            strAcum+=" "+ scann.nextLine();
        }
        System.out.println(strAcum);
    }

    public static void ejercicio41()
    {
        int tabla = -1;
        do {
            System.out.println("Indica la tabla (entre 1 y 10)...");
            tabla = Integer.parseInt(scann.nextLine());

        }while(tabla < 1 || tabla > 10);
        for (int i = 1, resultado = tabla * i; i <= 10; i++, resultado += tabla) {
            System.out.println(tabla + " * " + i + " = " + resultado);
        }

    }

    public static void ejercicio42()
    {
        String str = "";
//        do{
//            System.out.println("Escribe ...");
//            str = scann.nextLine();
//            System.out.println("Has escrito... "+str);
//        }while(!str.equals("exit"));
        do{
            System.out.println("Escribe ...");
            str = scann.nextLine();
            if (str.equals("exit"))
                break;
            System.out.println("Has escrito... "+str);
        }while(true);
        //
    }

    public static void ejercicio45()
    {
        //int opcion = 0;
        char opcion = ' ';
        do {
            System.out.println("1. Jugar");
            System.out.println("2. Cargar partida");
            System.out.println("3. Salir");
            System.out.println("Escoge opción...");
            //opcion = Integer.parseInt(scann.nextLine());
            opcion = scann.nextLine().charAt(0);
            switch (opcion)
            {
                case '1':
                    System.out.println("Empieza partida...");
                    break;
                case '2':
                    System.out.println("Cargando última partida...");
                    break;
                case '3':
                    //System.out.println("Saliendo...");
                    break;
                default:
                    System.err.println("Error: Opción incorrecta");
                    break;
            }
        }while(opcion!='3');
        System.out.println("Cerrando aplicación");

    }

    public static void ejemploBucles()
    {
        System.out.println("Ejemplo con FOR");
        for(int i = 1; i <=5; i++)
        {
            System.out.println(i);
        }

        System.out.println("Ejemplo con do..while");
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <=5);

        System.out.println("Ejemplo de while");
        i = 1;
        while(i <=5)
        {
            System.out.println(i);
            i++;
        }


        //break / continue
        i = 1;
        while(true)
        {
            System.out.println(i);
            i++;
            if (i==5) {
                break;
            }
        }
    }

    public static void pedir5NumsPositivos()
    {
        int numUser = 0;
        int cuantosPositivos = 0;

        do{
            System.out.println("Introduce número...");
            numUser = Integer.parseInt(scann.nextLine());
            if (numUser<0) continue;
            //Llego aquí si el número es positivo
            cuantosPositivos++;
            if (cuantosPositivos==5) break;

        }while(true);
        //Después del break; sigo por aquí
    }

    public static void buclesAnidados()
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Item "+i);
            for (int j = 1; j <= 15; j++) {
                System.out.println("\tItem "+i+"."+j);
            }
        }
    }

    public static void ejercicio46()
    {
        System.out.println("Introduce la N");
        int n=0;
        do {
            n = Integer.parseInt(scann.nextLine());
            if (n < 1) System.err.println("El número debe ser mayor a 0");
        }while(n<1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            } //Aquí acaba la línea
            System.out.print("\n");
        }

        //Versión contatenar Strings
        String str = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                str+="*";
            } //Aquí acaba la línea
            str+="\n";
        }

        System.out.println(str);
    }
    public static void ejercicio41_amp2()
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del "+i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }
    }
    public static void main(String[] args) {
        ejercicio41_amp2();
    }
}
