// Forma alternativa de un método.
//caso 1 : dos clases en un mismo archivo java

/*
	La forma en que se a estado prgramando es simplemente, generar una clase
	pública y en ella crear el método main. Lo cual no es erroneo, pero, en este
	caso se crearán más de una clase.
*/
import java.util.Scanner;

public class Metodos2{
	public static void main(String[] args) {
	int a,b;
	Scanner lector = new Scanner(System.in);

	System.out.println("Ingrese dos números enteros: ");	
	a=lector.nextInt();
	b=lector.nextInt();

	Matematicas prueba = new Matematicas();

	System.out.println("El resultado de la suma es: "+prueba.suma(a,b));
	System.out.println("El resultado de la resta es: "+prueba.resta(a,b));
	System.out.println("El resultado de la multiplicación es: "+prueba.multiplicacion(a,b));
	System.out.println("El resultado de la división es: "+prueba.division(a,b));

	}
}

class Matematicas{
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

}