package supermercado;

import java.util.Hashtable;
import java.util.Scanner;

public class Alimento extends Producto {

    private String tipo;
    private Scanner read = new Scanner(System.in);
    Hashtable<Integer, String> lista = new Hashtable();

    public Alimento(String tipo, long codigo, int precio, boolean salida) {
        super(codigo, precio, salida);
        this.tipo = tipo;
    }

    @Override
    public int producto() {
        int contador = 150;
        int salir;

        lista.put(8827 , "Fideos");
        lista.put(8845 , "Milanesa");
        lista.put(8863 , "Helado");

        do {

            System.out.println("Cantidad de bebidas: " + contador);
            System.out.println("Ingrese codigo");
            int codigo = read.nextInt();

            if (lista.containsKey(codigo)) {
                System.out.println(lista.get(codigo));
                contador--;
            } else {
                System.out.println("no existe ese codigo");
            }

            System.out.println("Terminar[1] o Continuar [2]");
            salir = read.nextInt();
            if (salir == 1) {
                this.salida = true;
            }

        } while (salida != true);

        return contador;

    }

}
