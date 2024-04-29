//Etiquetas

/*
	Una etiqueta se trata de una parte del código, cuando se usan las instrucciones
	break o continue, se reanudan desde la etiqueta. La sintaxis es simple, solamente
	se coloca un nombre cualquiera, seguido de dos puntos, tal como se muestra en
	el siguiente ejemplo.
		
		int i=0;
		nombre_de_etiqueta:
		
		while(true){
			if(i<5){
				System.out.println(i);
				i++;
				continue nombre_de_etiueta;
			}
			else
				break;
		}
	
	En este caso se tiene un ciclo infinito, salvo que este ciclo apesar de ser infinito,
	termina cuando el contador llega a 5. Cuando i es menor a cinco, imprime el valor
	de i, lo aumenta en 1 y gracias a la instrucción cintinue, se sale del ciclo, y lo
	comienza de nuevo desde la etiqueta, nombre_de_etiqueta.
*/

public class Etiquetas{
	public static void main(String[] args) {
		String cadena="Vamos a programar en Java";
		String cadena2="";
		int i=0;
		

		for(i=0;i<cadena.length();i++){
			char a=cadena.charAt(i);

			if(a!=' ' && i!=((cadena.length())-1))
				cadena2+=a;
			
			else if(a!=' ' && i==((cadena.length())-1)){
				cadena2+=a;
				System.out.println(cadena2);
				cadena2="";
			}

			else{
				System.out.println(cadena2);
				cadena2="";
			}

				
		}
		
	}
}