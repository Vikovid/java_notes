//Entrada y salida de datos (Scanner)
/*
	La clase Scanner se trata de una clase que lee los datos ingresados por
	el usuario y los almacena en una variable, por ejemplo, en casos anteriores
	al momento de declarar un String, se inicilizaba con un valor, por ejemplo:
		
		String nombre="Ana Belem, ¿Te casarías conmigo?"

	Sin embargo, cuando se desea introducir el valor de es cadena de forma dinámica
	se hace uso de la clase Scanner, la cual consta de crear un objeto, que almacene 
	los datos introducidos en una variable deseada. La declaración de dicho objeto
	es: 

		Scanner nombre_del_objeto_Scanner = new Scanner(System.in);

	La cual indica que se leerá información de la consola, pero recordar, que para 
	usar esta clase, se debe importar una biblioteca, la cual es:

		import java.util.Scanner;

	Entonces,para usar la clase Scanner, se tinene un ejemplo. Supongamos que se
	delcara un dato de tipo String sin inicializar.

		String nombre;

	Al momento de querer imprimir dicho dato, imprimirá valores extraños, puesto
	que no se le h almacenado nada aún. Entonces se hace uso de la siguiente sintaxis
	para almacenar un valor:

		nombre = nombre_del_objeto_Scanner.nextLine();

	Posteriormente, cuando se ejecute el programa, la consola esperará a que se 
	añada el valor, por lo que es recomendable que se coloque un mensaje que indique
	al usuario que se está esperando un valor de entrada, por sugerir un ejemplo:
		
		System.out.println("Ingrese una cadena: ");
		nombre = nombre_del_objeto_Scanner.nextLine();		

	Es importante decir que este objeto, una vez creado, se puede usar para más de
	una variable, independientemente, si son del mismo tipo, o si son varias, del
	mismo tipo. Salvo que cuando se quieren leer valores de otro tipo, se tienen
	las siguientes sintaxis:

		cadena: nombre_del_objeto_Scanner.nextLine();
		número entero: nombre_del_objeto_Scanner.nextInt();
		flotante: nombre_del_objeto_Scanner.nextFloat();
		double: nombre_del_objeto_Scanner.nextDouble();

	pero para el caso de un caracter, se ocupa una sintaxis un poco diferente:

		caracter: nombre_del_objeto_Scanner.next().charAt(0);

*/

//NOTA IMPORTANTE
/*
	Cuando se ingresa un número entero con el método nextInt() este solo recibe el número,
	no el salto de línea, por tanto, si se usa inmediatamente después el método nextLine()
	para leer una cadena, esta solo leerá un salto de línea. 
	
		Scanner lector = new Scanner(System.in);
		int numero = lector.nextInt();
		String cadena = lector.nextLine();  <- SOLO VA A LEER UN SALTO DE LÍNEA
	
	Para resolver este problema, es necesario, mandar a llamar el método nextLine() antes 
	de leer una cadena. Así como se muestra a continuación: 
		
		Scanner lector = new Scanner(System.in);
		int numero = lector.nextInt();
		----->	lector.nextLine();  <---- 
		String cadena = lector.nextLine();  <--- Ahora si podrá leer la cadena
	
	Esto no aplica si se lee primero la cadena y después el número entero. TAMPOCO APLICA
	CUANDO SE LEE PRIMERO UN ENTERO Y DESPUÉS UN CARACTER.
	
	OTRA FORMA DE EVITAR ESTE PROBLEMA es usando el método next();
		Scanner lector = new Scanner(System.in);
		int numero = lector.nextInt();
		String cadena = lector.next(); <-----------------
	
*/

import java.util.Scanner;

public class EntradaSalida{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		//variables sin inicializar
		String mensaje;
		int numero;
		float valor; 
		double value;
		char letra;

		boolean bool;
		short numerito;
		long numerote;

		//Mensajes que soliciten los valores de las variables:
		System.out.println("Ingrese una cadena: ");
		mensaje = entrada.nextLine();

		System.out.println("Ingrese un número entero: ");
		numero = entrada.nextInt();

		System.out.println("Ingrese un número flotante: ");
		valor = entrada.nextFloat();

		System.out.println("Ingrese un número double: ");
		value = entrada.nextDouble();

		System.out.println("Ingrese un caracter: ");
		letra = entrada.next().charAt(0);



		System.out.println("Ingrese un boolean: ");
		bool = entrada.nextBoolean();

		System.out.println("Ingrese un número short: ");
		numerito = entrada.nextShort();

		System.out.println("Ingrese un número long: ");
		numerote = entrada.nextLong();
		
		//Mostrando resultados
		System.out.println("El mensaje introducido fue: \""+mensaje+"\"");
		System.out.println("El número entero introducido fue: \""+numero+"\"");
		System.out.println("El número flotante introducido fue: \""+valor+"\"");
		System.out.println("El número double introducido fue: \""+value+"\"");
		System.out.println("El caracter introducido fue: \""+letra+"\"");

		System.out.println("El boolean introducido fue: \""+bool+"\"");
		System.out.println("El número short introducido fue: \""+numerito+"\"");
		System.out.println("El número long introducido fue: \""+letra+"\"");

	}
}
