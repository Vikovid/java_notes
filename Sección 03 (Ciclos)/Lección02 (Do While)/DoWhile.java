//Ciclo Do While

/*
	Este ciclo funciona exactamente igual que el ciclo while, solo que este ciclo
	ejecuta la instrucción almenos una vez, sin evaluar primero si el parametro
	recibido es true o false. Su sintaxis es la siguiente:

		do{
			instrucciones;
		}while(condicion);
*/

public class DoWhile{
	public static void main(String[] args) {
		int i=0;
		do{
			System.out.println("hola");
		}while(i>0);
	}
}

/*
	Como se puede ver, en este caso la condición no se cumple, por lo que en un ciclo 
	while no entra en el ciclo, sin embargo, en este caso sí, ya que, como se dijo antes,
	primero ejecuta la instrucción y después verifica si puede continuar o no ejecutando
	la instrucción. 
	
*/