package people; 
import peopleTwo.Persona;

public class Estudiante extends Persona{
	private int boleta; 

	public Estudiante(String nombre,  int edad, int boleta){
		super(nombre,edad);
		this.boleta = boleta;
	}

	public int getBoleta(){
		return boleta;
	}

	public void setBoleta(int boleta){
		this.boleta = boleta;
	}

	public String toString(){
		return super.toString()+"\n\tBoleta: "+boleta;
	}

	public static void main(String[] args) {
		Estudiante obj1 = new Estudiante("Raúl",21,201501);
		obj1.setEdad(12);
		System.out.println(obj1);
	}
}