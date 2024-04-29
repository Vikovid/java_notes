//Persona de constructores
/*
	Una Persona de métodos consiste en tener 
	varios métodos con el mismo nombre, pero con 
	distintos argumentos. También puede existir el
	caso en que tengan los mismos argumentos PERO
	distinto orden:

	public constructor(String, int){
	...
	} 

	public constructor(int, String){
	...
	}
*/
public class Sobrecarga{
	public static void main(String[] args) {
		Persona per1 = new Persona("Franco",21);		
		System.out.println("Persona\n"+per1);		

		Empleado emp1 = new Empleado(20,30000);
		System.out.println("Empleado\n"+emp1);		

		Empleado emp2 = new Empleado("Charles",35,18000);
		System.out.println("Empleado\n"+emp2);					
	}
}
/*
	this. hace referencia al objeto actual
	this() es para hacer uso de otros constructores de la MISMA clase
	los parámetros de this() deben ser los mismos que los del constructor
	que se desea llamar

		public constructor(String cadena, int numero){
		...	
		}

		this(cadena, numero); <----
*/
class Persona{
	protected String nombre;
	protected int edad; 
	static int contador; 
	protected String idPersona;

	private Persona(){
		contador++;
		idPersona ="0"+String.valueOf(contador);
	}

	public Persona(String nombre, int edad){
		this();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(int edad){
		this();
		nombre = "Robert";
		this.edad = edad;
	}

	public String toString(){
		return "\tNombre: "+nombre+"\n\tEdad: "+edad+"\n\tID Persona: "+idPersona+"\n\tNo. de personas: "+contador+"\n";
	}

}

class Empleado extends Persona{
	private double sueldo;

	public Empleado(int edad, double sueldo){
		super (edad);
		this.sueldo=sueldo;
	}

	public Empleado(String nombre, int edad, double sueldo){
		super(nombre,edad);
		this.sueldo=sueldo;
	}

	public String toString(){
		return super.toString()+"\tSueldo: "+sueldo+"\n";
	}	
}