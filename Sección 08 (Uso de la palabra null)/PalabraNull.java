/*
	La palabra null, inndica que no se le ha asignado
	alguna referencia al objeto. Esta palabra solo puede
	ser asignada a un objeto.

	ES IMPORTANTE, no confundir NULL con null:

		NULL es utilizado para datos de tipo char.
		null es utilizado para objetos.
*/

public class PalabraNull{
	public static void main(String[] args) {
		Persona sujeto1 = new Persona("Emily");
		Persona sujeto2 = sujeto1;
		Imprimir show = new Imprimir();
		show.display(sujeto1);
		show.display(sujeto2);
		
		//Sección que hace que los objetos valgan null
		sujeto1=null;
		sujeto2=sujeto1;
		System.out.println("Después de \"sujeto1 = null\"");
		show.display(sujeto1);
		show.display(sujeto2);

		System.gc();
		System.out.println("Recolector de basura, hizo su trabajo");
		System.out.println("El nombre del sujeto 1 es: "+sujeto1.nombre);
		System.out.println("El nombre del sujeto 2 es: "+sujeto2.nombre);

	}	

}

class Persona{
	String nombre;
	public Persona(String nombre){
		this.nombre=nombre;
	}
}

class Imprimir{
	public void display(Object objeto){
		System.out.println("El objeto recibido es: "+objeto);
	}
}