package mx.com.gm.mundopc;

public class Computadora {
    private final String idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras; 
    
    private Computadora(){
        ++Computadora.contadorComputadoras;
        idComputadora = "PC0"+String.valueOf(Computadora.contadorComputadoras);
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public static void setContadorComputadoras(int contadorComputadoras) {
        Computadora.contadorComputadoras = contadorComputadoras;
    }

    public String getIdComputadora() {
        return idComputadora;
    }

    @Override
    public String toString() {
        return "Computadora\n" + 
                "ID Computadora: " + idComputadora + 
                "\nNombre: " + nombre + 
                "\nMonitor: " + monitor + 
                "\nTeclado: " + teclado + 
                "\nRaton: " + raton ;
    }
    
    
    
}
