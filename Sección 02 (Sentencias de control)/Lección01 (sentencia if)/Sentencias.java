//condicións de control

/*
	
Una condición de control, o condición if, se trata básicamente de poner una condición
para saber que instrucciones ejecutar, es decir, se toma un parámetro y si este mismo
cumple con las condiciones que se solicitan, entonces se ejecutan las instrucciones.

Existen 3 casos para la condición if, y para cada una se tiene una sintaxis diferente

Caso1: cuando solo se cumple la se cumple la condición, de igual manera si se recive 
un dato de tipo boolean con valor true, y de no ser así el programa 
continúa su ejecución con normalidad.

	if(condición){
		instrucciones;
		.
		.
		.
	}

Caso2: cuando se cumple la condición, o que ocurra lo opuesto.
	
	if(condición){
		instrucciones_en_caso_de_que_se_cumpla_la_condición;
		.
		.
		.
	}
	else{
		instrucciones_en_caso_de_que_sea_lo_opuesto_a_la_condición;
		.
		.
		.
	}

Caso3: cuando se cumple la condición o se tiene una condición diferente
	
	if(condición){
		instrucciones;
		.
		.
		.
	}
	else if(condición2){
		instrucciones;
		.
		.
		.	
	}
para el caso 3, se pueden tener varias sentencias else if, en caso de que una 
condición pueda tomar varios valores entonces se pueden tomar tantas sentencias else if
como valores pueda tomar la condición. 

*/

public class Sentencias{
	public static void main(String[] args) {
		int a =20;

		if(a%6==0)
			System.out.println("Es divisible entre 6");
		else if(a%3==0)
			System.out.println("Es divisible entre 3");
		else if((a%2==0)&&(a%5==0))
			System.out.println("Es divisible entre 2 y 5");
		
	}
}