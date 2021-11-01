package supermercado;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

/*
Buenas tardes profesor, abra bien la consola para ver el programa!!
Nuestro programa se basa en la caja de un supermercado
*/
public class Supermercado {

    public static void main(String[] args) {

        Caja myCaja = new Caja();
        ArrayList<Boleta> boleta = new ArrayList();//Llamada del arraylist en el main
        Hashtable lista = new Hashtable();//Llamada del hashtable  en el main
        Scanner read = new Scanner(System.in);
        int opcion;
        
        

        System.out.println("             SUPERMERCADO  '' PROCEDA ''");

        System.out.println("\n\n ---------------------------------------------");
        System.out.println("|                 Instrucciones:              |");
        System.out.println("|                                             |");
        System.out.println("|  1) Buscar producto que desee               |");
        System.out.println("|  2) Ver el codigo que corresponda           |");
        System.out.println("|  3) Seleccione opcion en el Menu            |");
        System.out.println(" ---------------------------------------------");

        lista.put(5, "producto");
        System.out.println(lista.get(5));

        try {
            do {

                System.out.println("\n\n                   Lista de Productos: ");
                System.out.println("\n --- ALIMENTOS ---                    --- BEBIDAS ---");
                System.out.println("1. Fideos      Codigo: 8827                 1. Agua        Codigo: 113215");
                System.out.println("2. Milanesa    Codigo: 8845                 2. Coca Cola   Codigo: 113207");
                System.out.println("3. Helado      Codigo: 8863                 3. Pepsi       Codigo: 113410");

                System.out.println("\n\n                     Menu de Opciones");
                System.out.println("1) Agregar al Carrito");
                System.out.println("2) Sacar ticket");
                System.out.println("3) Salir de la App");
                opcion = read.nextInt();

                switch (opcion) {

                    case 1:
                            
                        myCaja.caja1(boleta);

                        break;
                    case 2:
                        //Foreach para mostrar el arraylist y la clase boleta
                        for (Boleta i : boleta) {
                            i.getPrecioBoleta();
                        }
                        break;
                    case 3:
                        System.out.println("Saliendo...........");    
                        System.exit(0);//System.exit(0) para salir del programa
                        break;
                    default:

                        break;
                }

            } while (opcion != 4);
         //MANEJO DE EXCEPCIONES "NumberFormatException" que sirve para manejar excepciones por si llega a ingresar otra cosa
         //que no sea numero.
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un codigo valido");

        }

        System.out.println("\n\n --------------------------------------------");
        System.out.println("|              Horarios de Atencion:         |");
        System.out.println("|                                            |");
        System.out.println("|  Lunes a Viernes:    09:00 a 20:00 hs      |");
        System.out.println("|  Sabados y Feriados: 09:00 a 14:00 hs      |");
        System.out.println(" --------------------------------------------");

        System.out.println("\n\n                            Que tenga un buen dia !!!");
        System.out.println("\n                    Vuelva pronto, siempre hay nuevas ofertas");

    }

}
