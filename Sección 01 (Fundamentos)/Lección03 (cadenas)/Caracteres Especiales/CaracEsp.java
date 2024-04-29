//manejo de caracteres especiales
/*
	Como ya se mencionó en el programa anterior Cadena.java, se mencionaron 
	caracteres especiales, los cuales se mostrarán acontinuación. Por lo que solo
	se hará mención de esos caracteres. 

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
public class CaracEsp{
	public static void main(String[] args) {
		
		String nombre="Ana Belem";
		String apellido="Juárez Mendez"; 
		//Tabulador
		System.out.println("Tabulador: "+nombre+"\t"+apellido);
		//Retroceso (backspace)
		System.out.println("Retroceso (backspace): "+nombre+"\b"+apellido);
		//Linea nueva
		System.out.println("Linea nueva: "+nombre+"\n"+apellido);
		/*Retorno de carro: Este caracter especial, toma la cadena que se encuentre
		acontinuacón del mismo y posteriormente la coloca al inicio de la cadena, 
		sustituyendo lo que se encuentre al inicio de la cadena, ejemplo 
						System.out.println("HolaMundo \rSaludos");
		En la salida se tendría:
						Saludosdo
		*/
		System.out.println("Retorno de carro: "+"\r"+nombre+apellido);
		//Comillas simples
		System.out.println("Comillas simples: \'"+nombre+" "+apellido+"\'");
		//Comillas dobles
		System.out.println("Comillas dobles: \""+nombre+" "+apellido+"\"");
		//Diagonal invertida
		System.out.println("Diagonal invertida: \\"+nombre+" "+apellido);
	}						
}