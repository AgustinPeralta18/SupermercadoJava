package supermercado;

import java.util.ArrayList;
import java.util.Scanner;

public class Caja {
          
    public void caja1(ArrayList<Boleta> boleta){ //arraylist que almacena los totales de los productos.
        Bebidas bebida = new Bebidas(0,0,0, false);
        Alimento alimentos = new Alimento("a",0,0, false);
        
        System.out.println("Codigo Bebidas");
        int totalBebida=bebida.producto();
        
        
        int ventasBebidas=150-totalBebida;
        ventasBebidas = ventasBebidas * 50;
        boleta.add(new Boleta(ventasBebidas,"Bebidas    |"));
        
        System.out.println("Codigo Alimentos");
        
        
        int totalAlimento=alimentos.producto();
        
        int ventasAlimentos=150-totalAlimento;
        ventasAlimentos = ventasAlimentos * 200;
        boleta.add(new Boleta(ventasAlimentos,"Alimentos  |"));

    }
    
}
