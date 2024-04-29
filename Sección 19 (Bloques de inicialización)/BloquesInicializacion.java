//Bloques de inicializacion 
/*
	Los bloques de inicialización son dos
	estáticos y no estáticos y se usan
	para inicializar variables antes de los
	constructores, 

	- El bloque static se ejecuta solo una vez
	- El bloque  no static se ejecuta cada vez
	que se crea un objeto.
*/

public class BloquesInicializacion{
	private final int idPersona;
	private static int contadorPersonas;
	private final String nombre;	
	static{
		contadorPersonas = 25;
	}
	
	{
		idPersona = ++contadorPersonas;
	}
	
	public BloquesInicializacion(String nombre){
		this.nombre = nombre; 
	}
	
	public static void main(String [] args ){
		BloquesInicializacion n1 = new BloquesInicializacion("eduardo");
		BloquesInicializacion n2 = new BloquesInicializacion("Karla");
		BloquesInicializacion n3 = new BloquesInicializacion("Roberto");


		System.out.println(n1.contadorPersonas);
		System.out.println(n1.idPersona);
		System.out.println(n1.nombre);
		System.out.println();
		
		System.out.println(n2.contadorPersonas);
		System.out.println(n2.idPersona);
		System.out.println(n2.nombre);
		System.out.println();
		
		System.out.println(n3.contadorPersonas);
		System.out.println(n3.idPersona);
		System.out.println(n3.nombre);
		System.out.println();
		
	}
}
