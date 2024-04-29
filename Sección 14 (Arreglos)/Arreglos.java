/*
	Los arreglos son colecciones de elementos del mismo tipo
	por lo que, la forma de declarar un arreglo es:

	tipoDato nombreArreglo = new tipoDato[tamañoArreglo];

		para saber el número de elementos de un arreglo, se usa el 
		método lenght

		System.out.println(nombreArreglo.length);

	También se puede crear un arreglo de tipo Object, cada elemento
	del arreglo es un a referencia a un objeto. 
	
		OTra forma de declarar un arreglo, es incializando sus variables

		tipoDato nombreArreglo = {elemento1, elemento2, ... elementoN};
*/

import people.Persona;

public class Arreglos{
	public static void main(String[] args) {
		Persona personitas[] = new Persona[2];
		personitas[0] = new Persona("Fernando",12);
		personitas[0].setNombre("Robert");
		System.out.println(personitas[0]);
	}
}

	
