//Sentencia Switch
/*
La sentencia Switch toma como parámetro una variable que puede llegar a tener distintos
valores, ya sean int, byte, short, char y, en versiones posteriores a jdkv7, datos de
tipo String también. 

La sintaxis es simple:

	switch(Condición){
		case 1:
			instrucciones a ejecutar;
			break;
		case 2:
			instrucciones a ejecutar;
			break;
		.
		.
		.
		case n:a
			instrucciones a ejecutar;
			break;
		default:
			instrucciones a ejecutar;
	}

es importante aclarar que al final de cada case, se coloca la palabra break;
esto en caso de que se cumpla dicho case, salga de la sentencia switch, 
en caso de la sección default, es cuando no se cumplió ningún caso, para este mismo
no es necesario poner un break, ya que el programa en automático reconoce que es 
el final de la sentencia switch;

Es importante definir que cada case cambia con respecto al tipo de dato que se ingrese
por ejemplo

	case 1: //En caso de datos tipo int, short, byte
	case 'd': //En caso de datos tipo char
	case "mensaje": //En caso de datos tipo String

Cabe decir que se pueden anidar los casos (case), es decir que se tengan varios casos
que ejecuten una intrucción, por ejemplo:

	int numero=5;
	
	switch (numero){
		case 5:  case 10: case 11:
			instrucciones;
			break;
		case 12: case 3: case 4:
			instrucciones;
			break;
		case 4:
			instrucciones;
			break;
		default:
			instrucciones;
	}

*/
import java.util.Scanner;

public class SentenciaSwitch{
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		int a;

		System.out.println("Ingrese un número cualquiera: ");
		a=lector.nextInt();

		switch(a){
			case 1:
				System.out.println("El número ingresado fue 1");
			break;

			case 2:
				System.out.println("El número ingresado fue 2");
			break;

			case 3:
				System.out.println("El número ingresado fue 3");
			break;

			case 4:
				System.out.println("El número ingresado fue 4");
			break;
			default:
				System.out.println("El número ingresado está fuera del rango");
		}

	}
}
