//Lección 05, Datos primitivos (restricciones)

/*
Cuando se están haciebdo ejercicios de programación, lo más común es utilizar 
variables de tipo int o tipo float, para realizar operaciones matemáticas.
Sn embargo, no solo existen estos dos tipos de datos, anteriormente se habló de 
ello en la sección Variables.java, de la lección02, como son byte, double, short, etc
Pero existén ciertos problemas cuando se usan este tipo de datos, principalmente
por que no se sabe el número de bits o bytes que ocupa dicha variable y por ende
tampoco se sabe el rango de dicho número.
Es por esto mismo que se hacen uso de las siguientes clases, las cuales determinan
los siguientes datos de las variables.

	Número de bits del dato							tipo_dato.SIZE; 
	Número de bytes del dato						tipo_dato.BYTES;
	Valor máximo que puede tomar el dato			tipo_dato.MAX_VALUE;
	Valor mínimo que puede tomar el dato			tipo_dato.MIN_VALUE;

A continuación se muestra una tabla hecha con estas mismas clases
para conocer las restricciones de usar dichas variables.
*/
public class DatosPrim{
	public static void main(String[] args) {

		System.out.println("Tipo de dato entero--------------------------------------");
		System.out.println("\tTamaño en bits: "+Integer.SIZE);
		System.out.println("\tTamaño en bytes: "+Integer.BYTES);
		System.out.println("\tValor máximo: "+Integer.MAX_VALUE);
		System.out.println("\tValor mínimo: "+Integer.MIN_VALUE);

		System.out.println("Tipo de dato byte----------------------------------------");
		System.out.println("\tTamaño en bits: "+Byte.SIZE);
		System.out.println("\tTamaño en bytes: "+Byte.BYTES);
		System.out.println("\tValor máximo: "+Byte.MAX_VALUE);
		System.out.println("\tValor mínimo: "+Byte.MIN_VALUE);

		System.out.println("Tipo de dato short---------------------------------------");
		System.out.println("\tTamaño en bits: "+Short.SIZE);
		System.out.println("\tTamaño en bytes: "+Short.BYTES);
		System.out.println("\tValor máximo: "+Short.MAX_VALUE);
		System.out.println("\tValor mínimo: "+Short.MIN_VALUE);

		System.out.println("Tipo de dato long----------------------------------------");
		System.out.println("\tTamaño en bits: "+Long.SIZE);
		System.out.println("\tTamaño en bytes: "+Long.BYTES);
		System.out.println("\tValor máximo: "+Long.MAX_VALUE);
		System.out.println("\tValor mínimo: "+Long.MIN_VALUE);

		System.out.println("Tipo de dato float---------------------------------------");
		System.out.println("\tTamaño en bits: "+Float.SIZE);
		System.out.println("\tTamaño en bytes: "+Float.BYTES);
		System.out.println("\tValor máximo: "+Float.MAX_VALUE);
		System.out.println("\tValor mínimo: "+Float.MIN_VALUE);

		System.out.println("Tipo de dato double--------------------------------------");
		System.out.println("\tTamaño en bits: "+Double.SIZE);
		System.out.println("\tTamaño en bytes: "+Double.BYTES);
		System.out.println("\tValor máximo: "+Double.MAX_VALUE);
		System.out.println("\tValor mínimo: "+Double.MIN_VALUE);

		System.out.println("Tipo de dato char----------------------------------------");
		System.out.println("\tTamaño en bits: "+Character.SIZE);
		System.out.println("\tTamaño en bytes: "+Character.BYTES);

		System.out.println("Tipo de dato boolean----------------------------------------");
		System.out.println("\tTipo de dato true: "+Boolean.TRUE);
		System.out.println("\tTipo de dato false: "+Boolean.FALSE);
	}
}
/*
Sin embargo cuando se utilizan varaibles del tipo var, en automático se le asigna las restricciones de tipo int, 
y cuando se llegan a sobre pasar los límites de dicha variable, se le asigna el tipo long.
*/
