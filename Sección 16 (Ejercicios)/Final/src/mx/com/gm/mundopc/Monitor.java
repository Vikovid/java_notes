package mx.com.gm.mundopc;

public class Monitor {
    private final String idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores; 

    private Monitor() {
        ++Monitor.contadorMonitores;
        this.idMonitor = "M0"+String.valueOf(Monitor.contadorMonitores);
    }

    
    
    public Monitor(String marca, double tamanio) {
        this(); //Manda a llamar al cnonstructor vacío
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getIdMonitor() {
        return idMonitor;
    }

    @Override
    public String toString() {
        return "Monitor\n" + 
                "ID Monitor: " + idMonitor + 
                "\nMarca: " + marca + 
                "\nTamanio: " + tamanio ;
    }
    
    
    
    
}
