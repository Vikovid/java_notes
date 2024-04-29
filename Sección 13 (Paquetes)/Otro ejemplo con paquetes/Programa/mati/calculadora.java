package mati;

public class calculadora{
	public static void suma(int a, int b){
		System.out.println("El resultado de la suma es"+(a+b));
	}

	public static void resta(int a, int b){
		System.out.println("El resultado de la resta es"+(a-b));	
	}

	public static void mult(int a, int b){
		System.out.println("El resultado de la multiplicación es"+(a*b));
	}

	public static void division(int a, int b){
		System.out.println("El resultado de la division es: "+((float)a/(float)b));
	}
}