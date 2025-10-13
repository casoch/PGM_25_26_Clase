package ejercicios_intro;

import java.util.Scanner;

public class Ejercicios {
    public static Scanner scanner = new Scanner(System.in);

    public static void EjemploEnteros()
    {
//        Scanner scann = new Scanner(System.in);
//        System.out.print("Introduce un número: ");
//        int valorConsola = scann.nextInt();
//        System.out.println("Se ha escrito: "+valorConsola);
        int a = 8;
        int b = 3;
        int c = -5;
        int res = 2*b + 3*(a-c);
        System.out.println("Resultado: "+res+" €");


    }


    public static void Ejercicio1()
    {
        System.out.println("1. Jugar");
        System.out.println("2. Cargar partida");
        System.out.println("3. Salir");
        System.out.println("Escoge opción...");
    }

    public static void Ejercicio2()
    {
        System.out.println("******************************");
        System.out.println("*      Hecho por Carmen      *");
        System.out.println("*    carmen.soler@eug.es     *");
        System.out.println("******************************");
    }

    public static void ejercicio10()
    {
        Scanner scann = new Scanner(System.in);
        System.out.println("Introduce el precio...");
        double precioInicial = scann.nextDouble();

        double precioConDescuento = precioInicial*(1-0.20);

        System.out.println("Descuento: "+precioConDescuento);
    }

    public static void Ejercicio13()
    {
        Scanner scann = new Scanner(System.in);
        
        System.out.println("Introduce valor 1:");
        int n1 = scann.nextInt();
        System.out.println("Introduce valor 2:");
        int n2 = scann.nextInt();
        System.out.println("Introduce valor 3:");
        int n3 = scann.nextInt();

        int aux = n1;
        n1 = n3;
        n3= n2;
        n2 = aux;

        System.out.println(n1+" "+n2+" "+n3);
    }

    public static void ejemploConversiones()
    {
        char letra1 = '1';
        char letra3 = '3';

        int resultado = letra3 - letra1;
        char resultadoLetra = (char)(letra3 - letra1);

        char letraA = 'A';
        char letraB = (char)(letraA+1);
        System.out.println("Letra B: "+letraB);
        int distaciaMayMin = 'a' - 'A';
        char letraF = 'F';
        char letraFMin = (char)(letraF + distaciaMayMin);
        System.out.println("Letra f min: "+letraFMin);
    }

    public static void pruebasStrings()
    {
        String strHola = "Hola";
        String strMundo;
        strMundo = "mundo";

        String mensaje = "¡"+strHola+" "+strMundo+"!";

        System.out.println(mensaje);

        boolean sonIguales = strHola.equals(strMundo);
        System.out.println("Iguales: "+sonIguales);

        System.out.println("Segunda letra: "+strHola.charAt(1));

        System.out.println("Pasar a mayúsculas: "+strMundo.toUpperCase());


    }

    public static void ejercicio19()
    {
        Scanner scan = new Scanner(System.in);
        //Parte 1: Pedir la información
        System.out.println("Introduce tu nombre:");
        String nombrePersona = scan.nextLine();

        System.out.println("Precio producto 1...");
        double precio1 = Double.parseDouble(scan.nextLine());

        System.out.println("Cantidad producto 1...");
        double cantidad1 = Double.parseDouble(scan.nextLine());

        System.out.println("Precio producto 2...");
        double precio2 = Double.parseDouble(scan.nextLine());

        System.out.println("Cantidad producto 2...");
        double cantidad2 = Double.parseDouble(scan.nextLine());

        System.out.println("Precio producto 3...");
        double precio3 = Double.parseDouble(scan.nextLine());

        System.out.println("Cantidad producto 3...");
        double cantidad3 = Double.parseDouble(scan.nextLine());

        //Parte 2: Mostrar la información
        System.out.println(nombrePersona);
        double subTotal1 = cantidad1*precio1;
        System.out.println("Subtotal producto 1: "+subTotal1);
        double subTotal2 = cantidad2*precio2;
        System.out.println("Subtotal producto 2: "+subTotal2);
        double subTotal3 = cantidad3*precio3;
        System.out.println("Subtotal producto 3: "+subTotal3);

        double total = subTotal1 + subTotal2 + subTotal3;
        System.out.println(total);
    }

    public static void ejercicio15()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cantidad a cambiar...");
        int cantidad = Integer.parseInt(scan.nextLine());

