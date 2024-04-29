//Herencia
/*
	La herencia, es una forma de que posteriores clases
	tengan características de alguna clase padre. Entiendase
	por clase hijo, la clase que hereda las características 
	de la clase padre.
	
	TODAS LAS CLASES HEREDAN DE LA CLASE OBJECT
*/
public class Herencia{
	public static void main(String[] args) {
	Estudiante est1 = new Estudiante("Juanito","López",2015,7.8f);
	System.out.println("Los datos de est1 son:"+est1.toString());

	Persona p1 = new Persona("Robert","García");
	System.out.println("Los datos de p1 son:"+p1.toString());
	}
}

//Clase padre o Super clase
/*
	LA palabra protected, es básicamente, lo mismo que 
	private, excepto, por el echo de que los miembros 
	protected, solo pueden ser accedidos por la clases
	que los contiene o por su subclase
*/
class Persona{
	protected String nombre;
	protected String apellido; 

	public Persona(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre(){
		return nombre;
	}
	public String getApellido(){
		return apellido;
	}

	public String toString(){
		return "\n\tNombre: "+nombre+"\n\tApellido: "+apellido;
	}
}


//clase hija o subclase
/*	
	clase que hereda los atributos de la clase padre
	(clase Persona). Parafraseando, todos los estudiantes
	son personas, pero no todas las personas son estudiantes

	La palabra "super" hace una llamada al constructor de
	la clase padre o super clase, para inicializar los atributos

*/
class Estudiante extends Persona{
	private int boleta; 
	private float promedio; 

	public Estudiante(String nombre, String apellido, int boleta, float promedio){
		//super siempre va al inicio del constructor de la clase hija
		super(nombre,apellido);
		this.boleta = boleta;
		this.promedio = promedio;
	}

	public String toString(){
		return "\n\tNombre: "+nombre+"\n\tApellido: "+apellido+"\n\tBoleta: "+boleta+"\n\tPromedio: "+promedio;
	}
}
