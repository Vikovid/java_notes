//PasoReferencia

public class PasoReferencia{
	public static void main(String[] args) {
		Persona obj1 = new Persona();
		System.out.println("El nombre que ingresó es: "+obj1.nombre);
		obj1.cambiarNombre("Damian");
		//System.out.println("El nombre que ingresó es:"+obj1.obtenerNombre());
		System.out.println("El nombre que ingresó es: "+obj1.nombre);
		obj1.cambiarNombre("Roberto");
		System.out.println("El nombre que ingresó es: "+obj1.nombre);

	}
}

class Persona{
	String nombre="Alice";

	public String obtenerNombre(){
		return nombre;
	}

	public void cambiarNombre(String nuevoNombre){
		nombre = nuevoNombre;
	}
	
}