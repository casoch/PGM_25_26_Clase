package ejemplos_tuplas;

public class PrincipalPanellet {
    public static void main(String[] args) {
        //PREGUNTA 2
        //Declara una variable de tipo Panellet y pídele memoria
        //y darle valores de ejemplo
        Panellet p = new Panellet();
        p.nombre = "Clásico de piñones";
        p.precio = 1.5;
        p.tipo = Panellet.TipoPanellet.PIÑONES;

        //PREGUNTA 3
        //Declara un array de 10 panellets, siendo 10 una constante
        final int NUM_PANELLETS = 10;
        Panellet[] panellets = new Panellet[NUM_PANELLETS];

        //PREGUNTA 4
        //Coloca el panellet de la pregunta 2 en la segunda casilla del array
        panellets[1] = p;

        //PREGUNTA 5
        //Código para mostrar lo que hay en el array de panellets
        //Evitando errores de casillas vacías
        for (int i = 0; i < NUM_PANELLETS; i++) {
            if(panellets[i] != null)
            {
                System.out.println(panellets[i].nombre+" - "+panellets[i].tipo+" - " +
                        ""+panellets[i].precio+" €");
            }
        }

        //PREGUNTA 6
        //¿Cuál es el precio medio de los panellets del array?
        double acumPrecios = 0;
        int numPanellets = 0;
        for (int i = 0; i < NUM_PANELLETS; i++) {
            if (panellets[i] != null)
            {
                acumPrecios += panellets[i].precio;
                numPanellets++;
            }
        }
        if (numPanellets == 0)
            System.out.println("No hay panellets para el cálculo de precios");
        else
        {
            double mediaPrecios= acumPrecios /numPanellets;
            System.out.println("Precio medio: "+mediaPrecios);
        }

    }
}
