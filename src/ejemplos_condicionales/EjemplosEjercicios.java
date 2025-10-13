package ejemplos_condicionales;

import java.util.Scanner;

public class EjemplosEjercicios {
    public static Scanner scanner = new Scanner(System.in);

    public static void ejemploIF() {
        System.out.println("Pon tu nota...");
        int nota = Integer.parseInt(scanner.nextLine());

        if (nota < 5) {
            System.out.println("Estás suspendido");
        } else {
            if (nota >= 5 && nota < 7) {
                System.out.println("Tienes un aprobado");
            } else {
                if (nota >= 7 && nota < 9) {
                    System.out.println("Tienes un notable");
                } else {
                    System.out.println("Tienes un sobresaliente");
                }
            }
        }

    }

    public static void ejemploIF_ELSEIF_ELSE() {
        System.out.println("Pon tu nota...");
        int nota = Integer.parseInt(scanner.nextLine());

        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida");
        } else if (nota < 5) {
            System.out.println("Estás suspendido");
        } else if (nota < 7) {
            System.out.println("Tienes un aprobado");
        } else if (nota < 9) {
            System.out.println("Tienes un notable");
        } else {
            System.out.println("Tienes un sobresaliente");
        }
    }

    public static void ejercicio23() {
        System.out.println("Numero 1");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Numero 2");
        int n2 = Integer.parseInt(scanner.nextLine());

        if (n1 == n2) {
            System.out.println("Son iguales");
        } else if (n1 > n2) {
            System.out.println("El primer número es mayor");
        } else {
            System.out.println("El segundo número es mayor");
        }
    }

    public static void ejercicio25() {
        System.out.println("Numero 1");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Numero 2");
        int n2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Numero 3");
        int n3 = Integer.parseInt(scanner.nextLine());

        boolean n1MasPequeno = n1 <= n2 && n1 <= n3;
        boolean n2MasPequeno = n2 <= n1 && n2 <= n3;
        //boolean n3MasPequeno = n3 < n1 && n3 < n2;

        if (n1MasPequeno)
        {
            System.out.println("El más pequeño es "+n1);
        }
        else if (n2MasPequeno)
        {
            System.out.println("El más pequeño es "+n2);
        }
        else
        {
            System.out.println("El más pequeño es "+n3);
        }
    }

    public static void ejercicio26ConIF()
    {
        System.out.println("Número entre 1 y 7...");
        int numero = Integer.parseInt(scanner.nextLine());

        switch (numero)
        {
            case 1:
                System.out.println("Lunes");
                //break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Vienes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número incorrecto");
                break;
        }
    }


    public static void main(String[] args) {
        ejemploIF();
    }
}
