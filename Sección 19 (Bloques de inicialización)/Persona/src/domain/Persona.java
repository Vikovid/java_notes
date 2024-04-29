package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{
        System.out.println("Ejecución de bloque estático:");
        ++Persona.contadorPersonas;
    }
    
    {
        System.out.println("Ejecución de bloque NO estático");
        idPersona = Persona.contadorPersonas++;
    }
    
    public int getID(){
        return this.idPersona;
    }
    public int getContador(){
        return contadorPersonas;
    }
    
    public static void main(String[] args) {
        Persona p1 = new Persona();
        System.out.println(p1.getID());
        System.out.println(p1.getContador());
    }
}
