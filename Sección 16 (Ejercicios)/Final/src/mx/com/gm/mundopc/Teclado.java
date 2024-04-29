package mx.com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
        private final String idTeclado;
        private static int contadorTeclado; 
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        ++Teclado.contadorTeclado;
        this.idTeclado = "T0"+String.valueOf(Teclado.contadorTeclado);
    }

    @Override
    public String toString() {
        return "Teclado\n" + "ID Teclado: " + idTeclado + "\n"+super.toString();
    }
}


