//Operadores condicionales
/*
Estos operadores necesitan de dos operandos, para realizar alguna "comparación"

	- AND(&&): el operador and, es algo similar al operador ==, solo que en este caso
	  solo funciona para datos de tipo boolean, es decir si recibe ambos true, 
	  devolverá un true. basándose en la tabla de verdad del operador AND:

	  Operando1 Operando2 Salida
	  false 	false     false
	  false		true	  false
	  true 		false	  false
	  true		true	  true

	- OR(||): este operador, también recibe dos operandos, y actúa de la misma manera
	  que AND, solo que este operador, solo necesita que al menos un operador sea true
	  para que la salida sea true, tal como se ve en la siguiente tabla de verdad.

	  Operando1 Operando2 Salida
	  false 	false     false
	  false		true	  true
	  true 		false	  true
	  true		true	  true

	- XOR(^): este operador, al igual que AND & OR, requiere de dos operandos para 
	  formar su tabla de verdad, la cual, tendrá como salida, false si ambos operandos
	  tienen el mismo valor, es decir, dos true o dos false.
	
	  Operando1 Operando2 Salida
	  false 	false     false
	  false		true	  true
	  true 		false	  true
	  true		true	  false

Sin embargo existen otros operadores que se basan en los mismos principios como son 
AND y OR lógicos (&,|). Igual se basan en las tablas de verdad de los operadores 
AND y OR anteriormente vistos, salvo que existen ciertas condiciones, por ejemplo 
para el caso de AND lógico:

	Operando1 Operando2 
	false 	  false     
	false	  true	    
	true 	  false	    
	true	  true	    

	- AND lógico (&): cuando Operando1 es false, inmediatamente se tiene false como 
      salida sin evaluar Operando2.

	- OR lógico (|): de manera opuesta, en OR lógico, cuando Operando1 es true, 
	  inmediatamente se tiene como salida true, sin evaluar Operando2.

*/
public class OperadoresCondicionales{
	public static void main(String[] args) {
		int a=10, b=12, c=15;
		//AND
		System.out.println("¿Tanto a como b son menores que c? "+((a<c)&&(b<c)));

		//OR
		System.out.println("¿a es menor que c o b es mayor que c? "+((a<c)||(b>c)));

		boolean x=true, y=false;

		System.out.println("\n\nAND lógico ------ Salida de x&y es: "+(x&y));
		System.out.println("OR lógico  ------ Salida de x|y es: "+(x|y));
		System.out.println("XOR        ------ Salida de x^y es: "+(x^y));
	}
}