//EjemploHerencia
import java.util.Date;

public class EjemploHerencia{
	public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan",5000);
		emp1.setEdad(20);
		emp1.setGenero('H');
		emp1.setDireccion("calle #22");
        System.out.println(emp1);
        
        Cliente cli1 = new Cliente(new Date(),false);
		cli1.setNombre("Alicia");
        	cli1.setEdad(42);
		cli1.setGenero('M');
		cli1.setDireccion("Av. 512");
        System.out.println(cli1);
	
	Cliente cli2 = new Cliente(new Date(),false,"Saúl",'H',22,"Calle 13");
        System.out.println(/*cli2*/);
	}
}

class Persona {
    protected String nombre;
    protected char genero;
    protected int edad; 
    protected String direccion; 
    
    //constructor vacio
    public Persona() {
    }
    
    //Constructor con un argumento
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //Constructor completo
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad){
    	this.edad = edad; 
    }

    public void setGenero(char genero){
    	this.genero = genero;
    }

    public void setDireccion(String direccion){
    	this.direccion=direccion;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }   
}

class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo; 
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }
    
}

class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip; 
    private static int contadorCliente; 

    public Cliente(Date fechaRegistro, boolean vip) {
        this.idCliente = ++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
    
    public Cliente(Date fechaRegistro,boolean vip, String nombre, char genero, int edad, String direccion){
    	super(nombre,genero,edad,direccion);
        this.idCliente = ++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return super.toString()+"Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
    }
    
}
