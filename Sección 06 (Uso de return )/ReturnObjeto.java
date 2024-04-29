//Uso de la palabra return usando objetos

public class ReturnObjeto{
	public static void main(String[] args) {
		Suma objeto1 = crearObjeto();
		System.out.println("El resultado de la suma es: "+objeto1.sumar());
	}

	private static Suma crearObjeto(){
		return new Suma(1,1);
	}
}

class Suma{
	int a, b;

	public Suma(int a, int b){
		this.a=a;
		this.b=b;
	}

	public int sumar(){
		return this.a + this.b;
	}
}