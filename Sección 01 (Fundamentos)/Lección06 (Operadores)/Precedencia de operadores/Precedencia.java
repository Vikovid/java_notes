//Precedencia de operadores
/*
entre todos los operadores que ya se vieron anteriormente, se sabe que existe cierto
orden en cuanto a la ejecución de los operadores cuando se escriben consecutivamente.
Acontinuación se muestra la jerarquía de los operadores:

	- Operadores postfijos: op++, op--
	- Operadores unarios: ++op --op +op -op ~ !
	- Multiplicación, división y módulo: * / %
	- Suma y resta: + -
	- Desplazamiento: << >> >>>
	- Operadores relacionales: < > <= >=
	- Equivalencia == !=
	- AND unario: &
	- XOR: ^
	- OR unario: |
	- AND booleano: &&
	- OR booleano: ||
	- Operador ternario: ?:
	- Operadoresde asignación: = += -= *= /= %= ^= |= <<= >>= >>>=

Y aunque los paréntesis no son operadores, simpre que haya paréntesis en una linea
de operadores, se ejecutará primero lo que esté dentro de los paréntesis
*/
public class Precedencia{
	public static void main(String[] args) {
		int a=2, b=3;
		int res = -3 + 6 / ++a * 4 - b-- + b;
		System.out.println("La expresión a evaluar: -3 + 6 / ++a * 4 - b-- + b");
		System.out.println("Por Precedencia, se ejecutan en los operadores en el siguiente orden:");

		System.out.println("b-- : "+(b--));
		System.out.println("++a : "+(++a));
		System.out.println("6/++a : "+(6/a));
		System.out.println("-3+2*4-4+3 ");
		System.out.println("-3+8-4+3");
		System.out.println("finlmente, se tiene: "+res);
	}
}