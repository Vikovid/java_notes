//Extras

/*
	Para los ciclos existen dos instrucciones que alteran su modo de operación. Dichas
	palabras son "continue" y "break", las cuales se explicarán acontinuación.

	- break: cuando en un ciclo se coloca esta instrucción, "rompe" con el ciclo
	  sin importar si cumple o no con las condiciones para ejecutar

	  	for(int i=0;i<10;i++){
			System.out.println(i);
			break;
	  	}

	  Este ciclo imprime un secuencia del 0 al 10, pero como está la instrucción break;
	  por ello, solo imprime el número cero.

	- continue: cuando en un ciclo se encuentra la instrucción continue, ignora todo
	  lo que se encuentre acontinuación y actualiza la condición.

	  	for(int i=0;i<10;i++){
			if(i<7)
				continue;
			System.out.println(i)
	  	}
*/
public class Extras{
	public static void main(String[] args){
		
		System.out.println("Serie 0-10, solo imprime 0 gracias a la instrucción break");
		for(int i=0;i<10;i++){
			System.out.println(i);
			break;
	  	}

	  	System.out.println("\nSerie 0-10, solo imprime 7 gracias a las instrucciones continue y break");
	  	for(int i=0;i<10;i++){
	  		if(i<7)
	  			continue;
			System.out.println(i);
				break;
	  	}		
	}
}