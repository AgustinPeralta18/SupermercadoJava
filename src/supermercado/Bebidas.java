package supermercado;

import java.util.Hashtable;
import java.util.Scanner;

public class Bebidas extends Producto {

    
    private Scanner read = new Scanner(System.in);
    Hashtable<Integer, String> lista = new Hashtable();//hastable para la obtencion de codigos de productos con sus respectivos
    //nombres

    public Bebidas(float litros, long codigo, int precio, boolean salida) {
        super(codigo, precio, salida);
        
    }

    @Override
    public int producto() {

        int contador = 150;
        this.salida = false;
        int salir;
        //lista.put para la programacion de la tabla hashtable
        lista.put(113207, "Coca-Cola");
        lista.put(113410, "Pepsi");
        lista.put(113215, "Agua");

        do {

            System.out.println("Cantidad de bebidas: " + contador);
            System.out.println("Ingrese codigo");

            int codigo = read.nextInt();
            
            //If para que no explote el hashtable    
            if (lista.containsKey(codigo)) {
                System.out.println(lista.get(codigo));
                contador--;
            } else {
                System.out.println("no existe ese codigo");
            }
            //salida del menu bebidas
            System.out.println("Terminar[1] o Continuar [2]");
            salir = read.nextInt();
            if (salir == 1) {
                this.salida = true;
            }
        } while (this.salida != true);

        return contador;
    }

}
