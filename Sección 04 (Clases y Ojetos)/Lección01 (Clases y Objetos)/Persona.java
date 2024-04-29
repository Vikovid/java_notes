//UsoClases

/*
----Clases
	Una clase, se trata de una plantilla, dicho de una forma analógica,
	para crear otros objetos, esta plantilla, tiene un nombre, atributos, métodos,
	que posteriormente el objeto, que es una instancia de la clase, poseera. 

	La estructura de una clase consta, básicamente de la palabra reservada class 
	seguido del nombre de la clase por ejemplo:

		class MiPrimeraClase1{
			tipoDato1 atributo1;
			tipoDato2 atributo2;
			.
			.
			.
			tipoDatoN atributoN;

			método1(argumento);
			.
			.
			.
			métodoN(argumento);
		}
	
	Cabe destacar que los nombres de las clases no pueden comenzar con números y 
	tampoco pueden poseer espacios, sin embargo si pueden poseer guiones bajos y 
	dígitos en cualquier otra parte que no sea el inicio del nombre de la clase.

	Como se puede ver se tiene la clase "MiPrimeraClase1", la cual posee tanto 
	atributos como métodos, los tributos son las características que poseerá el 
	objeto, y los métodos son las acciones que realizará el objeto. 
	Un método es similar a una función en c, también tiene el tipo de retorno de 
	datos, identificador, y argumentos y su declaración es la siguiente:

		tipoDato nombreMétodo(argumentos){
			instrucciones;
			.
			.
			.
		}
	
	Todo programa hecho con java posee por lo menos una clase creada por el usuario, 
	por lo general, posee un método, principalmente el método main, que es el 
	que se ha estado usando en todos los programas anteriores.

	En java, solo se puede tener una clase pública, el nombre del archivo
	con extensión .java, deberá tener el mismo nombre que la clase pública. 

----Objetos
	En la vida real, un objeto es una entidad que puede o no ser tangible, tal 
	como el dinero, las matemáticas, un auto, etcétera. Y todo objeto tiene 
	características fundamentales que los distinguen de otros objetos. 

	En java esas características son llamadas atributos y simplemente basta con 
	declararlas en la clase que creará los objetos con tipos de datos que pueden
	ser String, un float, int, etc. Un objeto no se puede crear si no hay una clase,
	por ello cuando se cresa un nuevo objeto, su sintaxis es la siguiente:

		nombre_de_la_clase identificador = new nombre_de_la_clase(parámetro);

	el parámetro es opcional y el identificador es un nombre ingresado por el usuario
	para identificar el objeto, en caso de que se quieran crear más de un objeto 
	con la misma clase. En el siguiente ejemplo se muestra como se crea un objeto sin 
	parámetros. 


	public class Persona{
		String nombre;
		int edad;
		float peso;
		boolean obesidad;
		
		public static void main(String args[]){
			//Para crear el objeto
			Persona sujeto1 = new Persona();
		}
	}

	Como se puede ver, cada atributo no posee valores, sin embargo se puede
	inicializar los valores, o añadirlos durante la ejecución del programa con 
	ayuda del operador punto, para acceder a cada valor del objeto simplemente
	se coloca el nombre del objeto seguido de un punto y el nombre del atributo:

		identificador_del_objeto.atributo=valor;
	

*/

import java.util.Scanner;

public class Persona{
	//Para este caso la clase Persona funcionará como plantilla para crear objetos
	//que emulen a personas.

	//Atributos
	String nombre;
	int edad;
	float peso;
	boolean obesidad;

	//Métodos
	void mostrarDatos(){
		System.out.println("El nombre es: "+nombre);
		System.out.println("La edad es: "+edad);
		System.out.println("El peso del sujeto es: "+peso);
		System.out.println("¿Padece obesidad?: "+obesidad);
	}

	public static void main(String[] args) {
		//Creación de un nuevo objeto con atributos de la clase persona		
		Persona sujeto1 = new Persona(); 
		/*En caso de que se quieran inicializar los atributos del objeto desde 
		  la codificación del programa, simplemente se usa el operador 
		  de asignación (=)
		*/
		System.out.println("Asignando valores desde el código:");
		sujeto1.nombre="Roberto Carlos";
		sujeto1.edad=41;
		sujeto1.peso=72.1f;
		sujeto1.obesidad=false;
		//Una vez asignado los datos del sujeto, el método implementado en la clase
		//se encargará de imprimir los datos.
		sujeto1.mostrarDatos();  

		System.out.println("\nAsignando valores desde la ejecución del programa");
		//Creando un nuevo objeto
		Persona sujeto2 = new Persona();

		//Creando un objeto de tipo Scanner para leer los datos introducidos
		Scanner lector = new Scanner(System.in);

		sujeto2.nombre=lector.nextLine();
		sujeto2.edad=lector.nextInt();
		sujeto2.peso=lector.nextFloat();
		
		if(sujeto2.peso>90.0)
			sujeto2.obesidad=true;
		else
			sujeto2.obesidad=false;

		sujeto2.mostrarDatos();

	}
}