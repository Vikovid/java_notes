//Entrada y salida de datos con cuadros de diálogo
/*
	Ya se sabe que se pueden leer datos ingresados por el usuario creando un objeto
	Scanner. sin embargo existe una forma distinta de ingresar datos por medio de 
	un cuadro de texto.

	Primero se importa la biblioteca javax.swing.JOptionPane

	Esta biblioteca no solo sirve para leer datos, también puede mostrar texto
	en un cuadro de diálogo en vez de mostrarlo por consola como se acostumbra.

----Mostrar mensaje en pantalla

	Para mostrar un mensaje se sigue la siguiente sintaxis:

				JOptionPane.showMessageDialog(null,"mensaje");

	de igual manera se pueden agregar caracteres especiales, tales como tabuladores,
	insertar nueva línea de texto, etcétera.

----Lectura de datos
	
	Lo primero que se debe tomar en cuenta, es que la opción JOptionPane, por default
	acepta String, y la sintaxis es la siguiente:

		String nombre_del_tipo_cadena; 
		nombre_del_tipo_cadena = JOptionPane.showInputDialog("Mensaje");

	Como se puede ver en la parte que dice mensaje se trata de un mensaje añadido
	por el usuario para que se pueda ingresar la cadena, por poner un ejemplo, puede
	ser "ingrese una cadena"

	Sin embargo, es posible introducir otro tipo de dato sin importar si este es de 
	tipo String o no, favor de revisar la Lección05 (Conversiones), esto convirtiendo
	datos de tipo String a cualquier otro, tal  como se puede ver acontinuación.
*/
import javax.swing.JOptionPane;

public class Joption{
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Hola \nMundo!");

		String mensaje;
		int a;
		boolean g;
		//lectura de un String 
		mensaje=JOptionPane.showInputDialog("Ingrese un mensaje");
		JOptionPane.showMessageDialog(null,"El mensaje ingresado es: "+mensaje);

		//lectura de un int 
		a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero:"));
		JOptionPane.showMessageDialog(null,"El número ingresado es: "+a);

		//lectura de un boolean
		g=Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese un dato de tipo boolean"));
		JOptionPane.showMessageDialog(null,"El dato ingresado ess: "+g);
	}
}