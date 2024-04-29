//Metodos
/*
	Un método es una acción que realiza el objeto, los métodos se declaran en la 
	misma clase que creará el objeto, junto con sus atributos, Los métodos solo se 
	pueden declarar adentro de una clase. A diferencia de las clases, los métodos
	suelen escribirse con la primera palabra en minuscula y si existe otra palabra
	escribirla con mayúsculas. La forma de declarar un método es simple:

		tipo nombreMétodo(tipoDato parámetro){
			instrucciones;
			.
			.
			.
		} 

	En donde tipo, es el tipo de dato que retornará la función este puede ser
	un dato primitivo o un objeto. Instrucciones será todo lo que ejecutará el método
	mientras que tipoDato es es parámetro o parámetros que recibirá el método, en 
	caso de que no sean requeridos los parámetros, simplemente se omite su escritura.
	También los métodos pueden tener modificadores de acceso como public, static 
	o private.
	
	Sin embargo, si un método está declarado, también es importante llamarlo para que 
	este haga lo solicitado. La forma general de mandar a llamar un método es:

		NombreClase Objeto = new NombreClase();//se está creando un nuevo objeto
		
		tipo variable = Objeto.nombreMétodo(parámetro);

	Esa es la forma de llamar al método, sin embargo, en caso de que el método no 
	retorne nada, es decir, sea de tipo void, entonces no es necesario crear una
	variable para almacenar.

		Objeto.nombreMétodo(parámetros);

	Las variables se pueden clasificar en 2:

		-Variables de clase;
		-Variables de método;

	Las varibales de clase se declaran en una clase y cualquier método de la misma
	clase puede usarlas y se inicializan por default en caso de que el usuario no las 
	inicialice.
	
	Las variables locales solo se pueden definir dentro de un método (incluyendo) 
	los argumentos del mismo, y deben ser inicializadas. Las variables locales
	se crean cuando el método es invocado y se eliminan cuando el método termina.

*/

public class Metodos{//Como ejemplos se tendrán metodos que realicen operaciones aritméticas

	int suma(int a, int b){
		return a+b;
	}

	int resta(int a, int b){
		return a-b;
	}

	int multiplicacion(int a, int b){
		return a*b;
	}

	float division(int a, int b){
		return (float)a/(float)b;
	}
	
	public static void main(String[] args) {
		Metodos prueba = new Metodos();
	
		System.out.println("El resultado de la suma es: "+prueba.suma(5,2));
		System.out.println("El resultado de la resta es: "+prueba.resta(5,2));
		System.out.println("El resultado de la multiplicación es: "+prueba.multiplicacion(5,2));
		System.out.println("El resultado de la división es: "+prueba.division(5,2));
		
	}
}