//CicloWhile
/*
Un ciclo consta de repetir una instrucción siempre y cuando se cumpla una condición
es por ello que la instrucción se puede repetir n veces o infinitas veces, si así
lo permite la condición.

Existen 3 ciclos fundamentales, en esta lección se explicará el ciclo while. Este 
mismo recibe como parámetro un tipo boolean, cuando este es true, ejecuta la 
instrucción, caso contrario, cuando es false, no ejecuta. Su sintaxis es la siguiente:

	while(dato_tipo_boolean){
		instrucciones;
	}
En el siguiente ejemplo, se puede ver un ciclo el cual imprimirá infinitas veces 
"Hola" dado como argumento a, que es un dato de tipo boolean. 
	
	boolean a = false;

	while(a){
		System.out.println("Hola");
	}

Sin embargo esto no significa que todos los ciclos sean infinitos como el anterior
ejemplo, se puede cambiar el valor del parámetro con forme avanza el ciclo tal
como se mostrará en el código a ejecutar.
*/
public class CicloWhile{
	public static void main(String[] args) {
		int i=0;
		while(i<=100){
			System.out.println(i);
			i+=5;
		}
	}
}