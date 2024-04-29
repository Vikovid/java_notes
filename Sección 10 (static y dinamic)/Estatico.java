//palabra static en una variable.
/*
	Cada miembro de la clase (método o atributo), será 
	parte de un objeto, cuando este mismo sea creado. 

	ESTO NO SUCEDE ASÍ, SI SE ANTEPONE LA PALABRA static.
	Cuando esto sucede, el miembro pasa a ser parte de la clase. 

	Suponiendo que se tiene una clase y entre sus atributos
	tiene una variable de tipo static, esta varaible tendrá el mismo valor 
	para todos los objetos, y cada vez que sea modificada, LA 
	MODIFICACIÓN AFECTARÁ A TODOS LOS OBJETOS.  

	En el caso de un método estático, para mandarlo a llamar
	no es necesario crear un objeto. somplemente el nombre de la clase
	antepuesto de un punto y el nombre del método estático. 
*/

public class Estatico{
	public static void main(String[] args) {
		Persona p1 = new Persona("Juanito");
		Persona p2 = new Persona("Carlitos");
		/*System.out.println("El nombre de p1 es: "+p1.getNombre());
		System.out.println("El nombre de p2 es: "+p2.getNombre());
		System.out.println("El ID de p2 es: "+p2.getIdPersona());
		System.out.println("El ID de p1 es: "+p1.getIdPersona());
		System.out.println("Número de Personas: "+Persona.getContador());*/

		System.out.println(p1);
	}
}

class Persona{
	private String nombre;
	private String idPersona;
	private static int contadorPersonas = 0;
	
	public Persona(String nombre){
		this.nombre = nombre;
		contadorPersonas++;
		idPersona = "0"+String.valueOf(contadorPersonas);
	}

	public String getNombre(){
		return nombre;
	}

	public static int getContador(){
		return contadorPersonas;
	}

	public String getIdPersona(){
		return idPersona;
	}

	public String toString(){
		return "\n- Nombre: "+nombre+"\n- ID Persona: "+idPersona+"\n- Número de personas: "+contadorPersonas;
	}
}