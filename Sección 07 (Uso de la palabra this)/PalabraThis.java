/*
	Es una referencia, al objeto que se está ejecutando
	evita ambigüedades entre variables de clase y
	variables locales. Además permmite a un objeto, 
	mandarse así mismo como parámetro. 
*/

//No se hace uso de la palabra this
public class PalabraThis{
	public static void main(String[] args) {
		Persona p = new Persona("Juan");
	}
}

/*
	En este caso, this se usa para hacer una referencia 
	a la variable "nombre" que pertenece a la clase Persona
	y que no se confunda con la variable local "nombre"
	que pertenece al método constructor de esa misma clase
*/
class Persona{
	String nombre;

	public Persona(String nombre){
		//atributo del objeto persona //variable local del método constructor. 
		this.nombre = nombre;
		System.out.println("El operador this esta apuntando a : "+this);
		Imprimir i = new Imprimir();

		//para este caso, se pasa como parámetro el objeto persona.
		i.display(this);
	}
}


/*
	Este objeto, solo se encarga de imprimir objetos
	para lo cual, primero imprime el objeto recibido
	y posteriormente, se imprime a sí mismo, ya que se 
	autoreferencia con la palabra this. 
*/
class Imprimir{
	//Object, indica que recibe un dato de tipo objeto
	public void display(Object o){
		System.out.println("Imprimir objeto recibido: "+o);
		System.out.println("Imprimir objeto actual (this): "+this);
	}
}