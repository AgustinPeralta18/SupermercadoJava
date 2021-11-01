/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

public class Boleta {

    private int precioBoleta;
    private String producto;

    public Boleta(int precioBoleta, String producto) {
        this.precioBoleta = precioBoleta;
        this.producto = producto;
    }

    
//boleta
    public void getPrecioBoleta() {
        System.out.println(" -----------------------");
        System.out.println("|     SM ''PROCEDA''    |");
        System.out.println("|                       |");
        System.out.println("|   Comprobante Pago    |");
        System.out.println("|                       |");
        System.out.println("|                       |");
        System.out.println("| Operacion: 235        |");
        System.out.println("| Fecha: 01/11/2021     |");
        System.out.println("| Caja: 2               |");
        System.out.println("|                       |");
        System.out.println("| Productos: "+this.producto);
        System.out.println("|                       |");
        System.out.println("| - - - - - - - - - - - |");
        System.out.println("|                       |");
        System.out.println("| Total:" + this.precioBoleta + "             |");
        System.out.println("|                       |");
        System.out.println("|                       |");
        System.out.println("|    Vuelva Pronto !!!  |");
        System.out.println(" -----------------------");
    }

}
