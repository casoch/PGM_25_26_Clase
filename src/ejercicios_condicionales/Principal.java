package ejercicios_condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    static Scanner scanner  = new Scanner(System.in);

    public static void ejemploNotasSwitch()
    {
        System.out.println("Introduce nota:");
        int nota = Integer.parseInt(scanner.nextLine());
        switch (nota)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
            case 6:
                System.out.println("Aprobado");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
            default:
                System.out.println("Nota incorrecta");
        }
    }
    public static void ejemploMenusSwitch()
    {
        System.out.println("1. Jugar");
        System.out.println("2. Cargar partida");
        System.out.println("3. Salir");
        System.out.println("Escoge opción...");
        //int opcion = Integer.parseInt(scanner.nextLine());
        char opcion = scanner.nextLine().charAt(0);
        switch (opcion)
        {
            case '1':
                System.out.println("Empezando partida...");
                break;
            case '2':
                System.out.println("Escoge partida a cargar...");
                break;
            case '3':
                System.out.println("Cerrando juego...");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }

    /**
     * Ejercicios de pedir contraseñas
     */
    public static void ejercicio27()
    {
        System.out.println("Introduce contraseña:");
        String contrasenya = scanner.nextLine();
        System.out.println("Repite contraseña:");
        String contrasenya2 = scanner.nextLine();
        //Si el if o else tiene sólo una instrucción
        //no hacen falta las llaves
        if (contrasenya.equals(contrasenya2))
            System.out.println("Contraseña modificada correctamente");
        else
            System.err.println("Error: las contraseñas no coinciden");

    }

    /**
     * Evitar división entre 0.
     */
    public static void ejercicio30()
    {
        System.out.println("Introduce un dividendo entero:");
        int dividendo = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce un divisor entero:");
        int divisor = Integer.parseInt(scanner.nextLine());
        if (divisor == 0)
        {
            System.err.println("No se puede dividir entre 0");
        }
        else
        {
            int division = dividendo / divisor;
            int resto = dividendo % divisor;
            System.out.println("División: "+division);
            System.out.println("Resto: "+resto);
        }

    }

    public static void ejercicio31()
    {
        System.out.println("Indica edad:");
        int edad = Integer.parseInt(scanner.nextLine());
        double precio = -1;
        if (edad<4){
            //System.out.println("La entrada vale 0€");
            precio = 0;
        }
        else if (edad>65)
        {
            //System.out.println("La entrada vale 5€");
            precio = 5;
        }
        else if (edad>=4 && edad<18) //Entre 4 y 18
        {
            //preguntar si es familia monoparental o numerosa
            System.out.println("¿Es familia monoparental o numerosa? (S/N)");
            char opcion = scanner.nextLine().charAt(0);
            if (opcion == 'S' || opcion == 's')
            {
                //System.out.println("El precio es de 2.5 €");
                precio = 2.5;
            }
            else
            {
                //System.out.println("El precio es de 5 €");
                precio = 5;
            }
        }
        else /*if(edad >=18)*/ //¿o un else sería suficiente? --> para mayores de edad
        {
            //preguntar si tiene el carnet Jove o +25
            System.out.println("¿Tienes el carnet Jove o +25? (S/N)");
            char opcion = scanner.nextLine().charAt(0);
            if (opcion == 'S' || opcion == 's')
            {
                //System.out.println("El precio es de 10 €");
                precio = 10;
            }
            else
            {
                //System.out.println("El precio es de 15 €");
                precio = 15;
            }
        }

        System.out.println("La entrada vale: "+precio+" €");
    }

    public static void ejercicio33()
    {
        int min = 0; //Cara
        int max = 1; //Cruz

        int moneda = (int)(Math.random() * ((max - min) + 1)) + min;

        System.out.println("¿Cara o Cruz? (cara / cruz)");
        //En opcion tengo lo que ha escrito el usuario
        String opcion = scanner.nextLine();
        //Lo paso a minúsculas por si me escribe 'Cara' 'CARA'
        opcion = opcion.toLowerCase();

        int opcionEnNumero;
        //Si me escribe 'cara' --> digo que la opción del usuario es 0
        if (opcion.equals("cara"))
            opcionEnNumero = 0;
        else //Y sino es 1
            opcionEnNumero = 1;

        boolean acierto = opcionEnNumero == moneda;
        if (acierto) //(opcionEnNumero == moneda)
            System.out.println("Has acertado");
        else
            System.out.println("Has fallado");


    }

    public static void ejercicio34()
    {
        int min = 1;
        int max = 10;

        int numeroMaquina = (int)(Math.random() * ((max - min) + 1)) + min;

        System.out.println("Adivina el número (1-10):");
        int numeroJugador = Integer.parseInt(scanner.nextLine());

        if (numeroJugador == numeroMaquina)
        {
            System.out.println("Adivinaste el número en 1 intento");
            return; //Sale del bloque "ejercicio34()"
        }
        //Aquí no se llega si los números era iguales
        if (numeroJugador>numeroMaquina)
        {
            System.out.println("El número a adivinar es menor");
        }
        else
        {
            System.out.println("El número a adivinar es mayor.");
        }
        //Empieza el intento 2
        System.out.println("Adivina el número (1-10):");
        numeroJugador = Integer.parseInt(scanner.nextLine());
        if (numeroJugador == numeroMaquina)
        {
            System.out.println("Adivinaste el número en 2 intentos");
            return;
        }
        //Sólo se llega a esta línea si los números no coinciden
        if (numeroJugador>numeroMaquina)
        {
            System.out.println("El número a adivinar es menor");
        }
        else
        {
            System.out.println("El número a adivinar es mayor.");
        }
        //Empieza el intento 3
        System.out.println("Adivina el número (1-10):");
        numeroJugador = Integer.parseInt(scanner.nextLine());
        if (numeroJugador==numeroMaquina)
        {
            System.out.println("Has acertado en 3 intentos");
            return;
        }
        System.out.println("Has perdido, el número era: "+numeroMaquina);
    }

    public static void ejemploFOR() {
        //int i = 0 --> Se ejecuta al entrar al bucle (sólo)
        //i < 3 --> Se comprueba a cada iteración (incluso la primera)
        //          Podría ser que no entrara en la primera iteración
        // i++ --> Se ejecuta a partir de la segunda iteración

        double notaActual=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Se pide la nota " + i);
            notaActual = notaActual + Double.parseDouble(scanner.nextLine());
        }

        //Calcular la media
        System.out.println("Media: "+(notaActual/3));
    }


    public static void main(String[] args) {
        ejercicio34();
        //El return vuelve aquí debajo y continua la ejecución de lo sea
    }

}
