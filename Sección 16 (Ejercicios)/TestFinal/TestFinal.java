//uso de la palabra final 

/*
	se puede pensar en esta palabra como otro modificador de acceso
	La palabra final, se usa para: 

	- Evitar que se modifiquen variables (crea constantes)

		Se recomienda que dichas variables se convienen con la palabra
		static, de esta forma solo se manda a llamar al nombre de la clase
		en donde se encuentra, y no es necesario ques e cree un objeto para 
		acceder a esta variable

			public final static var nombreVariable = valor; 		

	- Evita que se modifique la deficnión de un método desde una subclase

		Si se crea un método final y se hereda, las clases hijas no 
		podrán modificar el comportamiento de esta clase

	- Evia que se creen subclases de una clase final

		public final class NombreClase{ -> esta clase no podrá tener clases hijas 
	
		}
	
	DICHO ESTO LA PALABRA FINAL SE PUEDE USAR PARA CLASES, VARIABLES, MÉTODOS Y OBJETOS
*/

/*
	Cuando un bjeto tiene la palabra final, significa que no se le podrá asignar otra referencia
	sin embargo, sus atributos, SI PODRAN SER MODIFICADOS. 

	Objeto obj1 = new Objeto();
	final Obj2 = obj1 <- INCORRECTO;
*/

import empleado.Empleado;
import empleado.persona.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final Persona sujeto1 = new Persona("Saúl","Hernández",21);
        final Empleado sujeto2 = new Empleado("Roberto","Palacios",50,30000.0f);
        final Empleado sujeto3 = new Empleado("B.B.","King",78);
	sujeto3.setSueldo(80000f);
	sujeto3.setNombre("María");
	sujeto3.setApellido("Rosas");

        System.out.println(sujeto1);
        System.out.println(sujeto2);
	System.out.println(sujeto3);
        
        System.out.println("Empleados registrados: "+Empleado.contador);
    }
}
