//Operadores
/*
Existen distintos tipos de operadores en Java, así mismo existen distintos tipos de
operadores.

	- Operadores aritméticos: suma, resta, multiplicación, división, módulo (+,-,*,/,%)
	- Operadores de relación: mayor que, menor que, mayor o igual que, menor o igual que,
	  diferente a, igual a (<,>,<=,>=,!=,==).
	- Operadores Lógicos: and, or, not, xor (&&, ||, !, ^)
	- Operadores a nivel bits: desplazamiento a la izquierda, desplazamiento a la 
	  derecha, adn, or, xor, complemento a bits (<<,>>,&,|,^,~)
	- Operador condicional: ?:

Como se puede recordar en la lección03 de cadenas al momento de imprimir en pantalla
es necesario saber que se desea imprimir y en que orden, por ejemplo si se tienen 2
números que se desean sumar, no es necesario crear una variable adicional para poder 
mostrar el resultado de esa variable por ejemplo:

	int a=2, b=3;
	System.out.println("El resultado de la suma es: "+(a+b))

Y como salida se tendrá un 5, sin embargo cabe aclarar que cuando se colocan las
variables sumando después de las comillas del mensaje que se mostrará, es necesario
poner entre paréntesis la suma ya que de no ser así solo se concatenarán los valores,
ejemplo:
	
	System.out.println("El resultado de la suma es: "+a+b)

Como salida se tendrá: El resultado de la suma es: 23.	
*/
public class Operadores{
	public static void main(String[] args) {
		int a = 10, b = 15;
		//Operador: suma
		System.out.println("El resultado de la suma es: "+(a+b));
		//Operador: resta	
		System.out.println("El resultado de la resta es: "+(a-b));
		//Operador: multiplicación
		System.out.println("El resultado de la multiplicación es: "+(a*b));
		//Operador: división
		/*
		Para este caso, si no se hubiera realizado el casting el resultado
		de la división resultaría ser cero, debido a que es trata de una división
		de enteros.
		*/
		float cociente=(float)a/(float)b;
		System.out.println("El resultado de la división es: "+cociente);
		//Operador: módulo
		System.out.println("El resultado del módulo es: "+(a%b));
	}
}