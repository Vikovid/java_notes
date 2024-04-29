//Paquetes
/*
	Los paquetes se puede pensar que son carpetas, 
	estas carpetas almacenan las clases para una mejor
	gestión. 

	El uso e paquetes también simplifica el uso de clases
	ya que muchas clases tienen el mismo nombre, sin embargo
	los paquetes ayudan a evitar ciertas ambigüedades

	CONVENCIÓN EN NOMBRE DE PAQUETES EN JAVA

	- Todo el nobre debe estar en minúsculas 

	- Los paquetes pueden tener incluidos en sí mismos
	más paquetes, para ello se hace uso del operador .

		paquete1.paquete2.operaciones;

		en este caso se puede ver que el paquete operaciones
		se encuentra dentro del paquete "paquete2", que a su vez
		está dentro de "paquete1".

	PARA IMPORTAR UN PAQUETE (similar a las librerias en c o c++)
	se hace uso de la palabra "import" y acontinuación el nombre del
	paquete. 

	import paquete.*;

	El * indica que se pueden usar las clases de este paquete

	Si se desea usar una clase en específico se sigue la siguiente sintaxis

	import paquete.Clase;

	Si se importan las clases usando *, no significa que
	todas las clases contenidas en este paquete se carguen en memoria,
	solo se cargan en memoria cuando están en uso.
*/

//IMPORT ESTÁTICO
/*
	Básicamente se usa para importar los métodos estáticos de 
	una clase. LA forma de declarar la sintaxis es la siguiente: 

	import static paquete.Clase.metodoEstaticoDeLaClase; 	
*/
import static com.Utileria.Imprimir;

public class Paquetes {
    public static void main(String[] args){
        //Primer forma de llamar una clase de otro paquete
        //com.gm.Utileria.Imprimir("Holamundo");
        
        //Importando la libreria
        Imprimir("HOLA PUTOS");
    }
}
