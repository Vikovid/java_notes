//Lección 03 manejo de cadenas
/*
Una cadena es un tipo particular de objetos, 
sin embargo para crear una cadena, simplemente se usa la palabra String y el nombre
de la cadena, tal como se muestra en el siguiente ejemplo:

	String nueva_cadena;
	String cadena="Hola Mundo";

Como se puede ver las cadenas se pueden inicializar o no,
para inicializar una cadena solo es necesario usar el signo igual, y escribir
el contenido deseado de la cadena entre comillas ("") y el punto y coma para 
finalizar.

----------------------Caracteres especiales----------------------
	\t 		inserta un tabulador
	\b 		inserta un retroceso (backspace)
	\n 		inserta una nueva linea
	\r 		inserta un retorno de carro
	\f 		se mueve a la siguiente página (form feed).Se utiliza para impresoras
			no consolas.
	\'		inserta una comilla simple
	\" 		inserta una comilla doble
	\\		inserta una barra invertida
*/

public class Cadenas{
	public static void main(String[] args) {

		System.out.println("concatenación de cadenas en un argumento println: ");
		String cadena1="Hola";
		String cadena2=" Mundo";
		//Concatena las cadenas
		System.out.println(cadena1+"----"+cadena2);

		System.out.println("\nSuma de variables en un argumento println: ");
		int a=15;
		float b=18.61f;
		//Hace la suma de números
		System.out.println(a+b);

		System.out.println("\nconcatenación de cadenas con numeros");
		//Los números los trata como cadenas, por ello solo concatena cadenas 
		System.out.println(cadena1+a+b);

		System.out.println("\nsuma y luego concatenación:");
		//Si se colocan primero los números, entonces hace la suma, de números 
		//y después la concatenación de cadenas. 
		System.out.println(a+b+" "+cadena1+cadena2);
	}
}

/*
Otra operación que se puede realizar con cadenas en el argumento del método println
es la concatenación de las cadenas, es decir unir cadenas con otras, y simplemente
se trata de introducir las cadenas deseadas ya sean almacenadas en una variable o 
escritas entre comillas, seguido del operador "+", cuando se trata de cadenas,
las concatena, pero cuando se trata e números los suma

Es importante el orden de los tipos de datos cuando se desea concatenar o sumar
por ejemplo, si se tiene en un argumento cadenas y números, y primero se colocan las
cadenas y deṕués los números, entonces, lo que ocurrirá es que concatenará los números
en vez de sumarlos, algo así;
	
	String cadena1="que onda q pez";
	String cadena2="como están prros";
	int a=15;
	float b=18.61f;

	System.out.println(cadena1+cadena2+a+b);

Como resultado se tendrá la concatenación de las cadenas junto con los números, puesto
que las cadenas fueron introducidas antes que los números. Pero cuando se introducen
primero los números y después se introducen las cadenas, entonces se realiza primero
la suma de números y despúes la concatenación de cadenas:
	
	System.out.println(a+b+cadena1+cadena2);

Por tanto la salida se tiene como : 33.61que onda q pezcomo están prros 

*/

//Nota adicional: al declarar una variable float al final se debe añadir un "f"
//								float numero_flotante = 12.122f;