        int numBilletes100 = cantidad / 100;
        int sobrante100 = cantidad % 100;
        System.out.println(numBilletes100+" billetes de 100€");

        int numBilletes50 = sobrante100 / 50;
        int sobrante50 = sobrante100 % 50;
        System.out.println(numBilletes50+" billetes de 50€");

        int numBilletes20 = sobrante50 / 20;
        int sobrante20 = sobrante50 % 20;
        System.out.println(numBilletes20+" billetes de 20€");

        int numBilletes10 = sobrante20 / 10;
        int sobrante10 = sobrante20 % 10;
        System.out.println(numBilletes10+" billetes de 10€");

        int numBilletes5 = sobrante10 / 5;
        int sobrante5 = sobrante10 % 5;
        System.out.println(numBilletes5+" billetes de 5€");

        System.out.println("Sobran "+sobrante5+" €");

    }

    public static void ejemploControlErrorMenu()
    {
        System.out.println("1. Jugar");
        System.out.println("2. Cargar partida");
        System.out.println("3. Salir");
        System.out.println("Escoge opción...");
        //Recoger la opción de un menú y comprobar que esté entre los límites
        int opcion = Integer.parseInt(scanner.nextLine());
        boolean opcCorrecta = opcion >= 1 && opcion<=3;
        System.out.println("¿Es correcto? "+opcCorrecta);

        boolean opcIncorrecta = (opcion < 1 || opcion>3);
        System.out.println("¿Es incorrecto? "+opcIncorrecta);

    }

    public static void ejemploControlRespuestaSiNo()
    {
        //preguntar al usuario (Si/No)
        //si escribe otra cosa, dar error

        System.out.println("Indica (si/no)...");
        String respuesta = scanner.nextLine();

        boolean respCorrecta = respuesta.equals("si") ||
                                respuesta.equals("no");
    }

    public static void ejercicio20()
    {
        System.out.println("Escribe la a:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Escribe la b:");
        int b = Integer.parseInt(scanner.nextLine());

//        -	¿La variable a es par?
        boolean aEsPar = a%2 == 0;
//        -	¿a y b son iguales?
        boolean a_bIguales = a == b;
//        -	¿a y b son positivos?
        boolean sonPositivos = a>=0 && b>=0;
//        -	¿a y b se han introducido en orden ascendente?
//        (es decir, si a es más pequeño o no)
        boolean ordenAscendente = a < b;
//        -	¿a y b están entre 1 y 10?
        boolean a_bEntre1_10 = (a >= 1 && a <=10) &&
                (b >= 1 && b <= 10);
//        -	¿Uno de los dos números es positivo y el otro negativo?
        boolean unoNegOtroPos = (a>=0 && b<0) || (a < 0 && b>= 0);
//        -	¿La suma de a y b es mayor que 15?
        boolean abMayor15 = (a+b)> 15;
//        -	¿La resta de a y b es un número negativo?
        boolean restaABNeg = (a-b)<0;

    }

    public static void ejercicio22()
    {
        boolean isRaining, hasUmbrella, hasCoat, canGoOutside;

        System.out.println("¿Está lloviendo? (true/false)");
        isRaining = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("¿Llevas paraguas? (true/false)");
        hasUmbrella = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("¿Llevas impermeable? (true/false)");
        hasCoat = Boolean.parseBoolean(scanner.nextLine());
//        -	No está lloviendo (independientemente de si tengo o no paraguas
//        o impermeable)
//        -	Está lloviendo y tengo paraguas y/o impermeable.

        canGoOutside = (!isRaining) || ((hasUmbrella || hasCoat ));
    }

    public static void ejercicio21()
    {
        System.out.println("¿Chocolate? (si/no)...");
        String respuesta = scanner.nextLine();
        boolean likesChocolate = respuesta.equals("si");

        System.out.println("¿Vainilla? (si/no)...");
        respuesta = scanner.nextLine();
        boolean likesVainilla = respuesta.equals("si");

//        -	bothFlavors
        boolean bothFlavors = likesChocolate && likesVainilla;
//        -	oneFlavor
        boolean oneFlavor = (!likesChocolate&&likesVainilla ||
                likesChocolate&&!likesVainilla);
//        -	noFlavor
        boolean noFlavor = !likesChocolate && !likesVainilla;

    }


    public static void main(String[] args)
    {
        ejercicio20();


    }
}
