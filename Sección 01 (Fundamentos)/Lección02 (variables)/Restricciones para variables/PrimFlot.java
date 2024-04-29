//Tipos primitivos, Tipos flotantes
/*
Cuando se hace uso de una variable de tipo var y se le asign un numero tal como
se muestra acontinuación:

	var numero = 12;

Entonces automáticamente java reconoce el valor como un tipo int.

De igual manera, si se declara una variable de tipo char,

	var letra='@';

Cuando se declara una variable de tipo flotante, existen dos casos. El caso 1 es 
cuando esa flotante se declara como entero, es decir, sin punto, y el segundo caso, 
cuando se declara con punto.
	
	float numero1 = 1000; //caso1
	float numero2 = 1000.12; //caso2

cuando se compila el caso 1 no se registrará ningún error, y el programa ejecutará
con normalidad, pero cuando se compila el caso 2, si existe problema, puesto que hay 
que especificar que se trata de un valor flotante, es decir, seguido del valor 
declarado, se agrega una "f" al final, tal como se puede ver acontinuación:
	
	float numero2 = 1000.12f;

Lo mismo sucede con double.
	duble numero = 213.132436246d;

Sucede un caso particular cuando se declara un tipo de variable var. siguiendo la siguiente 
sintaxis:

	var numero = 12.2;
CUANDO A var SE LE ASIGNA UN NÚMERO CON PUNTO DECIMAL, JAVA AUTOMÁTICAMENTE LO GUARDA COMO
TIPO DOUBLE.

*/
public class PrimFlot{
	public static void main(String[] args) {
		float a=1000;
		float b=1000.123122f;
		System.out.println("Numero flotante 1: "+a);
		System.out.println("Numero flotante 2: "+b);

		double a1=2000;
		double b1=2000.123421531d;
		System.out.println("Numero double 1: "+a1);
		System.out.println("Numero double 2: "+b1);
	}
}
