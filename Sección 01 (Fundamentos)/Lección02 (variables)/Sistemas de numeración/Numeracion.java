//Sistemas de numeración.
/*
Existen muchos sistemas de numerción además del decimal (el que usamos de toda la vida)
estos sistemas se pueden clasificar gracias a su base. La base indica el número de 
símbolos que contendrá el sistema, por ejemplo, para nuestro sistema decimal, 
es decir sistema base 10, tiene 10 símbolos diferentes (0,1,2,3,4,5,6,7,8,9). Lo mismo
sucede con sistema binario (2 simbolos), sistema octal (8 simbolos), etc.

Pero, cuando en java se declaran estos valores, es necesario hacer cierta notación
especial, excepto cuando se trata de un número decimal.

	int numeroDecimal = 10;
	int numeroOctal = 012; //equivalente a 10 en sistema octal
	int numeroHexadecimal = 0xA; //equivalente a 10 en sistema Hexadecimal
	int numeroBinario = 0b1010; //equivalente a 10 en sistema binario

Sin embargo, cuando se imprimen los valores, se imprime el resultado en número decimal
independientemente del sistema en que se encuentre. 

*/
public class Numeracion{
	public static void main(String[] args) {
		int numeroDecimal = 10;
		int numeroOctal = 012; //equivalente a 10 en sistema decimal
		int numeroHexadecimal = 0xA; //equivalente a 10 en sistema decimal
		int numeroBinario = 0b1010; //equivalente a 10 en sistema binario

		System.out.println("Número decimal: "+numeroDecimal);
		System.out.println("Número octal: "+numeroOctal);
		System.out.println("Número Hexadecimal: "+numeroHexadecimal);
		System.out.println("Número binario: "+numeroBinario);

	}
}
