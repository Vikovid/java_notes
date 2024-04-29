package mx.com.gm.mundopc;

public class Orden {
    private final String idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes; 
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;
    
    public Orden(){
        this.idOrden = "OR00"+String.valueOf(++Orden.contadorOrdenes);
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras<Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("LIMITE SUPERADO!!");
        }
    }
    public void mostrarOrden(){
        System.out.println("Orden: "+this.idOrden);
        System.out.println("Computadoras a la orden: #: "+this.idOrden);
        for (int i = 0; i <  this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
