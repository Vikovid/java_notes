//Argumentos Variables
/*
	Es una fomra de mandar un número indeterminado
	de valores como argumentos de una función

	metodo(tipoDato... nombre){
	//ya dentro se comporta como un arreglo
	nombre[0];
	nombre[1];
	.
	.
	.
	nombre[n];
	nombre[]
	}
*/

public class VarArgs{
	public static void main(String[] args) {
		
	}

	private static void imprimirElementos(int... numeros){
		for (int i;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
	}
}