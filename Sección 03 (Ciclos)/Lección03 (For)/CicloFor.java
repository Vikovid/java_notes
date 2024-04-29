//CicloFor
/*
	Este es el caso del ciclo for, y es de la misma manera que los anteriores dos 
	ciclos, ejecutará una instrucción apartir de una condición, si es verdadera, la
	ejecutará, si es falsa, no la ejecutará. La sintaxis es la siguiente;

	for(inicio_del_dato_a_evaluar;condición;actualización_del_dato_a_evaluar){
		instrucciones;
		.
		.
		.
	}

	tomando como ejemplo el código de la lección01, si se desea que este código
	imprima los numeros del 0 al 100, de cinco en cinco, se hace uso del siguiente
	código
*/
public class CicloFor{
	public static void main(String[] args) {
		for(int i=0;i<=100;i+=5)
			System.out.println(i);
	}
}

/*
	como se puede ver, en el código:

	- i=0 es el inicio del dato a evaluar, el cual puede delcararse dentro o fuera
	  del ciclo for.
	
	- i<=100 es la condición, lo que determinará si se ejecuta la instrucción o no

	- i+=5 es la actualización del dato a evaluar, en este caso a a variable i se le
	  suman 5 unidades. 
	
	También se puede notar que la sentencia for, no tiene llaves, esto pasa cuando
	solo se ejecuta una linea de código, cuando esto sucede, se puede, se puede omitir
	las llaves, pero si se ejecuta más de una línea de código, es obligatorio poner 
	llaves. Lo mismo pasa con las sentencias do while, while, if, if else, etc.*/