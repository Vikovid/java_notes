/*
    Ya se habló que se puede sobrecargar un método en java, en este caso
    se está sobrecargando el método constructor, en uno de ellos se puede
    ver que se inicializan los atributos del objetosimplemente mandándolos
    a llamar.
    
    El otro Constructor que recibe un objeto como parámetro y accede a sus
    atributos gracias al operador punto, iuna vez accedido a ellos, se le asignan
    los atributos del objeto recibido a objeto referenciado.

    Dicho de otra manera el constructor de la línea 20, solo se puede usar 
    una vez que se tenga un objeto existente, y este objeto creado será una copia
    del objeto recibido. 
*/
class Caja {
    double ancho, alto, largo;
    //Observe este constructor.
    //Toma un objeto de tipo Caja.
    //Este constructor usa un objeto para inicializar otro.
    Caja(Caja ob){
        ancho = ob.ancho;
        alto = ob.alto;
        largo = ob.largo;
    }
    //constructor utilizado cuando todas
    //las dimensiones están especificadas
    
    Caja (double w, double h, double d){
        ancho = w;
        alto = h;
        largo = d;
    }
    double volumen(){
        return ancho * alto * largo;
    }
}
   
public class Test {
    public static void main(String args[]) {
        Caja objeto1 = new Caja(10, 20, 15);
        // creando una copia de objeto1
        Caja clon = new Caja(objeto1);
        // obtener volumen de objeto1
        System.out.println("Volumen de mi objeto1 es " + objeto1.volumen());
        // obtener volumen de clon
        System.out.println("Volumen de mi clon es " + clon.volumen());
    }
}