//Operadores Unarios

/*
	- Inversión de signo: Es bastante evidente, simplemente consta de añadir 
	  antes de una variable declarada un signo (positivo o negativo), tal como 
	  se muestra acontinuación:

	  	int a=10;
	  	System.out.println("El valor invertido de a es: "+(-a));

	  Entonces como salida no se tendrá 10, se tendrá -10 ya que al momento de 
	  imprimir la variable, se le aplica el inversor de signo.

	- Inversor lógico (not): este operador es básicamente el mismo que el anterior
	  con excepción de que solo es posible para tipos booleanos, 

	- Incremento: se trata simplemente de incrementar, valga la redundancia, el valor
	  una variable.

	  	int a = 10;
	  	a++; // a=11;

	- Decremento: sigue el mismo principio de la operación incremento, salvo que, 
	  se reduce el valor.
		
		int a = 10;
		a--; // a=9;
*/

public class OperadoresUnarios{
	public static void main(String[] args) {
		System.out.println("Inversor de signo****************************");
		int a=10;
		System.out.println("El valor de a es: "+(-a));

		System.out.println("Inversor lógico******************************");
		boolean uno=true;
		System.out.println("El valor de uno es: "+(!uno));

		System.out.println("Incremento***********************************");
		int b = 2;
		System.out.println("El valor de b es: "+(++b));

		System.out.println("Decremento***********************************");
		int c=10;
		System.out.println("El valor de c es: "+(--c));
	}
}