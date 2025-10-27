package ejemplos_tuplas;

import java.util.Scanner;

public class Principal {
    static Scanner scann = new Scanner(System.in);
    public static void EjemploConProducto()
    {
        Producto prod1 = new Producto();
        prod1.codigo="a1";
        prod1.nombre="Cocacola";
        prod1.precio = 1.20;

        /// Codigo

        System.out.println(prod1.codigo+": "+prod1.nombre+" "+
                prod1.precio+" €");
    }

    public static void ejercicio67()
    {
        Pizza p = new Pizza();
        p.nombre = "BBQ";
        p.precio=12.75;
        p.tamaño = Pizza.Tamaño.INDIVIDUAL;
    }

    public static void ejercicio70()
    {
        final int NUM_ESTUDIANTES = 5;
        Estudiante[] estudiantes = new Estudiante[NUM_ESTUDIANTES];

        char opcion='0';
        do{
            System.out.println("1. Insertar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Borrar estudiante por posición");
            System.out.println("4. Borrar estudiante por nombre");
            System.out.println("5. Nota media global");
            System.out.println("6. Salir");
            opcion = scann.nextLine().charAt(0);
            switch (opcion)
            {
                case '1':
                    // Buscar casilla libre
                    //  Si no hay casilla libre -- Msg error
                    //  Si hay casilla libre
                    //      - Pedir datos
                    //      - Guardar datos en esa casilla libre
                    for (int i = 0; i < NUM_ESTUDIANTES; i++) {
                        if (estudiantes[i] == null)
                        {
                            //He encontrado una casilla vacía
                            //FORMA 1
                            Estudiante e = new Estudiante();
                            System.out.println("Di el nombre...");
                            e.nombre = scann.nextLine();
                            System.out.println("Di la nota...");
                            e.nota = Double.parseDouble(scann.nextLine());
                            Estudiante.Ciclo[] ciclosDisponibles = Estudiante.Ciclo.values();
                            for (int j = 0; j < ciclosDisponibles.length; j++) {
                                System.out.println((j+1)+". "+ciclosDisponibles[j]);
                            }
                            System.out.println("Escoge ciclo...");
                            int ciclo = Integer.parseInt(scann.nextLine());
                            e.ciclo = ciclosDisponibles[ciclo-1];
                            estudiantes[i] = e;
                            break;
                        }
                    }
                    break;
                case '2':
                    for (int i = 0; i < NUM_ESTUDIANTES; i++) {
                        if (estudiantes[i] != null)
                        {
                            //Aseguramos que la casilla no es null
                            System.out.println("["+i+"]: "+estudiantes[i].nombre+" - "+
                                    estudiantes[i].nota+" - "+estudiantes[i].ciclo);
                        }
                    }
                    break;
                case '3':
                    System.out.println("Indica posición a eliminar...");
                    int posicion = Integer.parseInt(scann.nextLine());
                    if (posicion <0 || posicion>=NUM_ESTUDIANTES)
                        System.err.println("Error. Posicion incorrecta");
                    else
                        estudiantes[posicion] = null;
                    break;
                case '4': //4. Borrar estudiante por nombre
                    System.out.println("Indica el nombre a eliminar...");
                    String nombreEliminar = scann.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < NUM_ESTUDIANTES; i++) {
                        if (estudiantes[i] != null &&
                                nombreEliminar.equals(estudiantes[i].nombre))
                        {
                            estudiantes[i] = null;
                            System.out.println("Estudiante encontrado y eliminado");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado)
                    {
                        System.err.println("Nombre de estudiante no encontrado");
                    }

                    break;
                case '5': //5. Nota media global
                    double acumNotas =0;
                    int numNotas =0;
                    for (int i = 0; i < NUM_ESTUDIANTES; i++) {
                        if (estudiantes[i] != null)
                        {
                            //Sólo tengo en cuenta la casilla si hay un estudiante
                            //Si no hubiera estudiante -->
                            // estudiante[i].nota es nullpointerexception
                            acumNotas += estudiantes[i].nota;
                            numNotas++;
                        }
                    }
                    if (numNotas == 0)
                    {
                        System.out.println("No hay estudiantes. No se puede " +
                                "calcular la media.");
                    }
                    else {
                        double notaMedia = acumNotas / numNotas;
                        System.out.println("La nota media es "+notaMedia);
                    }
                    break;
                case '6':
                    break;
                default:
                    System.err.println("Opción incorrecta");
                    break;
            }
        }while(opcion!='6');
    }

    public static void ejemploEnums()
    {
        Estudiante.Ciclo[] ciclosDisponibles = Estudiante.Ciclo.values();
        for (int i = 0; i < ciclosDisponibles.length; i++) {
            System.out.println((i+1)+". "+ciclosDisponibles[i]);
        }
        System.out.println("Escoge ciclo...");
        int cicloEscogido = Integer.parseInt(scann.nextLine());

        Estudiante e = new Estudiante();
        e.ciclo = ciclosDisponibles[cicloEscogido-1];
        System.out.println("Se ha guardado: "+e.ciclo);

//        System.out.println("1. CFGS-DAM");
//        System.out.println("2. CFGS-DAW");
//        System.out.println("3. CFGM-SMX");
    }



    public static void main(String[] args) {
        ejemploEnums();


    }
}
