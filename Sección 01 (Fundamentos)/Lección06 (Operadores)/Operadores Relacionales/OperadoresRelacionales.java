// Operadores Releacionales y operadores de igualdad
/*
	
	- Igual(==): este operador solo funciona con datos de tipo primitivo. Su función 
	  es comparar dos datos del mismo tipo y verificar si son iguales o no, es decir
	  regresa un true, si con iguales, y regresa un false, en caso de que no.

	- Diferente(!=): es lo mismo el operador Igual, salvo que este pregunta si
	  los valores son distintos o no.

Para los casos anteriores y los siguientes solo se trata de comparar dos magnitudes
y definir si es falso o verdadero, según sea el caso.

	- Menor que(<): compara dos magnitudes, preguntando si una es menor que otra.

	- Mayor que(>): compara dos magnitudes, preguntando si una es mayor que otra.

	- Menor o igual que(<=): compara dos magnitudes, preguntando si una es menor 
	  o igual que la otra magnitud.

	- Mayor o igual que(>=): compara dos magnitudes, preguntando si una es mayor 
	  o igual que la otra magnitud.

*/

public class OperadoresRelacionales{
	public static void main(String[] args) {
		int a=10, b=12;
		//Operador Igual
		System.out.println("¿El valor de a, es el mismo que el de b? "+(a==b));

		//Operador Diferente
		System.out.println("¿El valor de a, es distinto que el de b? "+(a!=b));

		//Menor que 
		System.out.println("¿El valor de a, es menor que el de b? "+(a<b));

		//Mayor que
		System.out.println("¿El valor de a, es mayor que el de b? "+(a>b));

		//Menor o igual que
		System.out.println("¿El valor de a, es menor o igual que el de b? "+(a<=b));

		//Mayor o igual que
		System.out.println("¿El valor de a, es mayor o igual que el de b? "+(a>=b));

	}
}