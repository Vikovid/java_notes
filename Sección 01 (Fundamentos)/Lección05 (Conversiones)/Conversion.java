//Conversion de tipos primitivos
/*
-	parseInt, es un método de la clase Integer, la cual recibe como parámetro
	un dato de tipo String, y retorna un número entero.
	básicamente realiza el primer punto de este programa, que es convertir un dato
	de tipo String en un tipo int.

	Si existe algún caracter que no sea un número en el parámetro de parseInt, 
	No se podrá realizar la conversión, ya que en el argumento solo deben existir
	caracteres que representen números. Lo mismo aplica para parseDouble

-	parseDouble: lo mismo que parseInt, salvo que el valor retornado es de tipo double

Es bastante intuitivo determinar que no es posible convertir un String a un char, 
sin embargo se puede recurrir a algo similar, que es, dado un String devuelva
el primer caracter de ese mismo String, y esto se soluciona de la siguiente añadiendo
un .charAt(0) seguido de la variable donde se encuentre almacenado el String, esto 
es posible de la siguiente manera:

	String a = "Hola";
	System.out.println("La conversion arrojó: "+a.charAt(0));

Pero cuando se desea realizar la conversión de un dato primitivo a un String, 
se usa el método valueOf(), dicho método encontrado en la clase String, recibe como 
parámetro un dato de tipo primitivo (int, char, double, etc.) y regresa un dato
de tipo String.
	
	String valor = String.valueOf(tipo_de_dato_primitivo);

-	Casting, este tipo de conversión se trata de conversiones entre tipos de datos
	primitivos, y esto se logra simplemente declarando los tipos de variables y,
	posteriormete, anteponer entre paréntesis el tipo de dato que se desea convertir, 
	como se muestra en el siguiente ejemplo:

	int a = 2;
	float b = 3.213f;


	como se puede ver, se declararon 2 tipos de datos (int & float), sin embargo
	b puede almacenar a, pero a no puede almacenar b, al menos no sin un casting, y
	la forma de que esto ocurra es de la siguiente 

	a=(int)b;
	System.out.println(a);

	El resultado imprimirá 3 ya que ese es el resultado de convertir 3.213 a un número
	entero


*/
public class Conversion{
	public static void main(String[] args) {
		//conversión de tipo String a tipo int
		int numero = Integer.parseInt("202020");
		System.out.println("La variable: "+numero+"\n\tEs de tipo: "+((Object)numero).getClass().getSimpleName());
		
		//conversión de tipo String a tipo double
		double enigma = Double.parseDouble("3");
		System.out.println("La variable: "+enigma+"\n\tEs de tipo: "+((Object)enigma).getClass().getSimpleName());
		
		//Conversión de tipo String a tipo char
		char a = "Hola".charAt(0);
		System.out.println("La variable: "+a+"\n\tEs de tipo: "+((Object)a).getClass().getSimpleName());

		//Conversión de tipo primitivo a tipo String
		String valor = String.valueOf(/*Puede recibir cualquier dato primitivo*/false);
		System.out.println("La variable: "+valor+"\n\tEs de tipo: "+((Object)valor).getClass().getSimpleName());

		//Casting
		int valor_entero;
		float valor_flotante = 12.2344f;
		valor_entero = (int)valor_flotante;
		System.out.println("La conversion arrojó: "+valor_entero);

	}
}

