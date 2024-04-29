//Paso por valor
/*
	Cuando se envía un valor primitivo de un método a otro
	se se dice que es un parámetro por valor, ya que ningún 
	método que sea ageno a una variable, podrá modificar
	el valor de la variable
*/
/*
public class Paso{
	public void mostrar(int value){
		System.out.println(value);
	}

	public void cambiar(int value){
		value = 123;
	}

	public static void main(String[] args) {
		Paso obj1 = new Paso();
		int i=10;
		obj1.mostrar(i);
		obj1.cambiar(i);
		obj1.mostrar(i);
	}
}
*/

/*
	Paso por referencia, es cuando se pasa como argumento un objeto
	para poder cambiar su valor.
*/

public class Paso{

	String nombre="Roberto";

	public static void mostrar(Paso obj){
		System.out.println(obj.nombre);
	}

	public static void cambiar(Paso obj, String name){
		obj.nombre = name;
	}

	public static void main(String[] args) {
		Paso sujeto = new Paso();
		mostrar(sujeto);
		cambiar(sujeto,"Damian");
		mostrar(sujeto);
	}
	
}

/*
public class Paso{
	int value = 10;
	public static void mostrar(Paso obj){
		System.out.println(obj.value);
	}

	public static void cambiar(Paso obj){
		obj.value = 123;
	}

	public static void main(String[] args) {
		Paso obj1 = new Paso();
		int i=10;
		mostrar(obj1);
		cambiar(obj1);
		mostrar(obj1);
	}
}*/