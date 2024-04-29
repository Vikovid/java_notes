//Return
/*
	En java , un método en ejecución puede terminar de tres formas distintas

		1. Usando la palabra return, lo cual indica que el método terminó y no
	   	   es necesario que retorne un tipo de valor. 

		2. Llegando al final del método, también se da por finalizado el método
	   	   sin embargo no es necesario usar la palabra return.

		3. Si ocurre un error, el método termina incluso si no se llegó al final 
	       del método o no se uso la palabra return. 

----Palabra return usando tipos primitivos

	Esta palabra por lo general se usa para devolver datos, cuando un método entra
	en ejecución, este puede o no devolver un valor. 

	En caso de que si lo devuelva, se coloca la palabra "return", dicha palabra 
	puede devolver elementos de tipo objeto o primitivos, todo depende de como se 
	declaró el método.

----Palabra return usando tipos objeto
	
	Es de la misma manera en que se devuelven los datos de tipo primitivo, por ejemplo
	si se tiene un objeto como el siguiente: 

		Suma objeto1 = new Suma();

	La forma de retornar el objeto1, simplemente se hace uso de la palabra return, 
	posteriormente se coloca el obetjo que se desea retornar, sin embargo, cabe 
	recordar que tanto para objetos primitivos como objetos de tipo objeto, se debe
	declarar la función con el tipo de dato que se desea retornar, por ejemplo:

		public Suma regresaObjeto(){
			return objeto1
		}
	 
	 Como se puede ver, tanto el método como el objeto de retorno, son del mismo tipo 
*/

public class Return{

	public static void main(String[] args) {
		Persona objeto1 = crearObjeto();

		System.out.println("El nombre de la Persona es: "+objeto1.name());
		System.out.println("La edad de la Persona es: "+objeto1.age());
	}

	private static Persona crearObjeto(){
		Persona objeto1 = new Persona("Robert García",35);
		return objeto1;
	}
}

class Persona{
	String nombre;
	int edad; 

	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	public String name(){
		return nombre;
	}

	public int age(){
		return edad;
	}
}