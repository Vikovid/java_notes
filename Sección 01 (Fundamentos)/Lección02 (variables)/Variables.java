//Lección 02, variables en Java
/*

Existen muchos tipos de datos en java, los cuales se pueden calsificar 
én 2 categorías importantes:

	- Tipos primitivos: enteros, flotantes.
	- Tipos referenciados (Tipo Object): clases, interfaces, arreglos.

----- Tipos primitivos:
		-Enteros:
			boolean(1bit) 
			byte(8bits)
			short(16bits)
			char(16bits)
			int(32bits)
			long(64bits)

		-Flotantes:
			float(32bits)
			double(64bits)

*/
public class Variables{
	public static void main(String args[]){
		String saludo="q onda prros, vamos por pisto y cheve alv";
		System.out.println(saludo);

		var numero_flotante=1.223;
		var cadena="q hay que pez";
		var caracter='@';
		System.out.println(numero_flotante);		
		System.out.println(cadena);		
		System.out.println(caracter);		
	}
}

/*
Como se puede ver en el ejemplo anterior, se puede ver una declaración de una variable
como no se había mencionado antes, la cual consiste en
	var nombre_variable = valor_variable;
y básicamente consiste en que java determinará el tipo de dicha variable, 
depediendo del valor que se le asigne, es decir si se la signa un String, tomará
el tipo String, si es un int, tomaŕa el tipo int, etc. Esto es posible apartir del JDK
verisón 10 en adelante, PERO NO SERÁ POSIBLE CON VERSIONES ANTERIORES.
*/
