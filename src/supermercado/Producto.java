package supermercado;

//Clase padre que se comparte con bebidas y alimento
abstract class  Producto {
   
    protected long codigo;
    protected int precio;
    protected boolean salida;
    
    

    public Producto(long codigo, int precio, boolean salida) {
        this.codigo = codigo;
        this.precio = precio;
        this.salida = salida;
        
        
    }
    //clase abstracta
    abstract public int producto(); 
}