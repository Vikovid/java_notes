package mx.com.gm.mundopc;

public class Raton extends DispositivoEntrada{
    private final String idRaton;
    private static int contadorRatones; 
    
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        ++Raton.contadorRatones;
        this.idRaton = "R0"+String.valueOf(Raton.contadorRatones);
    }

    @Override
    public String toString() {
        return "Raton\n" + "ID Raton: " + idRaton + "\n"+super.toString();
    }
}
