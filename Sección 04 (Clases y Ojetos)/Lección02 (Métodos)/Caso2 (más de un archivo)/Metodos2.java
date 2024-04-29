//Caso2 clases en distintos archivos

/*
	Para este caso no se modificarán las clases, más bien se modificaran las 
	estructuras, es decir, en vez de que esten en un solo archivo, estarán, cada clase
	en un archivo. Para compilar es bastante fácil, recordar que se tienen dos archivos
	por lo que la sintaxis es: 

		javac clase1.java clase2.java ... claseN.java

	y para ejecutar simplemente, se coloca la clase que contenga el método main que
	ocupe las demás clases es decir:

		java clase1
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