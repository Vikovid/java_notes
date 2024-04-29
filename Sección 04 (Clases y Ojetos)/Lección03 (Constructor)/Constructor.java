//Constructor

/*
	El método constructor, es una sección del código que se encarga de inicializar 
	valores cuando se crea un objeto.

	Cuando un objeto se crea, ocurren 3 cosas:

		- Se asigna memoria para dicho objeto
		- Se inicializan los atributos del objeto
		- Se manda a llamar a los atributos del objeto. 
	
	Características de un método:

		- Este método solo es posible ejecutar al momento de la creación de un objeto.

		- No retornan valores

		- El nombre del constructor, debe ser igual al nombre de la clase que instanciará
	  	  los objetos

		- Puede tener modificador de acceso

		- Puede tener o no aegumentos
	
	La forma de declarar un constructor es la siguiente: 

		NombreClase(argumentos opcional){
	
		}
*/


public class Constructor{
	public static void main(String[] args) {
		//Caso1
		Persona p1 = new Persona();
		System.out.println("CASO 1: Objeto 1");
		System.out.println(p1.nombre+"\n"+p1.edad);

		//Caso2
		Persona1 obj1 = new Persona1("Víctor Olivares",21);
		System.out.println("\nCASO 2: Objeto 2");
		System.out.println(obj1.nombre+"\n"+obj1.edad);		

		//Caso3
		Persona2 prueba1 = new Persona2(); //Se crea un objeto con el constructor vacío
		Persona2 prueba2 = new Persona2("Constructor con parámetros", 23); //Se crea un objeto con el constructor con argumentos

		System.out.println("\nCASO3: Objeto 3");
		System.out.println(prueba1.nombre+"\n"+prueba1.edad);		
		System.out.println(prueba2.nombre+"\n"+prueba2.edad);


	}
}
//Caso1 constructor vacío, el constructor vacío no recibe argumentos
class Persona{
	String nombre;
	int edad;

	public Persona(){
		nombre = "Carlos";
		edad=32;	
	}
}
//Caso2 constructor con argumentos
class Persona1{
	String nombre;
	int edad;

	public Persona1(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
}

/*
	El operador this. en este caso funciona como apuntador, es decir, para este caso
	indica que las variables edad y nombre, no serán sobreescritas, sino que será
	modificado su valor.
*/
//Caso3 más de un constructor para una clase, 

/*
	No hay que olvidar que un constructor, es un método, y como todo método existe
	la sobre carga del mismo que es usar el método con el mismo nombre, pero con
	diferentes argumentos. Para este caso se pretende usar más de un constructor para
	una sola clase.
*/

class Persona2{
	String nombre;
	int edad;

	Persona2(){
		nombre = "Juan Rivera";
		edad = 14;
	}

	Persona2(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
}