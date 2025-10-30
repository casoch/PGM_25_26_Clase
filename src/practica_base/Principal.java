package practica_base;

import java.util.Scanner;

public class Principal {
    static Scanner scann = new Scanner(System.in);
    static final int PIN = 1234;
    static final int NUM_PRODUCTOS = 8;
    static Producto[] productos;
    static CajaMonedas caja;
    static int saldoCliente;

    /**
     * Muestra las opciones del menú del cliente.
     * Aquí no se pregunta la opción al usuario. Se hace desde el main.
     * Aquí también debes mostrar el saldo de cliente.
     * Aunque se guarda en cts, recuerda mostrarlo en €.
     */
    public static void menuCliente()
    {

    }

    /**
     * Muestra las opciones del menú del técnico.
     * Aquí no se pregunta la opción al usuario. Se hace desde el main.
     */
    public static void menuTecnico()
    {

    }

    /**
     * Muestra las opciones del menú principal.
     * Aquí no se pregunta la opción al usuario. Se hace desde el main.
     */
    public static void menuPrincipal()
    {

    }

    /**
     * Código necesario para inicializar el array de productos con todos sus valores.
     * Utiliza los productos que se proponen en la práctica e introdúcelos en cada casilla.
     * Esta función se llamará desde el main. Antes de empezar a mostrar los menús,
     * para partir de una máquina de vending con productos inicializados.
     */
    public static void initProductos()
    {
//        A1 | Water 50cl     | 100 cént. | stock 6
//        A2 | Cola 33cl      | 150 cént. | stock 5
//        A3 | Orange Juice   | 180 cént. | stock 4
//        B1 | Chips Salt     | 130 cént. | stock 7
//        B2 | Chocolate Bar  | 120 cént. | stock 6
//        B3 | Nuts 50g       | 200 cént. | stock 3
//        C1 | Sandwich Ham   | 250 cént. | stock 2
//        C2 | Sandwich Veg   | 240 cént. | stock 2
    //Pedir memoria para el array de productos
    //En cada casilla guardar uno de los productos de arriba
    }

    /**
     * Código necesario para inicializar la caja de monedas a algunos valores de partida.
     * Utiliza las cantidades de monedas que se proponen en la práctica e introdúcelos en la caja.
     * Esta función se llamará desde el main. Antes de empezar a mostrar los menús,
     * para partir de unos valores de base.
     */
    public static void initCajaMonedas()
    {

    }

    /**
     * Muestra los productos por pantalla.
     * Lee el enunciado para ver los detalles de implementación.
     */
    public static void listarProductos() {

    }

    /**
     * Permite al cliente introducir una moneda.
     * Sigue las instrucciones de implementación del enunciado.
     * La forma como guardes la moneda dependerá de la implementación que hayas escogido
     * para la CajaMonedas.
     */
    public static void introducirDinero()
    {

    }

    /**
     * Permite al cliente escoger un producto para comprar.
     * Revisa todos los controles de error que hay que hacer en el enunciado.
     * Recuerda devolver el cambio y reducir la cantidad del producto comprado.
     */
    public static void seleccionarYComprar()
    {

    }

    /**
     * Retorna el saldo al cliente indicando en qué monedas se lo retorna.
     * Revisa cómo debe implementarse y el control de errores que debe hacerse en el enunciado.
     */
    public static void devolverSaldo()
    {

    }

    /**
     * Se pregunta el código de un producto, su cantidad y se repone.
     * Revisa el detalle de implementación.
     */
    public static void reponerCantidad()
    {

    }

    /**
     * Permite ajustar la cantidad de monedas de la caja. Controlando no dejar en números negativos.
     * Revisa el detalle de implementación.
     */
    public static void ajustarCajaMonedas()
    {

    }

    /**
     * Muestra el detalle de la caja de monedas (cuántas monedas de cada tipo).
     * Te puede venir bien usar esta función desde verEstado()
     */
    public static void mostrarCaja()
    {

    }

    /**
     * Muestra un resumen del estado de la máquina:
     * - Sus productos
     * - La caja de monedas
     * - Las ventas por sesión -- se debe usar el último atributo de Producto
     */
    public static void verEstado()
    {

    }

    /**
     * Aquí el código que habéis hecho para la primera entrega
     */
    public static void main(String[] args) {
        initProductos();
        //Código de vuestros menús
        listarProductos();
    }


}
