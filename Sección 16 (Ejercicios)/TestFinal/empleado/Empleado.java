package empleado;
import empleado.persona.Persona;

public class Empleado extends Persona{
    public String idEmpleado;
    public float sueldo; 
    public static int contador = 0;
    
    //Constructor
    public Empleado(String nombre, String apellido, int edad, float sueldo) {
        super(nombre, apellido, edad);
        this.sueldo = sueldo;
        this.idEmpleado = "Emp"+String.valueOf(contador++);
    }
    public Empleado(String nombre, String apellido, int edad) {
    	super(nombre, apellido, edad);
        this.idEmpleado = "Emp"+String.valueOf(contador++);
    }
    
    //Getters 
    public String getIdEmpleado() {
        return idEmpleado;
    }
    public float getSueldo() {
        return sueldo;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public String getApellido() {
        return apellido;
    }
    @Override
    public int getEdad() {
        return edad;
    }
    
    //Setters
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //To String
    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }  
    
}
