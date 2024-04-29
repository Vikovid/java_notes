//Operadores de asignación

/*
Como se indicón en la parte de "Operadores.java" de esta misma lección, se tiene 
una gran variedad de operadores, y en esta sección se mostrarán los operadores de 
asignación:
	- Asignación(=): se trata básicamente de asignarle a una variable el valor de otra variaable 
	    ya existente. 

	- Composición(+=,*=,-=,/=): se trata básicamente de modificar una variable, 
	  usando su mismo valor, es decir, si se tiene una variable a con valor de 5;
	  y se desea aumentar n unidades, en vez de usar la notación a=a+n; se usa el
	  operador de composición +=, por lo que se tiene: a+=n. Solo por poner un 
	  ejemplo, ya que como se mencióno anteriormente, esto funciona con cualquier
	  operador aritmético. 



*/
public class OperadoresAsignacion{
	public static void main(String[] args) {
		int a=10, b;
		//como se puede vaer, la variable a vale 10 y b, no se le ha asignado ninvún valor
		//Operador de asignación
		System.out.println("Operador de asignación**********************");
		b=a;
		System.out.println("b = "+a);
		//Operador de composición:
		System.out.println("Operador de composición (suma)**************");
		a+=5;
		System.out.println("El valor de a, es: "+a);
		
		System.out.println("Operador de composición (resta)*************");
		a-=5;
		System.out.println("El valor de a, es: "+a);

		System.out.println("Operador de composición (multiplicación)****");
		a*=5;
		System.out.println("El valor de a, es: "+a);

		System.out.println("Operador de composición (división)**********");
		a/=5;
		System.out.println("El valor de a, es: "+a);

	}
}