//Encapsulamiento
/*
	Se trata de aislar los datos de un objeto, de tal 
	forma, que no cualquier método pueda modificarlos.

	esto se logra gracias a los modificadores de acceso
*/

//public y private	

/*	
	- private
	El modificador de acceso private, permite que SOLO
	ACCEDAN MÉTODOS PRIVADOS DE LA MISMA CLASE

	- public
	Este modificador, permite acceder a cualquier método
	desde cualquier clase, SIEMPRE Y CUANDO SEAN PUBLICAS

	LOS MÉTODOS NO PUEDEN ACCEDER A OTROS MÉTODOS SI SU
	MODIFICADOR DE ACCESO ES DIFERENTE.	

	LOS MODIFICADORES DE ACCESO TAMBIÉN SE PUEDEN USAR 
	PARA ATRIBUTOS DEL OBJETO
*/



public class encapsulamiento{
	public static void main(String[] args) {
		Persona p1 = new Persona("Juan");
		/*	
			p1.nombre= "Robert";
			esto no es posible, ya que la variable nombre
			de la clase persona. Está definida como private
			y SOLO SE PUEDE MODIFICAR EN SU PROPIA CLASE
		*/
		System.out.println("El nombre de p1 es: "+p1.obtenerNombre());
		p1.cambios("Robert");
		System.out.println("El nombre de p1 es: "+p1.obtenerNombre());
	}
}

class Persona{
	private String nombre;

	public Persona(String nombre){
		this.nombre = nombre; 
	}

	public String obtenerNombre(){
		return nombre;
	}

	/*
		De esta forma se puede modificar el atributo nombre
		desde otra clase, ya que el método que modifica a
		"nombre" pertenece a la misma clase, y esta al ser 
		un método public, puede ser llamado por otras clases
	*/
	public void cambios(String nombre){
		this.nombre = nombre;
	}	
}	