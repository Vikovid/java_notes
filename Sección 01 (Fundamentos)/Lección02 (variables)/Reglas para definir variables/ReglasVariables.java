//Reglas para definir variables
/*
Para definir un identificador en java es importate el nombre del mismo,
recordar que java es sencible al uso de mayúsculas y minúsculas, por poner un ejemplo

	tipo_dato hola;

los identificadores suelen inicializarse con minúsculas, ya que se puede confundir
con otros tipos de datos como clases, interfaces u objetos. Sin embargo, se suelen
poner más de una palabra en una vaariable y es en este caso que se utiliza la notación
de camello, la cuál consiste en poner la primera palabra en minúsculas, y después
la primera letra de la segunda palabra en mayúscula y el resto de la palabra en minúscula

	tipo_dato holaMundoComoEstan;

también para el identificador se puede inicializar con otros símbolos tales como:
	
	tipo_dato _hola;
	tipo_dato $hola:

sin embargo, no se pueden poner números, no al principio de la variable:
	
	tipo_dato 1hola;	//incorrecto
	tipo_dato hola1;	//correcto

Finalmente, es más que obvio que no es posible utilizar una delas palabras reservadas
de java como identificador.
*/
public class ReglasVariables{
	public static void main(String[] args) {

		int a=10;
		float $=10.5f;
		System.out.println($);	
	}
}
