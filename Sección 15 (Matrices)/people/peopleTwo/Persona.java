package peopleTwo;

public class Persona{
	protected String nombre;
	protected int edad;

	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	//Getters
	public String getNombre(){
		return nombre;
	}
	public int getEdad(){
		return edad;
	}

	//Setters 
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public String toString(){
		return "\n\tNombre: "+nombre+"\n\tEdad: "+edad;	
	}
}
