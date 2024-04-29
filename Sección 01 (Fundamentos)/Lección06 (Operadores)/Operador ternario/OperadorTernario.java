//Operador Ternario
/*

El operador ternario(?:), o también conocido como if lineal, setrata de un operador 
que recibe comomo parámetro un dato de tipo boolean, ya sea true o false, y 
dependiendo del dato que sea recibido devolverá otro tipo de datos. 
Su sintaxis es la siguiente:

	(dato_boolean)? opción1 : opción2;

Cuando dato_boolean es true, devuelve la opción1, cuando es false, devuelve la opción2
cabe aclarar que al igual que los otros operadores, este operador regresa un resultado
el cual puede ser ya sea mostrado en pantalla o guardado en una variable,
sin embardo, si se desea guardar en una variable hay que tener mucha precaución
en que tipo de variable almacena ya que tanto "opción1" como "opción2",  pueden ser
datos de tipos distintos o iguales, es por ello que se recomienda el uso de var, 
tal  como se muestra acontinuación;

	var respuesta = (dato_boolean)? Dato_de_tipo1 : Dato_de_tipo2;

para este caso, no importa que tipo de dato se almacene en la variable respuesta, 
ya que var, deducirá de que tipo de variable se trata.
*/

public class OperadorTernario{
	public static void main(String[] args) {
		int a=5, b=100;
		var nuevo = (a>b) ? "negativo" : 100;
		System.out.println("¿a es mayor que b? "+nuevo);
	}
}